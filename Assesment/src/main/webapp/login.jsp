<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    
    
    <title>Login Page</title>

    <!-- Custom styles for this template -->
    <link href="css/auth.css" rel="stylesheet"/>
</head>

<body>
<div id="tsparticles"></div>
<main class="box">
    <h2>Login</h2>
    <form action = "loginServlet" method = "post">
        <div class="inputBox">
            <label >Employee ID</label>
            <input type="number" name="empid"  
                   required/>
        </div>
        <div class="inputBox">
            <label >Employee Name</label>
            <input type="text" name="empname" 
                   required/>
        </div>
        
        <div class="inputBox">
            <label>Date</label>
            <input type="date" name="date"  
                   required/>
        </div>
        
        <input type = "submit" value = "Login">
    </form>
</main>
</body>
</html>