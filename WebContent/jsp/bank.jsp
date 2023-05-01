<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Personal Info Page</title>
</head>
<body>
<center><h1>Bank Info Page</h1></center>
<form:form method="post" modelAttribute="user" action="/UserWeb/addbankdetails.do">
      <table>
          <tr>
				<td><label for="bankName">Select Bank:</label></td>
				<td><div><input type="text" id="Bank" name="bankName" list="banks" /></div></td>
				  <datalist id="banks">
                  <option value="Chase">
                  <option value="BOA">
                  <option value="wellfargo">

                  </datalist>
			</tr>
          <tr>
              <td>SSN:</td>
              <td><form:input path="ssn" /></td>
          </tr>
          
          <tr>
              <td>Account:</td>
              <td><form:input path="account" /></td>
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