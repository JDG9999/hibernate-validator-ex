package com.jdgamboa.hvalidator.validators;

import java.util.Arrays;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UsernameValidator 
	implements ConstraintValidator<Username, String> {

	private String[] allowedUsernames;
	
	public void initialize(Username arg0) {
		allowedUsernames = arg0.value();
	}
	
	public boolean isValid(
			String content, 
			ConstraintValidatorContext arg1) {
		boolean result;
		if (content != null) {
			String contentFormat = content.toLowerCase().trim();
			result = Arrays.asList(allowedUsernames).contains(contentFormat);
		} else {
			result = true;
		}
		return result;
	}

}
