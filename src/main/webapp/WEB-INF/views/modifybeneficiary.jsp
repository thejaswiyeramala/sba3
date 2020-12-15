<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
 <%@taglib uri="http://www.springframework.org/tags/form" prefix="spring" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Modify Benificiary Details</title>
<style>
	@import url('https://fonts.googleapis.com/css2?family=Rubik&display=swap');
	body {
		background-color:cornsilk;
	}
	label {
		font-family:'Rubik', sans-serif;
		font-size: 14px;		
	}
	
	h2 {
		font-family:'Rubik', sans-serif;
		font-size: 20px;	
	}
	
	h3 {
		font-family:'Rubik', sans-serif;
		font-size: 16px;	
	}
	p{
		font-family:'Rubik', sans-serif;
		font-size: 14px;
	}
	button{
		background-color: burlywood;
        color:black;
        border-width: medium;
        padding: 2px 20px;
        border-radius: 4px;
        font-family:'Rubik', sans-serif;
        font-size: 16px;
        font-weight: 500;
        margin: 4px 2px;
        cursor: pointer;
	}
	
	button:hover {
		  background-color: burlywood;
		  color: white;
	}
	
	.error{
		color:red;
	}
</style>
<script>
function openTab(evt, tabName) {
  // Declare all variables
  var i, tabcontent, tablinks;

  // Get all elements with class="tabcontent" and hide them
  tabcontent = document.getElementsByClassName("tabcontent");
  for (i = 0; i < tabcontent.length; i++) {
    tabcontent[i].style.display = "none";
  }

  // Get all elements with class="tablinks" and remove the class "active"
  tablinks = document.getElementsByClassName("tablinks");
  for (i = 0; i < tablinks.length; i++) {
    tablinks[i].className = tablinks[i].className.replace(" active", "");
  }

  // Show the current tab, and add an "active" class to the button that opened the tab
  document.getElementById(tabName).style.display = "block";
  evt.currentTarget.className += " active";
}
</script>
<script>
	function showForm(formName, linkName) {

		document.getElementById(formName).style.display = "block";
		//document.getElementById(linkName).style.display = "none";
	}
</script>
</head>
<body>
<jsp:include page="header.jsp"/>
<hr/>
<div align=center>
	<!-- Beneficiary Links -->
	<div id="Beneficiary" class="tabcontent">
		<h3>Beneficiary</h3>
		<hr />
		<div>
			<spring:form action="${pageContext.request.contextPath}/customer/saveDetails" method="post" modelAttribute="beneficiaryInputDto">
			<div>
	<div><spring:label path="id">id</spring:label></div>
		<div><spring:input path="id" type="text" /></div>
	</div>
	<div>
	<div><spring:label path="AccountNumber">AccountNumber</spring:label></div>
		<div><spring:input path="AccountNumber" type="text" /></div>
	</div>
	<div>
	<div><spring:label path="FirstName">FirstName</spring:label></div>
		<div><spring:input path="FirstName" type="text" /></div>
	</div>
	<div>
	<div><spring:label path="LastName">LastName</spring:label></div>
		<div><spring:input path="LastName" type="text" /></div>
	</div>
	<div>
	<div><spring:label path="PhoneNumber">PhoneNumber</spring:label></div>
		<div><spring:input path="PhoneNumber" type="text" /></div>
	</div>
	<div>
	<div><spring:label path="EmailID">EmailID</spring:label></div>
		<div><spring:input path="EmailID" type="text" /></div>
	</div>
			</br>
	<div>
		<input type="submit" value="Save" />
		<input type="submit" value="cancel" />
	</div>
	</spring:form>
	</div>
	</div>
	</div>
<jsp:include page="footer.jsp"/>	
<hr/>
</body>
</html>