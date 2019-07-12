/**
 * 
 */
package org.srinadh.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author cheku
 *
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class StudentNotFoundException extends RuntimeException{
	
	
	public StudentNotFoundException(String Exception) {
		super(Exception);
	}

}
