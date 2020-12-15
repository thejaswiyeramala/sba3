<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
 <%@taglib uri="http://www.springframework.org/tags/form" prefix="spring" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Benificiary Page</title>
<style>
	@import url('https://fonts.googleapis.com/css2?family=Rubik&display=swap');
	body {
		background-color:cornsilk;
	}
	
	h2 {
		font-family:'Rubik', sans-serif;
		font-size: 20px;
		color:blue;	
	}
	h3 {
		font-family:'Rubik', sans-serif;
		font-size: 16px;	
	}
		
	p{
		font-family:'Rubik', sans-serif;
		font-size: 14px;
	}
	
	table, th, td {
	  border: 1px solid black;
	  table-layout: fixed;
	  width: 40%; 
	}
	
	.error{
		color:red;
	}
	
	/* Fixed sidenav, full height */
	.sidenav {
	  margin-top:150px;
	  margin-left: 8px;
	
	  font-family: "Lato", sans-serif;
	  height: 60%;
	  width: 200px;
	  position: fixed;
	  z-index: 1;
	  top: 0;
	  left: 0;
	  background-color: #111;
	  overflow-x: hidden;
	  padding-top: 20px;
	}
	
	/* Style the sidenav links and the dropdown button */
	.sidenav a {
	  padding: 6px 8px 6px 16px;
	  text-decoration: none;
	  font-size: 20px;
	  color: #818181;
	  display: block;
	  border: none;
	  background: none;
	  width: 100%;
	  text-align: left;
	  cursor: pointer;
	  outline: none;
	}
	
	/* On mouse-over */
	.sidenav a:hover {
	  color: #f1f1f1;
	}
	
	/* Main content */
	.main {
	  margin-left: 200px; /* Same as the width of the sidenav */
	  font-size: 20px; /* Increased text to enable scrolling */
	  padding: 0px 10px;
	}
	
	/* Some media queries for responsiveness */
	@media screen and (max-height: 450px) {
	  .sidenav {padding-top: 15px;}
	  .sidenav a {font-size: 18px;}
	}
	
	/* Style the main content links */
	.main a {
	  color: darkgreen;
	  text-decoration: none;
	  font-family:'Rubik', sans-serif;
	  font-size: 16px;
	  line-height: 2;
	  font-weight: bold;
	 }
	 
	/* On mouse-over */
	.main a:hover {
	  color: darkblue;
	}

	</style>
</head>
<body>
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
			<spring:form action="${pageContext.request.contextPath}/LoanManagement/detailsSave" method="post" modelAttribute="beneficiaryInputDto">
			<div>
			SelectBank:   
        samebank <spring:radiobutton path="bank" value="samebank"/>  
        otherbank <spring:radiobutton path="bank" value="otherbank"/>  
        <br><br>
        </div>  
	<div>
	<div><spring:label path="AccountNumber">AccountNumber</spring:label></div>
		<div><spring:input path="AccountNumber" type="text" /></div>
		<div><spring:errors path="AccountNumber" cssClass="error"/></div>
	</div>
	<div>
	<div><spring:label path="FirstName">FirstName</spring:label></div>
		<div><spring:input path="FirstName" type="text" /></div>
		<div><spring:errors path="FirstName" cssClass="error"/></div>
	</div>
	<div>
	<div><spring:label path="LastName">LastName</spring:label></div>
		<div><spring:input path="LastName" type="text" /></div>
		<div><spring:errors path="LastName" cssClass="error"/></div>
	</div>
	<div>
	<div><spring:label path="PhoneNumber">PhoneNumber</spring:label></div>
		<div><spring:input path="PhoneNumber" type="text" /></div>
		<div><spring:errors path="PhoneNumber" cssClass="error"/></div>
	</div>
	<div>
	<div><spring:label path="EmailID">EmailID</spring:label></div>
		<div><spring:input path="EmailID" type="text" /></div>
		<div><spring:errors path="EmailID" cssClass="error"/></div>
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