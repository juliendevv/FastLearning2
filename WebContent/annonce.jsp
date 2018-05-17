<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Annonce</title>
</head>
<body>
<h1>FastLearning</h1>
	<h2>Déposer une annonce :</h2>
	<form method="post" action="">
	   <p>
	       <label for="titre">Titre :</label>
	       <input type="text" name="titre" id="titre" />
	       </br>
	       </br>
	       <label for="domaine">Domaine/matière :</label>
	       <input type="text" name="domaine" id="domaine" />
	       </br>
	       </br>
	       <label for="details">Détaillez les compétences que vous souhaitez développer, ce que vous voulez travailler :</label>
	       <input type="text" name="details" id="details" />
	       </br>
	       </br>
 		   <label for="date_debut">Date de début :</label>
	       <input type="Date" name="date_debut" id="date_debut" />
	       </br>
	       </br>
 		   <label for="date_fin">Date de fin:</label>
	       <input type="Date" name="date_fin" id="date_fin" />
	   	   </br>
	   	   </br>
	       <label for="nb">Nombre de séances voulues :</label>
	       <input type="number" name="nb" id="nb" />
	       </br>
	   </p>
	</form>
</body>
</html>