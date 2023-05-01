<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  

<%@include file="home.jsp"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Personal Info Page</title>
</head>

<body>
<center><h1>Get User details</h1></center>

<center>
	<c:if test="${not empty errors}">
	     <p>${errors}</p>
	</c:if>
</center>

<!--Body: delete contact information-->
<center>
<form:form method="post" modelAttribute="user" action="/UserWeb/getuser.do">
      <table>
      	  <tr>
              <td>Email ID:</td>
              <td><form:input path="email" /></td>
          </tr>
          <tr>
              <td colspan="2" align ="center">
                  <input type="submit" value="View">
              </td>
              
              <td colspan="2"><a href="/UserWeb/">Cancel</a>
          </tr>
      </table>
</form:form>
</body>
</html>
	
