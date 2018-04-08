package com.findasoulmate.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.findasoulmate.model.Registration;
import com.findasoulmate.service.LoginService;
import com.findasoulmate.utils.ConstantAction;
import com.findasoulmate.utils.ConstantMessage;
import com.findasoulmate.utils.ConstantURL;
import com.findasoulmate.utils.IConstant;

@Controller
public class LoginController {

	@Autowired
	private LoginService loginservice;
	
	public static final String REDIRECT = "redirect:/";
	
	@RequestMapping(value="showdashboard", method=RequestMethod.GET)
	public String showDashBoard(){
		return  ConstantURL.SHOW_DASHBOARD_URL;
	}
	
	
	
	@RequestMapping(value="/viewloginpage", method=RequestMethod.POST)
	public String loginProcess(@ModelAttribute("login") Registration registration,Model model,HttpServletRequest request){
		HttpSession session =request.getSession();
	
	Registration loginvalue=loginservice.findByEmailAndPassword(registration);
	System.out.println(loginvalue);
	if(loginvalue!=null){
		
		session.setAttribute("user", loginvalue);
		 return REDIRECT + ConstantURL.SHOW_DASHBOARD_URL;
	}
	model.addAttribute(IConstant.USER_ERROR_MESSAGE, ConstantMessage.INVALID_USERNAME_AND_PASSWORD_MESSAGE);
		 return ConstantURL.LOGIN_URL;
	}
	
	/*
	 * For Forgetpassword
	 * 
	 * 
	 */
	
	/*@RequestMapping(value = ConstantURL.FORGOT_PASSWORD, method = { RequestMethod.GET, RequestMethod.POST })
	public String forgotPassword(@ModelAttribute("Login") Login login, ModelMap model) {
		boolean status = false;
		//status = loginService.findByEmailPassword(login.getEmail());
		if (status) {
			model.addAttribute(IConstant.MESSAGE, ConstantMessage.FORGOT_PASSWORD_SUCCESS_MESSAGE);
		} else {
			model.addAttribute(IConstant.MESSAGE, ConstantMessage.FORGOT_PASSWORD_FAILUR_MESSAGE);
		}
		return IConstant.RE_DIRECT + ConstantURL.HOME_URL;

	}*/

}
