package com.telstra.codechallenge.oldestuseraccount;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;


@ResponseStatus(HttpStatus.NOT_FOUND)
public class OlderUserNotFoundException extends RuntimeException  {
	public OlderUserNotFoundException(String exception) {
		    super(exception);
}


}
