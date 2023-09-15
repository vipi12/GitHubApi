package com.telstra.codechallenge.oldestuseraccount;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Builder
@NoArgsConstructor
@Getter
@Setter
@JsonPropertyOrder({"timestamp","message","details"})
public class UserAccountError implements Serializable{
	
	private static final long serialVersionUID=190512241950251207L;
	
	@JsonProperty("timestamp")
	 private Date timestamp;
	@JsonProperty("message")
	 private String message;
	@JsonProperty("details")
	 private String details;
	
		
	public UserAccountError(Date timestamp, String message, String details) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.details = details;
	}
		

}
 