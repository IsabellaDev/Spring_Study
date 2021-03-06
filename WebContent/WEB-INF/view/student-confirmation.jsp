<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>

<head>
	<title>Student Confirmation</title>
</head>

<body>

The student is confirmed: ${student.firstName} ${student.lastName}!
The student is from: ${student.country}!
<br><br>
Free passes: ${student.freePasses }. 
<br><br>
Postal Code: ${student.postalCode }.
<br><br>
Course Code: ${student.courseCode }.
<br><br>
The student's favorite language is: ${student.favoriteLanguage}!
<br><br>
The students use operating systems: 
<ul>
	<c:forEach var="temp" items="${student.operatingSystems}">
	<li>${temp}</li>
	</c:forEach>
</ul>
</body>

</html>