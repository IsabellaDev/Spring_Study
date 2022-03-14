<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>

<html>

<head>
<title>Student Registration Form</title>
</head>

<body>
	<form:form action="processForm" modelAttribute="student">
	
	First Name: <form:input path="firstName" />
		<br>
		<br>
	Last Name: <form:input path="lastName" />
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
