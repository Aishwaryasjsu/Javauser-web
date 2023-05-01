<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Personal Info Page</title>
</head>
<body>
<center><h1>Personal Info Page</h1></center>
<form:form method="post" modelAttribute="user" action="/UserWeb/adduser.do">
      <table>
       <tr>
              <td>Id:</td>
              <td><form:input path="id" /></td>
          </tr>
          <tr>
              <td>EmailId:</td>
              <td><form:input path="email" /></td>
          </tr>
          <tr>
              <td>First Name:</td>
              <td><form:input path="firstName" /></td>
          </tr>
          <tr>
              <td>Last Name:</td>
              <td><form:input path="lastName" /></td>
          </tr>
          
          <tr>
              <td>Middle Name:</td>
              <td><form:input path="middleName" /></td>
          </tr>
          
          <tr>
				<td><label>gender ::</label></td>
				<td><input id="id_male" name="gender" type="radio" value="male">Male</td>
				<td><input id="id_female" name="gender" type="radio"
					value="female">Female</td>
			</tr>
          
          <tr>
              <td colspan="2">
                  <input type="submit" value="Save Changes" />
              </td>
          </tr>
      </table>

</form:form>
</body>
</html>