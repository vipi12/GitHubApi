package com.telstra.codechallenge.oldestuseraccount;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;



@ControllerAdvice
@RestController
public class OlderUserResponseEntityExceptionHandler extends ResponseEntityExceptionHandler{

	  @ExceptionHandler(OlderUserNotFoundException.class)
	  public final ResponseEntity<UserAccountError> handleUserNotFoundException(OlderUserNotFoundException ex) {
		  UserAccountError errorDetails = new UserAccountError(new Date(), ex.getMessage(),
				  ex.getMessage());
	    return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
}
	

}