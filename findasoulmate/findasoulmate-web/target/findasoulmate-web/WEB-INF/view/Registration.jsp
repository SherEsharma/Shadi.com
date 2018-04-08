<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>



<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@ page isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet"
	href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<link rel="stylesheet" href="/resources/demos/style.css">
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<script>
	$(function() {
		$("#datepicker").datepicker();
	});
</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
	<form:form action="registrationprocess" method="post"
		modelAttribute="registration">
		<table>

			<tr>
				<td>Name</td>
				<td><form:input path="userName" type="text" name="name" /></td>
				<div class="has-error">
						<form:errors path="userName" class="help-inline"/>
					</div>
			</tr>


			<tr>
				<td>Gender</td>
				<td><form:radiobutton path="userGender" name="gender" value="1" />Male
					<form:radiobutton path="userGender" name="gender" value="2" />
					Female
			</tr>
				<form:errors path="userGender" />
			<tr>
				<td>DateOfBirth</td>
				<td><form:input path="userDOB" type="text" id="datepicker"
						name="dateOfBirth" /></td>

			</tr>
<form:errors path="userDOB" />
			<tr>
				<td>Mother Tounge</td>
				<td><form:select path="language.motherTongueId">
						<option disabled selected>Select lanuage</option>

						<c:forEach items="${motherlanguage}" var="motherlanguage">
							
							<form:option value="${motherlanguage.motherTongueId}" label="${motherlanguage.motherTongueName}"/>
							</option>
						</c:forEach>
						
					</form:select></td>

			</tr>
			<tr>
				<td>Religion</td>
				<td><form:select path="religion.religionId">
						<option disabled selected>Select Religion</option>

						<c:forEach items="${religionlist}" var="religionlist">
							
							<option value="${religionlist.religionId}">${religionlist.religionName}
							</option>
						</c:forEach>

				</form:select></td>

			</tr>
			<tr>
				<td>ProfileCreatedBy:</td>
				<td><form:select path="userProfileCreateBy">
						<form:option value="1">Self</form:option>
						<form:option value="2">Son</form:option>
						<form:option value="3">Father</form:option>
						<form:option value="4">Doughter</</form:option>
					<form:option value="5">GrandFather</form:option>
					</form:select></td>

			</tr>
			<tr>
				<td>EmailId</td>
				<td><form:input path="useremail" type="text" name="emailId" /></td>
				<form:errors path="useremail" />
			</tr>
			
			<tr>
				<td>Password</td>
				<td><form:password path="userPassword" name="password" /></td>
				<form:errors path="userPassword"> </form:errors>
			</tr>

			<tr>
				<td>MobileNo</td>
				<td><form:input path="userMobileNumber" type="text" name="mobilenumber" /></td>
			</tr>



			<td><input type="submit" value="submit"></td>

			</tr>

		</table>

	</form:form>

</body>
</html>