package com.jdgamboa.hvalidator.models;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import com.jdgamboa.hvalidator.validators.Username;

public class Calculus {

	@Min(value=50, message="{error.limit.min}")
	@Max(value=500, message="{error.limit.max}")
	@NotNull(message="{error.limit.required}")
	private Integer limit;
	
	@Username(value={"david","victoria","juan","paulina"}, message="{error.username.invalid}")
	@NotNull(message="{error.username.required}")
	private String user;

	public Integer getLimit() {
		return limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}
	
}
