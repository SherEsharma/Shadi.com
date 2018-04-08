package com.findasoulmate.service;

import com.findasoulmate.model.Registration;

public interface LoginService {
	
	Registration findByEmailAndPassword(Registration registration);
	

}
