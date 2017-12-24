package com.devopsbuddy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

@Configuration
public class i18NConfig {

	
	@Bean
	public ReloadableResourceBundleMessageSource messageSource(){
		ReloadableResourceBundleMessageSource resourceBundleMessageSource = new ReloadableResourceBundleMessageSource();
		resourceBundleMessageSource.setBasename("classpath:i18n/messages");
		
		// check for new messages evenry 30 minutes
		resourceBundleMessageSource.setCacheSeconds(1800);
		return resourceBundleMessageSource;
		
		
	}
	
}
