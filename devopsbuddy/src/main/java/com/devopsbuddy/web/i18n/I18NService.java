package com.devopsbuddy.web.i18n;

import java.util.Locale;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Service;

import ch.qos.logback.classic.Logger;

@Service
public class I18NService {

	// Application logger
	private static final org.slf4j.Logger LOG = LoggerFactory.getLogger(I18NService.class);
	
	
	@Autowired
	private MessageSource messageSource;
	
	public String getMessage(String messageId) {
		LOG.info("RON - Geef de i18n tekst voor het messageId: {}", messageId);
		Locale locale = LocaleContextHolder.getLocale();
		return getMessage(messageId, locale);
	}
	
	public String getMessage(String messageId, Locale locale) {
		return messageSource.getMessage(messageId, null, locale);
	}
}
