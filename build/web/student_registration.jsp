<%-- 
    Document   : student_registration
    Created on : Sep 5, 2018, 4:54:20 AM
    Author     : ADEPT
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>Student_Registration</title>
   <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
<link href="stu_reg_style.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0-rc.2/css/materialize.min.css">
<link href="jas.js" type="text/javascript">
</head>

<style>
    
    
/* CSS Document */

body{
	background-color:white;
}

#heading{
	margin-top: 5px;
	text-align: center;
	font-size: 22;
}

form{
	margin-top: 14px;
	height: 730px;
}

input{
	font-weight: bold;
	font-size: 20px;
	color: white;
	
}

.material-icons{
	color: red;
	position: relative;
	top: 10px;
}


button{
	
	top:1px;
	margin-left: 55px;
	
	position: relative;
	width: 20%;
	left: 27%;
}




select{
	color: white;
	
}


textarea{
	color: white;
}


    
</style>

<body class="#f9fbe7 lime lighten-5">
<div class="container">
	<h1 id="heading" class="center-align " >Student Registration</h1>
<div class="row">
	<form class="col s12 #212121 grey darken-4" method="post" action="studentregistration">
		<br>
		<div class="row">
		  
		  <div class="input-field col s3">
			 <i class="material-icons prefix">assignment_ind</i>
			 <input type="text" name="id">
			 <label class="active" for="stu_id">Student_Id</label>
				
			</div> 
			
		
			<div class="input-field col s7">
			 <i class="material-icons prefix">account_circle</i>
			 <input type="text" name ="fname">
			 <label class="active" for="firstname">FirstName</label>
				
			</div> 
			
	
			<div class="input-field col s6">
			 <i class="material-icons prefix">account_circle</i>
			 <input type="text" name="lname">
			 <label class="active" for="lastname">LastName</label>
				
			</div> 
                    
                    
			<div class="input-field col s4">
                            <select class="browser-default  #212121 grey darken-4 " ng-model="select.value2" name="gender">
	
    <option>Male</option>
    <option>Female</option>
</select>
	
		 </div> 
		 
		   <div class="input-field col s4">
			 <i class="material-icons prefix">email</i>
			 <input type="email" name="email" required="required">
			 <label class="active" for="email">Email</label>
				
			</div> 
		 
		  
		   <div class="input-field col s6">
			 <i class="material-icons prefix">contacts</i>
			 <input type="tel" name="contact" required="required" >
			 <label class="active" for="contact">Contact</label>
				
			</div>
			
			
			<div class="input-field col s4">
			 <i class="material-icons prefix">location_city</i>
			 <input type="text" name="city" required="required">
			 <label class="active" for="city">City</label>
				
			</div>
		  
		  
        <div class="input-field col s10">
         <i class="material-icons prefix">location_city</i>
          <textarea id="textarea1" class="materialize-textarea"></textarea>
           <input type="text" name="address">
          <label for="textarea1">Address</label>
        </div>
      
		  <div class="input-field col s6">
			 <i class="material-icons prefix">edit</i>
			 <input type="number" name="yop" required="required">
			 <label class="active" for="yop">Year Of Passing</label>
				
			</div> 
	    <div class="input-field col s4">
			 <i class="material-icons prefix">edit</i>
			 <input type="text"  name="aggrigate"required="required">
			 <label class="active" for="aggregate">Aggregate(%)</label>
				
			</div> 
		    
		    <div class="input-field col s6">
			 <i class="material-icons prefix">edit</i>
			 <input type="text" name="department"required="required">
			 <label class="active" for="department">Department</label>
				
			</div> 
			
			 <div class="input-field col s4">
			 <i class="material-icons prefix">edit</i>
			 <input type="text" name="hsc_percent"required="required">
			 <label class="active" for="hsc">HSC(%)</label>
				
			</div> 
		    
			
			
		  
			  
			 <div class="input-field col s6">
			 <i class="material-icons prefix">person</i>
			 <input type="text"  name="username" required="required">
			 <label class="active" for="username">UserName</label>
				
			</div> 
					
			  <div class="input-field col s4">
			 <i class="material-icons prefix">edit</i>
			 <input type="password" name="password" required="required">
			 <label class="active" for="password">Password</label>
				
			</div> 
				<button class="btn red z-depth-5 center-align">Register</button>
				<button type="reset" class="btn red z-depth-5 center-align">Reset</button>
				
				
			</div> 
		</div>
		
	</form>
</div>
	
</div>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0-rc.2/js/materialize.min.js"></script>
</body>
</html>
