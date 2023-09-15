package com.telstra.codechallenge.oldestuseraccount;


import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserAccount {

@JsonProperty("id")
private String id;

@JsonProperty("login")
private String login;

@JsonProperty("html_url")
private String html_url;

}

