package fg.app.usuarios.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import fg.app.usuarios.service.UsuarioService;


@Component
public class UsuarioValidator implements Validator {

	@Autowired
	private UsuarioService usuarioService;
	
    @Override
    public boolean supports(Class<?> aClass) {
        return UsuarioDto.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
    	UsuarioDto usuarioDto = (UsuarioDto) o;

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "login", "NotEmpty");
        if (usuarioDto.getLogin().length() < 6 || usuarioDto.getLogin().length() > 32) {
            errors.rejectValue("login", "Size.usuarioForm.login");
        }
        if (usuarioService.findByLogin(usuarioDto.getLogin()) != null) {
            errors.rejectValue("login", "Duplicate.usuarioForm.login");
        }

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "clave", "NotEmpty");
        if (usuarioDto.getClave().length() < 8 || usuarioDto.getClave().length() > 32) {
            errors.rejectValue("clave", "Size.usuarioForm.clave");
        }

        if (!usuarioDto.getClave().equals(usuarioDto.getClaveConfirmacion())) {
            errors.rejectValue("claveConfirmacion", "Diff.usuarioForm.claveConfirmacion");
        }
    }
	
}
