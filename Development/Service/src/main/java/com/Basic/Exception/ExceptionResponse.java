package com.Basic.Exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class ExceptionResponse {
	
	
	
	public ExceptionResponse(String string, String string2) {
		// TODO Auto-generated constructor stub
	}
	@NonNull
	private String message;
	
	private String details;
	@NonNull
	private String status;
	

}
