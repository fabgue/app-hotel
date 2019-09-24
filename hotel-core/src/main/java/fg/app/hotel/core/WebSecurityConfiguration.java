package fg.app.hotel.core;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override  
    public void configure(HttpSecurity http) throws Exception {
        http  
            .authorizeRequests()
            .antMatchers( "/demo/*").permitAll()
            .anyRequest().authenticated()            
            .antMatchers( "/hotel/*").authenticated()
            //.and().formLogin();  
            .and().httpBasic();
    }  
      
    @Override  
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    	// Spring Security 5 requires specifying the password storage format
        auth
        	.inMemoryAuthentication()  
            .withUser("user")  
            	.password("{noop}password")   
            	.roles("USER")  
            .and()
	        .withUser("admin")  
	    		.password("{noop}admin")  
	    		.roles("ADMIN");
    }  
      	
}
