
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>Enter Mobile OTP:

<form:form action="mobilenumberverification" method="post" modelAttribute="mobileotp">
<form:input path="mobileOTPConform"  type="text"/>
<form:errors path="mobileOTPConform"/>

<div class="row">
						<div class="form-actions floatRight">
							<input type="submit" value="Verified"
								class="btn btn-primary btn-sm">
						</div>
					</div>
</form:form>
</body>
</html>