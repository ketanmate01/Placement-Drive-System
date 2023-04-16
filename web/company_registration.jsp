<%-- 
    Document   : company_registration
    Created on : Sep 5, 2018, 4:53:36 AM
    Author     : ADEPT
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>Company_Registration</title>
   <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
<link href="stu_reg_style.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0-rc.2/css/materialize.min.css">
<link href="jas.js" type="text/javascript">
</head>
<style>
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
	
	top:190px;
	margin-left: 55px;
	position: relative;
	width: 20%;
	left: -30%;
}

button[type="reset"]{
	
	top:155px;
	margin-left: 55px;
	position: relative;
	width: 20%;
	left: -8%;
}


  
</style>


<body class="#f9fbe7 lime lighten-5">
<div class="container">
	<h1 id="heading" class="center-align " >Company Registration</h1>
<div class="row">
	<form class="col s12 #212121 grey darken-4" action="CompanyRegistartionServlet" method="post">
		<br>
		<div class="row">
		  
		  <div class="input-field col s3">
			 <i class="material-icons prefix">assignment_ind</i>
			 <input type="number" name="id" required="required">
			 <label class="active" for="id">Register_Id</label>
				
			</div> 
			
		
			<div class="input-field col s7">
			 <i class="material-icons prefix">account_circle</i>
			 <input type="text" name="cname" required="required">
			 <label class="active" for="cname">Comapany Name</label>
				
			</div> 
			
	
		 
		   <div class="input-field col s4">
			 <i class="material-icons prefix">email</i>
			 <input type="email" name="email" required="required">
			 <label class="active" for="email">Email</label>
				
			</div> 
		 
		  
		   <div class="input-field col s6">
			 <i class="material-icons prefix">contacts</i>
			 <input type="tel" name="contact" required="required">
			 <label class="active" for="contact">Contact</label>
				
			</div>
			
			
			<div class="input-field col s7">
			 <i class="material-icons prefix">account_circle</i>
			 <input type="text" name="hrname" required="required">
			 <label class="active" for="hrname">HR Name</label>
				
			</div> 
			
	  
			 <div class="input-field col s6">
			 <i class="material-icons prefix">person</i>
			 <input type="text" name="username" required="required">
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
