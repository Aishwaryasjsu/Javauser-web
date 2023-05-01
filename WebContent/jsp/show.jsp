<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  

<%@include file="home.jsp"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Info Page</title>
</head>

<body>
<center><h1>Update Info Page</h1></center>



<center>
<form:form method="post" modelAttribute="user" action="/UserWeb/update.do">
      <table>
      	<form:input path="email" type="hidden" />
      	
      	  <tr>
              <td>First Name:</td>
              <td><form:input path="firstName" /></td>
          </tr>
          <tr>
              <td>Middle Name:</td>
              <td><form:input path="middleName" /></td>
          </tr>
          
          <tr>
              <td>Last Name:</td>
              <td><form:input path="lastName" /></td>
          </tr>
          
        
  		 	
  		 	<tr>
  		 		<td><form:label path="bankName">Bank Name: </form:label></td>
  		 		<td><form:select path="bankName">
  		 		<form:option value=""/>
   				<form:option value="Bank of America" label = "Bank of America"/>
   				<form:option value="Chase" label = "Chase"/>
    			<form:option value="Wells Fargo" label = "WellsFargo"/>
    			
  				</form:select>
  		 		</td>
  		 	</tr>
  		 	<tr>
  		 		<td><label> Account Num:</label></td>
  		 		<td><form:input path="account"/>
  		 		</td>
  		 	</tr>
  		 	
  		 	<tr>
  		 		<td><label> SSN:</label></td>
  		 		<td><form:input path="ssn"/>
  		 		</td>
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