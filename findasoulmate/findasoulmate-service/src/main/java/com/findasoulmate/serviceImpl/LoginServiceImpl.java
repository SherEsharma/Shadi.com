package com.findasoulmate.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.findasoulmate.model.Registration;
import com.findasoulmate.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	

	

	
	/*private static final Logger logger = Logger.getLogger(LoginServiceImpl.class);*/
	public Registration findByEmailAndPassword(Registration registration) {
		/*logger.info("-----------welcome------------");*/
		System.out.println(registration.getUseremail());
		System.out.println(registration.getUserPassword());
		
		
		
		Registration regi = null;
		 System.out.println("in service method"+registration);
		return regi;
	
	}
	
}
