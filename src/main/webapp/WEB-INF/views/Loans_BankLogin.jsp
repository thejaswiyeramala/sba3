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
.error{
		color:red;
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
</head>
<body>
<jsp:include page="header.jsp"/>
<hr/>
<div align=left>
<!-- Tab content -->
<div id="ModifyLoans" class="tabcontent">
<h2>Loans Management</h2>
		<hr />
  <a href="#" id="ModifyLoanslink" onclick="showForm('ModifyLoansform','ModifyLoanslink')">ModifyLoans</a>
	<div>
	<spring:form id="ModifyLoansform" method="post" modelAttribute="Loans"  style="display:none">
	<div>
	<spring:label path="loanID">Enter LoanID</spring:label>
		<spring:input path="loanID" type="text" />
	</div>
	<br>
	<div>
		<input type="submit" value="Save" />
		<input type="submit" value="cancel" />
	</div>
        </spring:form>
        </div>
        </div>
<!-- Tab content -->
        <br/>
        <div id="LoanRequests" class="tabcontent">
  <a href="#" id="LoanRequestslink" onclick="showForm('LoanRequestsform','LoanRequestslink')">LoanRequests</a>
	<div>
	<spring:form id="LoanRequestsform" method="post" modelAttribute="Loans" style="display:none">
	<div>
	<spring:label path="loanID">Enter LoanID</spring:label>
		<spring:input path="loanID" type="text" />
	</div>
	<br>
	<div>
		<input type="submit" value="Save" />
		<input type="submit" value="cancel" />
	</div>
        </spring:form>
        </div>
        </div>
        
   <!-- Tab content -->
   <br/>
<div id="preClosure" class="tabcontent">
  <a href="#" id="preClosurelink" onclick="showForm('preClosureform','preClosurelink')">preClosure</a>
	<div>
	<spring:form id="preClosureform" method="post" modelAttribute="Loans" style="display:none">    
	<div>
	<spring:label path="loanID">Enter LoanID</spring:label>
		<spring:input path="loanID" type="text" />
	</div>
	<br>
	<div>
		<input type="submit" value="Save" />
		<input type="submit" value="cancel" />
	</div>
        </spring:form>
        </div>
        </div>
        </div>
         <hr/>
<jsp:include page="footer.jsp"/>
</body>
</html>