package com.capgemini.user.service.UserService.payload;



import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ApiResponse {
	private String message;
	private boolean success;
	private HttpStatus status;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public HttpStatus getStatus() {
		return status;
	}
	public void setStatus(HttpStatus status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "ApiResponse [message=" + message + ", success=" + success + ", status=" + status + "]";
	}
	public static ApiResponse builder() {
		// TODO Auto-generated method stub
		return new ApiResponse();
	}
	
}
