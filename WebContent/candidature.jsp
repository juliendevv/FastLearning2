<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
  <link rel="stylesheet" type="text/css" href="css/styleCandidature.css" />
  <meta charset="utf-8" />
  <title>Formulaire Candidats</title>
</head>
<header>
  <h1>Inscription</h1>
</header>
<body>
<form id = "form" name = "monForm" action="Servlet"  method="get">
<fieldset>
  <Legend>Vos informations</Legend>
  <br><br>
  <label for = "name">Nom</label>  <input type = "text" name = "name" id = "name">
  <br><br>
  <label for = "pnom">Prénom</label> <input type = "text" name = "pnom" id = "pnom">
  <br><br>
  <label for = "email">Adresse Mail</label> <input type = "text" name = "email" id = "email">
  <br><br>
  <label for = "tel">Numéro de téléphone</label> <input type = "text" name = "tel" id = "tel">
  <br><br>
  <label for = "description">Description de votre profil: </label> <input type = "text" name = "description"" id = "description">
  <br><br>
  <label for = "experience">Quel est votre niveau d'expérience ? </label>
  <select class="form-control" id="exampleFormControlSelect1">
      <option>Moins d'un an</option>
      <option>Entre 1 et 3 ans</option>
      <option>Plus de 3 ans</option>
    </select>
  <br><br>
  <label for = "dispo">Sélectionner le/les jours de la semaine où vous êtes disponible:  </label>
  <INPUT type="checkbox" name="choix1" value="1"> Lundi
  <INPUT type="checkbox" name="choix2" value="2"> Mardi
  <INPUT type="checkbox" name="choix3" value="3"> Mercredi
  <INPUT type="checkbox" name="choix4" value="4"> Jeudi
  <INPUT type="checkbox" name="choix5" value="4"> Vendredi
  <INPUT type="checkbox" name="choix6" value="4"> Samedi
  <INPUT type="checkbox" name="choix6" value="4"> Dimanche
  <br><br>
  <label for = "pjointe"> Vous pouvez déposer une pièce jointe ici : </label> <input type = "text" name = "pjointe" id = "pjointe">
  <br><br>
  <label for = "tarif"> Donnez le prix unitaire pour une heure de cours : </label> <input type = "text" name = "tarif" id = "tarif">
  
</fieldset>

<input type = "submit" value = "Envoyer">

</form>

</body>
</html>