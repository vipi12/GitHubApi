package com.telstra.codechallenge.oldestuseraccount;

import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController; 




@RestController
public class UserAccountController {
	
	
private static final Logger logger=LoggerFactory.getLogger(UserAccountController.class); 
	
	
	@Autowired
	public UserAccountService userAccountService;
	
		
	@GetMapping(path="/getuserAccounts")
	public ResponseEntity<?> getOlderUsersAccount(@RequestParam Integer noOfAccounts)throws OlderUserNotFoundException{
	  
	 	logger.info("In getOlderUsersAccount controller class method" );
		
		List<UserAccount>accountList=userAccountService.getOlderUsersAccount().getItems();
				
		
		accountList=accountList.stream().limit(noOfAccounts).collect(Collectors.toList());
		if(accountList.isEmpty() ) {
		throw new OlderUserNotFoundException(Constants.No_Of_Accounts+noOfAccounts);
			
		}
		return ResponseEntity.ok(accountList);
			
	
	}
}
