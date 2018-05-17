<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/styleAnnonce.css" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Annonce</title>
</head>
<body>
<h1>FastLearning</h1>
	<h2>Déposer une annonce :</h2>
	<form method="post" action="">
	   <p>
	       <label for="nom""> Nom :</label>
	       <input type="text" name="nom" id="nom" />
	       </br>
	       </br>
	       <label for="prenom"">Prenom :</label>
	       <input type="text" name="prenom" id="prenom"" />
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
	       <label for="tarif">Tarif :</label>
	       <input type="text" name="tarif" id="tarif" />
	       </br>
	       </br>
	       <label for="nombre">Combien de cours souhaitez vous recevoir ? </label>
	       <input type="number" name="nombre" id="nombre" />
	       </br>
	       </br>
	       <label for="matiere">Matière que vous souhaitez travailler:</label>
	       <input type="text" name="matiere" id="matiere" />
	       </br>
	       </br>
	       <label for="niveau">Niveau :</label>
	       <INPUT type="checkbox" name="choix1" value="1"> Primaire
		   <INPUT type="checkbox" name="choix2" value="2"> Collège
		   <INPUT type="checkbox" name="choix3" value="3"> Lycée
		   <INPUT type="checkbox" name="choix3" value="3"> Suppérieur
	       </br>
	       </br>
	       <label for="description">Détaillez les compétences que vous souhaitez développer, ce que vous voulez travailler :</label>
	       <input type="text" name="description" id="description" />
	       </br>
	       </br>
	   </p>
<input type = "submit" value = "Envoyer">
	</form>
</body>
</html>