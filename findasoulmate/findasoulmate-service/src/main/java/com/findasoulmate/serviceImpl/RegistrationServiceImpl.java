package com.findasoulmate.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.findasoulmate.model.Registration;
import com.findasoulmate.repository.RegistrationRepository;
import com.findasoulmate.service.RegistrationService;
import org.springframework.security.crypto.password.PasswordEncoder;

@Service
public class RegistrationServiceImpl implements RegistrationService{
	
	
	@Autowired
	private RegistrationRepository registrationrepo;
	@Autowired
	private PasswordEncoder passwordEncoder;

	public Registration saveRegistration(Registration registration) {
		
	
	/*registration.setPassword(passwordEncoder.encode(registration.getPassword()));*/
		registration=registrationrepo.save(registration);
		return registration;
		

	}

}
