package com.telstra.codechallenge.oldestuseraccount;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import lombok.Getter;
import lombok.Setter;

@Configuration
@Getter
public class OlderUserAccountConfig {
	
private static final Logger logger=LoggerFactory.getLogger(OlderUserAccountConfig.class); 

@Value("${useraccount.base.url}")
private String useraccountURL;

public String getUseraccountURL() {
	return useraccountURL;
}

public void setUseraccountURL(String useraccountURL) {
	this.useraccountURL = useraccountURL;
}


}
