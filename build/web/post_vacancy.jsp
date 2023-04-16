<%-- 
    Document   : post_vacancy
    Created on : Sep 5, 2018, 7:19:24 AM
    Author     : ADEPT
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>Post_Vacany</title>
   <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
<link href="stu_reg_style.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0-rc.2/css/materialize.min.css">


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
	height: 490px;
}

input{
	font-weight: bold;
	font-size: 20px;
	color: white;
	
}

.material-icons{
	color: orangered;
	position: relative;
	top: 10px;
}


button{
	
	top:50px;
	margin-left: 565px;
	position: relative;
	width: 20%;
	left: -35%;
}

button[type="reset"]{
	
	top:15px;
	margin-left: 655px;
	position: relative;
	width: 20%;
	left: -10%;
}





    
</style>

<body class="#f9fbe7 lime lighten-5">
<div class="container">
	<h1 id="heading" class="center-align " >Post Job</h1>
<div class="row">
	<form class="col s12 #212121 grey darken-4" action="post_job" method ="post">
		<br>
		<div class="row">
                    
                    
                     <div class="input-field col s7">
			 <i class="material-icons prefix">person</i>
			 <input type="text" name="id" required="required">
			 <label class="active" for="companyname">Company Register_id</label>
				
		</div>
		  
		 <div class="input-field col s6">
			 <i class="material-icons prefix">person</i>
			 <input type="text" name="c_name" required="required">
			 <label class="active" for="companyname">Company Name</label>
				
		</div>
			
		
			<div class="input-field col s5">
			 <i class="material-icons prefix">account_circle</i>
			 <input type="text" name="j_profile" required="required">
			 <label class="active" for="jobprofile">Job Profile</label>
				
			</div> 
			   <div class="input-field col s6">
			 <i class="material-icons prefix">edit</i>
			 <input type="text" name="salary" required="required">
			 <label class="active" for="salary">Salary</label>
				
			</div>
			
	
		 
		   <div class="input-field col s4">
			 <i class="material-icons prefix">email</i>
			 <input type="email"name="email" required="required">
			 <label class="active" for="email">Email</label>
				
			</div> 
		 
		  
		
			
			<div class="input-field col s3">
			 <i class="material-icons prefix">edit</i>
			 <input type="text" name="hsc" required="required">
			 <label class="active" for="eligibility">HSC(%)</label>
				
			</div> 
			
			<div class="input-field col s3">
			 <i class="material-icons prefix">edit</i>
			 <input type="text" name="grade" required="required">
			 <label class="active" for="eligibility">Grades</label>
				
			</div>
			
	  <div class="input-field col s4">
			 <i class="material-icons prefix">edit</i>
			 <input type="text" name="day" required="required">
			 <label class="active" for="eligibility">Date</label>
				
			</div><div class="input-field col s3">
			 <i class="material-icons prefix">edit</i>
			 <input type="text" name="time" required="required">
			 <label class="active" for="eligibility">Time</label>
				
			</div>
			
			<div class="input-field col s6	">
			 <i class="material-icons prefix">edit</i>
			 <input type="text" name="venue" required="required">
			 <label class="active" for="eligibility">Venue</label>
				
			</div>
			  
					
			
				<button class="btn red z-depth-5 center-align">Post</button>
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
