<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>RestitutionInscription</title>
</head>
<body>
	<h1>FastLearning</h1>
	<h2>Affichage des données de l'inscription</h2>
	<form method="post" action="">
	   
	      <jsp:useBean id="test" class="projetweb.Inscription" scope="request" >
	
		</jsp:useBean>
		<p> Votre inscription a bien été prise en compte 
		</br>
	    </br>
	    Votre nom : 
		<jsp:getProperty name="test" property = "nom"/>
	    </br>
	    Votre prenom :
		<jsp:getProperty name="test" property = "prenom"/> </p>
	      
	   
	</form>
</body>
</html>