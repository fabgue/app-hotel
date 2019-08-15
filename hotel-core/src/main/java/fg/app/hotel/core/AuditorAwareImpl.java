package fg.app.hotel.core;

import java.util.Optional;

import org.springframework.data.domain.AuditorAware;

public class AuditorAwareImpl implements AuditorAware<String> {

	@Override
	public Optional<String> getCurrentAuditor() {
		return Optional.of("username");
		// Use below commented code when will use Spring Security
		/*
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		if (authentication == null || !authentication.isAuthenticated()) {
			return null;
		}
		return ((MyUserDetails) authentication.getPrincipal()).getUser(); 
		*/
	}
}
