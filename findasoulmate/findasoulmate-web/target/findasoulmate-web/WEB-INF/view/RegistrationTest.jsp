<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Enrollment Form</title>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<%-- <link href="<c:url value='static/css/bootstrap.css' />" rel="stylesheet"></link>
	<link href="<c:url value='static/css/custom.css' />" rel="stylesheet"></link> --%>
</head>

<body>

	<div class="form-container">

		<h1>Enrollment Form</h1>

		<form:form method="POST" modelAttribute="registration" action="registrationprocess"
			class="form-horizontal">

			<div class="row">
				<div class="form-group col-md-12">
					<label class="col-md-3 control-lable" for="Name">
						Name</label>
					<div class="col-md-7">
						<form:input type="text" path="userName" id="userName"
							class="form-control input-sm" />
						<div class="has-error">
							<form:errors path="userName" class="help-inline" />
						</div>
					</div>
				</div>
			</div>



			<div class="row">
				<div class="form-group col-md-12">
					<label class="col-md-3 control-lable" for="sex">Sex</label>
					<div class="col-md-7" class="form-control input-sm">
						<form:radiobutton path="userGender" value="1" />
						Male
						<form:radiobutton path="userGender" value="2" />
						Female
						<div class="has-error">
							<form:errors path="userGender" class="help-inline" />
						</div>
					</div>
				</div>
			</div>

			<div class="row">
				<div class="form-group col-md-12">
					<label class="col-md-3 control-lable" for="dob">Date of
						birth</label>
					<div class="col-md-7">
						<form:input type="text" path="userDOB" id="dob"
							class="form-control input-sm" />
						<div class="has-error">
							<form:errors path="userDOB" class="help-inline" />
						</div>
					</div>
				</div>
			</div>


		<div class="row">
				<div class="form-group col-md-12">
					<label class="col-md-3 control-lable" for="section">Mother Tounge</label>
					<div class="col-md-7" class="form-control input-sm">
						<form:select path="language.motherTongueId">
						<option disabled selected>Select lanuage</option>

						<c:forEach items="${motherlanguage}" var="motherlanguage">
							
							<form:option value="${motherlanguage.motherTongueId}" label="${motherlanguage.motherTongueName}"/>
							</option>
						</c:forEach>
						
					</form:select>
						<div class="has-error">
							<form:errors path="language.motherTongueId" class="help-inline" />
						</div>
					</div>
				</div>
			</div>


	<div class="row">
				<div class="form-group col-md-12">
					<label class="col-md-3 control-lable" for="section">Religion</label>
					<div class="col-md-7" class="form-control input-sm">
						<form:select path="religion.religionId">
						<option disabled selected>Select Religion</option>

						<c:forEach items="${religionlist}" var="religionlist">
							
							<option value="${religionlist.religionId}">${religionlist.religionName}
							</option>
						</c:forEach>

				</form:select>
						<div class="has-error">
							<form:errors path="religion.religionId" class="help-inline" />
						</div>
					</div>
				</div>
			</div>

			

			<div class="row">
				<div class="form-group col-md-12">
					<label class="col-md-3 control-lable" for="firstAttempt">ProfileCreatedBy</label>
					<div class="col-md-1">
						<form:select path="userProfileCreateBy">
						<form:option value="1">Self</form:option>
						<form:option value="2">Son</form:option>
						<form:option value="3">Father</form:option>
						<form:option value="4">Doughter</</form:option>
					<form:option value="5">GrandFather</form:option>
					</form:select>
						
					</div>
				</div>
			</div>


			



			<div class="row">
				<div class="form-group col-md-12">
					<label class="col-md-3 control-lable" for="email">Email</label>
					<div class="col-md-7">
						<form:input type="text" path="useremail" id="email"
							class="form-control input-sm" />
						<div class="has-error">
							<form:errors path="useremail" class="help-inline" />
						</div>
					</div>
				</div>
			</div>

			<div class="row">
				<div class="form-group col-md-12">
					<label class="col-md-3 control-lable" for="email">Password</label>
					<div class="col-md-7">
						<form:password path="userPassword" id="password"
							class="form-control input-sm" />
						<div class="has-error">
							<form:errors path="userPassword" class="help-inline" />
						</div>
					</div>
				</div>
			</div>


		<div class="row">
				<div class="form-group col-md-12">
					<label class="col-md-3 control-lable" for="Mobile">Mobile</label>
					<div class="col-md-7">
						<form:input type="text" path="userMobileNumber" id="userMobileNumber"
							class="form-control input-sm" />
						<div class="has-error">
							<form:errors path="userMobileNumber" class="help-inline" />
						</div>
					</div>
				</div>
			</div>

			
			<div class="row">
				<div class="form-actions floatRight">
					<input type="submit" value="Register"
						class="btn btn-primary btn-sm">
				</div>
			</div>
		</form:form>
	</div>
</body>
</html>