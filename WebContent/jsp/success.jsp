<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Contact Info Page</title>
</head>
<body>
	<h2>USER DETAILS</h2>
	<p>First Name: 		${user.firstName}</p>
	<p>Middle Name:		${user.lastName}</p>
	<p>Last Name: 		${user.middleName}</p>
	<p>Gender: 			${user.gender}</p>
	<p>Bank Name: 		${user.bankName}</p>
	<p>Account Number: 	${user.account}</p>
	<p>SSN: 			${user.ssn}</p>
	
	
<td colspan="2"><a href="/UserWeb/">Back</a>
	

</body>
</html>