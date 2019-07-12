package org.srinadh.exception;

import java.util.Date;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;



@ControllerAdvice
@RestController
public class CustomeResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(Exception.class)
	public final ResponseEntity<Object> handleallExceptios(Exception e, WebRequest request){
		ExceptionStudent exception = new ExceptionStudent(new Date(), e.getMessage(), request.getDescription(false));
		return new ResponseEntity(exception, HttpStatus.INTERNAL_SERVER_ERROR);		
	}
	
	@ExceptionHandler(StudentNotFoundException.class)
	public final ResponseEntity<Object> handleUserNotFoundException(StudentNotFoundException s, WebRequest request){
		ExceptionStudent exception=new ExceptionStudent(new Date(), s.getMessage(), request.getDescription(false));
		return new ResponseEntity(exception, HttpStatus.NOT_FOUND);
	}
	
	//@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException e,
			  HttpHeaders header, HttpStatus status, WebRequest requst){
		ExceptionStudent exception=new ExceptionStudent(new Date(), "Validation Failed", e.getBindingResult().toString());
		return new ResponseEntity(exception, HttpStatus.BAD_REQUEST);
		
	}

}
