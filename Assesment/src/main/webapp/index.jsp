<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    
    
    <title>Welcome</title>

    <!-- Custom styles for this template -->
    <link href="css/auth.css" rel="stylesheet"/>
</head>
<style>
h3 {
    margin: 0 0 30px 0;
    padding: 0;
    color: #fff;
    text-align: center;
}

</style>
<body>

<div id="tsparticles"></div>
<main class="box">
    <h2>Hello, ${loggedIn_empname} Welcome to Employee Portal</h2>
    <h3>Please enter your Employee ID to know all your login details</h3>
    <form action = "indexServlet" method = "post"> 
    	<div class="inputBox">
            <center><label >Employee ID</label></center>
            <input type="number" name="empid"  
                   required/>
        </div>
      <center><input type = "submit" value = "Go"></center>
       
        
    </form>
</main>
</body>
</html>