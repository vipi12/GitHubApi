package com.telstra.codechallenge.oldestuseraccount;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;



@Service
public class UserAccountService {
	
private static final Logger logger=LoggerFactory.getLogger(UserAccountService.class); 
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private OlderUserAccountConfig olderUserAccountConfig;

	public UserAccountList getOlderUsersAccount()throws OlderUserNotFoundException {
		
		logger.info("In getOlderUsersAccount service class method" );
		
		ResponseEntity<UserAccountList>responseEntity=null;
			
		responseEntity=restTemplate.getForEntity(olderUserAccountConfig.getUseraccountURL(), UserAccountList.class);
		return responseEntity.getBody();

}
}


