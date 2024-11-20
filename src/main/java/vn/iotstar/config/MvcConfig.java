package vn.iotstar.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;

@Configuration
public class MvcConfig {
	 @Override
	    public void addViewControllers(ViewControllerRegistry registry) {
	        registry.addViewController("/403").setViewName("403");
	        registry.addViewController("/login").setViewName("login");
	    }
}
