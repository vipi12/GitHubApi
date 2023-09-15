package com.telstra.codechallenge.oldestuseraccount;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserAccountList {
	
	@JsonProperty("statusCode")
	private String	statusCode;
	
	@JsonProperty("success")
	private String success;
	
		
	@JsonProperty("items")
	public List<UserAccount> items;


	public List<UserAccount> getItems() {
		return items;
	}


	public void setItems(List<UserAccount> items) {
		this.items = items;
	}
	
	

	}
