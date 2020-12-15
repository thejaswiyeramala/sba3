<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>
<!DOCTYPE html>
<html>
<head>
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
<body><title>Insert title here</title>
</head>
<body>
<jsp:include page="header.jsp"/>
<h1>Beneficiary Details Added successfully</h1>
<hr/>
<h2>Profile info</h2>
<h3>firstName : ${beneficiaryInputDto.firstName}</h3>
<h3>lastName : ${beneficiaryInputDto.lastName}</h3>
<h3>phoneNumber : ${beneficiaryInputDto.phoneNumber}</h3>
<h3>EmailID : ${beneficiaryInputDto.emailID}</h3>
<h3>AccountNumber : ${beneficiaryInputDto.accountNumber}</h3>
<jsp:include page="footer.jsp"/>
</body>
</html>