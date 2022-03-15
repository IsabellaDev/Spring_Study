<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>

<html>

<head>
<title>Student Registration Form</title>

<style>
.error {
	color: red
}
</style>
</head>

<body>
	<i>Fill out the below form. Asterisk(*) means it is required. </i>
	<form:form action="processForm" modelAttribute="student">
	
	First Name: <form:input path="firstName" />
		<br>
		<br>
	Last Name(*): <form:input path="lastName" />
		<form:errors path="lastName" cssClass="error" />
		<br>
		<br>
		
	Free passes(*): <form:input path="freePasses" />
		<form:errors path="freePasses" class="error" />
		<br>
		<br>
		
	Postal Code: <form:input path="postalCode" />
		<form:errors path="postalCode" class="error" />
		<br>
		<br>
		
	Course Code: <form:input path="courseCode" />
		<form:errors path="courseCode" class="error" />
		<br>
		<br>	
		
	Country: <form:select path="country">
			<!--<form:option value="Brazil" label="Brazil" />
			<form:option value="Canada" label="Canada" />
			<form:option value="France" label="France" />
			<form:option value="Germany" label="Germany" />-->

			<form:options items="${student.countryOptions}" />
		</form:select>
		<br>
		<br>
				
	Favorite programming language: <br>
		Java <form:radiobutton path="favoriteLanguage" value="Java" />
		Python <form:radiobutton path="favoriteLanguage" value="Python" />	
		Ruby <form:radiobutton path="favoriteLanguage" value="Ruby" />	
		JavaScript <form:radiobutton path="favoriteLanguage"
			value="JavaScript" />	
		C++ <form:radiobutton path="favoriteLanguage" value="C++" />

		<br>
		<br>
	Operation Systems: 
		Linux <form:checkbox path="operatingSystems" value="Linux" />
		Mac OS <form:checkbox path="operatingSystems" value="Mac OS" />
		MS Windows <form:checkbox path="operatingSystems" value="MS Windows" />

		<br>
		<br>
		<input type="submit" value="Submit" />
		<br>
		<br>

	</form:form>
</body>

</html>
