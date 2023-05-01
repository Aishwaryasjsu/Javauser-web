<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  

<%@include file="home.jsp"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Details</title>
</head>

<body>
<center><h1>Update Details Page</h1></center>



<center>
<form:form method="post" modelAttribute="user" action="/UserWeb/showuser.do">
      <table>
      	  <tr>
              <td>Email ID:</td>
              <td><form:input path="email" /></td>
          </tr>
          <tr>
              <td colspan="2" align ="center">
                  <input type="submit" value="update"></a>
              </td>
              
              <td colspan="2"><a href="/UserWeb/">Cancel</a>
          </tr>
      </table>
       </center>

</form:form>
</body>
</html>