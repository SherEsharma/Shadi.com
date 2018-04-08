package com.findasoulmate.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.findasoulmate.model.MotherLanguage;
import com.findasoulmate.model.Registration;
import com.findasoulmate.model.Religion;
import com.findasoulmate.model.UserMobileOTP;
import com.findasoulmate.service.MotherLanguageService;
import com.findasoulmate.service.RegistrationService;
import com.findasoulmate.service.ReliginService;
import com.findasoulmate.utils.ConstantURL;

@Controller
public class HomeController {

	@Autowired
	RegistrationService registrationservice;

	@Autowired
	ReliginService religinservice;

	@Autowired
	MotherLanguageService languageservice;

	@RequestMapping(value = "Home", method = RequestMethod.GET)
	public String viewHome(Model model) {
		Religion religion = new Religion();
		MotherLanguage language = new MotherLanguage();
		List<Religion> religionList = religinservice.FatchAllReligion(religion);
		System.out.println("In controller" + religionList);
		List<MotherLanguage> languagelist = languageservice.findAllLangauge(language);
		System.out.println("in controller" + languagelist);
		model.addAttribute("motherlanguage", languagelist);
		model.addAttribute("religionlist", religionList);
		model.addAttribute("registration", new Registration());
	/*	model.addAttribute("otpmassage", "falseotp");*/
		
		
		return ConstantURL.REGISTATION_TEST_URL;
	}

	

	@RequestMapping(value="showregistrationotp", method=RequestMethod.GET)
	public String viewMobileOTP(@ModelAttribute("mobileotp") UserMobileOTP otp){
		return  ConstantURL.REGISTRATION_OTP_URL;
		
	}

	
	@RequestMapping(value = "registrationprocess", method = RequestMethod.POST)
	public String registrationProcess(@Valid @ModelAttribute("registration") Registration registration,
			BindingResult result, Model model) {

		System.out.println(result);
		if (result.hasErrors()) {
			Religion religion = new Religion();
			MotherLanguage language = new MotherLanguage();
			List<Religion> religionList = religinservice.FatchAllReligion(religion);
			System.out.println("In controller" + religionList);
			List<MotherLanguage> languagelist = languageservice.findAllLangauge(language);
			System.out.println("in controller" + languagelist);
			model.addAttribute("motherlanguage", languagelist);
			model.addAttribute("religionlist", religionList);
			/*model.addAttribute("otpmassage", "falseotp");*/
			return ConstantURL.REGISTATION_TEST_URL;
		}
		else{
		
			UserMobileOTP otp = new UserMobileOTP();
		String userMobileNo=registration.getUserMobileNumber();
		System.out.println("userMobileNouserMobileNo"+userMobileNo);
		
		/* here we call mobile number OTP webservice
		 * Temp otp is 12345
		 * And fetch data in int userotp value= sendOTP(userMobileNo);
		 * and also send Email verification Link
		 */
		
		//registration = registrationservice.saveRegistration(registration);
		int userotp=123456;
		otp.setMobileOTP(userotp);
	/*	model.addAttribute("msg", "Entre OPT");*/
		return "redirect:"+ConstantURL.REGISTRATION_OTP_URL;
		
		
		}
	}
	
	
	

	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String viewLoginPage(@ModelAttribute("login") Registration login) {

		return ConstantURL.LOGIN_URL;
	}
	
	@RequestMapping(value = "mobilenumberverification", method = RequestMethod.POST)
	public String verificationOTP(@Valid @ModelAttribute("mobileotp") UserMobileOTP otp,
			BindingResult result, Model model){
		
		System.out.println("result"+result);
		
		if(result.hasErrors()){
			return  ConstantURL.REGISTRATION_OTP_URL;
			
		}
		
		
		return ConstantURL.LOGIN_URL;
		
		
		
	}

}
