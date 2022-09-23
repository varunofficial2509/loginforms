<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    
    
    <title>Registration Page</title>

    <!-- Custom styles for this template -->
    <link href="css/auth.css" rel="stylesheet"/>
</head>

<body>
<div id="tsparticles"></div>
<main class="box">
    <h2>You are not yet registered. Please register here</h2>
    <form action = "registerServlet" method = "post">
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
            <label >Employee Email</label>
            <input type="email" name="email"  
                   required/>
        </div>
        
   
        
        <input type = "submit" value = "save">
    </form>
</main>
</body>
</html>