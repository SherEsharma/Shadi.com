package com.findasoulmate.configration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import javax.servlet.ServletRegistration.Dynamic;
import com.findasoulmate.utils.IConstant;

public class AppInitializer implements WebApplicationInitializer {

	public void onStartup(ServletContext servletContext) throws ServletException {
		System.out.println("First");
		AnnotationConfigWebApplicationContext annotationConfigWebApplicationContext = new AnnotationConfigWebApplicationContext();
		annotationConfigWebApplicationContext.register(AppConfig.class);
		servletContext.addListener(new ContextLoaderListener(annotationConfigWebApplicationContext));
		annotationConfigWebApplicationContext.setServletContext(servletContext);
		Dynamic servlet = servletContext.addServlet(IConstant.DISPATCHER_SERVLET_NAME,
				new DispatcherServlet(annotationConfigWebApplicationContext));
		servlet.addMapping("/");
		servlet.setLoadOnStartup(IConstant.INT_ONE);
		servlet.setInitParameter("throwExceptionIfNoHandlerFound", "true");
		
	}

}
