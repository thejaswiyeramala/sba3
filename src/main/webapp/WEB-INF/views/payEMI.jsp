<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<script src=https://code.jquery.com/jquery-1.12.4.js></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<meta charset="ISO-8859-1">
<script>
$( function() {
    $.datepicker.setDefaults({
        onClose:function(date, inst){
            $("#selectedDtaeVal").html(date);
        }
    });

    $( "#datepicker" ).datepicker();
});
</script>
<meta charset="ISO-8859-1">
<title>Loans</title>
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
.select{
        background-color:#F2F3F4;
  color: Black;
  padding: 5px;
  font-size: 14px;
  border: 1px solid #F2F3F4;
  cursor: pointer;
        }
.select:hover, .select:focus {
  background-color:#F2F3F4;
}

</style>
<script type="javascript">
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
}
</script>
</head>
<body>
<jsp:include page="header.jsp"/>
<hr/>
<!-- Side Navigation -->
	<div class="sidenav">
		<a href="home">Home</a>
		<a href="acct-summary">Account Summary</a>
		<a href="${pageContext.request.contextPath}/customer/loanManagement">Loans</a>
		<a href="${pageContext.request.contextPath}/customer/cardManagement">Cards Management</a>
		<a href="${pageContext.request.contextPath}/customer/beneficiaryhome">Beneficiaries</a>
		<a href="service-prov">Service Provider</a>
		<a href="login">Logout</a>
	</div>
<!-- Main Content -->
<div class="main">
<div align=center>
<div id="PayLoanEMI" class="tabcontent">
	<div>
	<spring:form action="${pageContext.request.contextPath}/LoanManagement/payEMISave" method="post" modelAttribute="payEMIInputDto">
	<div>
	<spring:label path="pickDate">Pick Date</spring:label>
		<spring:input path="pickDate" type="text" id="datepicker"/>
	</div>
		<br>
		<div>
		<div><spring:label path="cardType">Select Card Type</spring:label>
			<spring:select path="cardType" class="select">
				<spring:option value="0" label="Credit Card"/>
				<spring:option value="1" label="Debit Card"/>
			</spring:select>
			</div>
	</div>
	<br>
	<div>
	<spring:label path="CardNumber">Enter CardNumber</spring:label>
		<spring:input path="CardNumber" type="text" />
		<div><spring:errors path="CardNumber" cssClass="error"/></div>
	</div>
		<br>
	<div>
	<spring:label path="expiryDate">Enter ExpiryDate</spring:label>
		<spring:input path="expiryDate" type="text" id="datepicker"/>
	</div>
		<br>
	<div>
	<spring:label path="CVV">CVV</spring:label>
		<spring:input path="CVV" type="text" />
		<div><spring:errors path="CVV" cssClass="error"/></div>
	</div>
		<br>
	<div>
	<spring:label path="enterAmount">Enter Amount</spring:label>
		<spring:input path="enterAmount" type="text" />
		<div><spring:errors path="enterAmount" cssClass="error"/></div>
	</div>
		<br>
	<div>
		<input type="submit" value="submit" />
		<input type="submit" value="cancel" />
	</div>
        </spring:form>
        </div>
        </div>
        </div>
        </div>
                <hr/>
<jsp:include page="footer.jsp"/>
        
</body>
</html>