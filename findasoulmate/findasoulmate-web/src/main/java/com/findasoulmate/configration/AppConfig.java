package com.findasoulmate.configration;


import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import com.findasoulmate.utils.ConstantURL;
import com.findasoulmate.utils.IConstant;
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = IConstant.BASE_PACKAGE)
@EnableTransactionManagement
@EnableScheduling
@EnableAsync
public class AppConfig extends WebMvcConfigurerAdapter {
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {

		registry.addResourceHandler(ConstantURL.RESOURCE_HANDLER).addResourceLocations(ConstantURL.RESOURCE_LOCATION);

	}

	@Bean
	public MessageSource messageSource() {
			System.out.println("Message property");
		ResourceBundleMessageSource resourceMessage = new ResourceBundleMessageSource();
		resourceMessage.setBasename(IConstant.MESSAGES);
		
		System.out.println(resourceMessage);
		return resourceMessage;
	}

	@Bean
	public ViewResolver viewResolver() {

		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setViewClass(JstlView.class);
		viewResolver.setPrefix(ConstantURL.JSP_PACKAGE);
		viewResolver.setSuffix(ConstantURL.JSP_EXTANTION);
		return viewResolver;

	}

}
