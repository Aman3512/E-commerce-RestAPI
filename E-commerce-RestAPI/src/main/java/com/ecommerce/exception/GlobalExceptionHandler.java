package com.ecommerce.exception;

import java.time.LocalDateTime;

import javax.security.auth.login.LoginException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(ProductException.class)
	public ResponseEntity<ErrorDetails> productExceptionHandler(ProductException pe, WebRequest wr){
		
		ErrorDetails error = new ErrorDetails(pe.getMessage(), wr.getDescription(false), LocalDateTime.now());
		
		return new ResponseEntity<ErrorDetails>(error,HttpStatus.BAD_REQUEST);
	}
	
	
	@ExceptionHandler(OrderException.class)
	public ResponseEntity<ErrorDetails> orderExceptionHandler(OrderException pe, WebRequest wr){
		
		ErrorDetails error = new ErrorDetails(pe.getMessage(), wr.getDescription(false), LocalDateTime.now());
		
		return new ResponseEntity<ErrorDetails>(error,HttpStatus.BAD_REQUEST);
	}
	
	
	@ExceptionHandler(UserException.class)
	public ResponseEntity<ErrorDetails> userExceptionHandler(UserException pe, WebRequest wr){
		
		ErrorDetails error = new ErrorDetails(pe.getMessage(), wr.getDescription(false), LocalDateTime.now());
		
		return new ResponseEntity<ErrorDetails>(error,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(AdminException.class)
	public ResponseEntity<ErrorDetails> adminExceptionHandler(AdminException pe, WebRequest wr){
		
		ErrorDetails error = new ErrorDetails(pe.getMessage(), wr.getDescription(false), LocalDateTime.now());
		
		return new ResponseEntity<ErrorDetails>(error,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(LogoutException.class)
	public ResponseEntity<ErrorDetails> logoutExceptionHandler(LogoutException pe, WebRequest wr){
		
		ErrorDetails error = new ErrorDetails(pe.getMessage(), wr.getDescription(false), LocalDateTime.now());
		
		return new ResponseEntity<ErrorDetails>(error,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(LoginException.class)
	public ResponseEntity<ErrorDetails> loginExceptionHandler(LoginException pe, WebRequest wr){
		
		ErrorDetails error = new ErrorDetails(pe.getMessage(), wr.getDescription(false), LocalDateTime.now());
		
		return new ResponseEntity<ErrorDetails>(error,HttpStatus.BAD_REQUEST);
	}
	
	
	
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<ErrorDetails> methodArgumentNotValidExceptionHandler(MethodArgumentNotValidException pe){
		
		ErrorDetails error = new ErrorDetails("Validation error", pe.getBindingResult().getFieldError().getDefaultMessage() , LocalDateTime.now());
		
		return new ResponseEntity<ErrorDetails>(error,HttpStatus.BAD_REQUEST);
	}
	
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorDetails> exceptionHandler(Exception pe, WebRequest wr){
		
		ErrorDetails error = new ErrorDetails(pe.getMessage(), wr.getDescription(false), LocalDateTime.now());
		
		return new ResponseEntity<ErrorDetails>(error,HttpStatus.BAD_REQUEST);
	}
	
	
}
