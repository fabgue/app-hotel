package fg.app.hotel.core;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger2Configuration {
	
	@Value("${app.swagger.contact-name}")
	private String contactName;
	
	
	private static final Set<String> DEFAULT_PRODUCES_AND_CONSUMES = 
		new HashSet<String>(Arrays.asList("application/json", "application/xml"));	

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2).select()
            .apis(RequestHandlerSelectors.basePackage("fg.app.hotel.core.api"))
            .paths(PathSelectors.regex("/.*"))
            .build()
            .apiInfo(apiEndPointsInfo())
            .produces(DEFAULT_PRODUCES_AND_CONSUMES)
            .consumes(DEFAULT_PRODUCES_AND_CONSUMES);
    }	
    
    private ApiInfo apiEndPointsInfo() {
        return new ApiInfoBuilder()
        	.title("Hotel API")
            .description("Hotel Management REST API")
            .contact(new Contact(contactName, "www.example.com", "fabgue@ymail.com"))
            .license("Apache 2.0")
            .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html")
            .version("1.0.0")
            .build();
    }    
}
