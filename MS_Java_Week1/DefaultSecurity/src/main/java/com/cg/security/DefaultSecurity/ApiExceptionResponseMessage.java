package com.cg.security.DefaultSecurity;

import java.time.LocalDateTime;

public class ApiExceptionResponseMessage {
	
	private String message;
	
	private LocalDateTime dt;
	
	public ApiExceptionResponseMessage(String message, LocalDateTime dt) {
		super();
		this.message = message;
		this.dt = dt;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public LocalDateTime getDt() {
		return dt;
	}

	public void setDt(LocalDateTime dt) {
		this.dt = dt;
	}
	
}
