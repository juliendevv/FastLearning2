<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
  <link rel="stylesheet" type="text/css" href="css/styleInscription.css" />
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
  <label for = "DateN">Date de Naissance</label> <input type = "date" name = "DateN" id = "DateN">

  <br><br>
  <label for = "email">Adresse Mail</label> <input type = "text" name = "email" id = "email">
  <br><br>
  <label for = "tel">Numéro de téléphone</label> <input type = "text" name = "tel" id = "tel">
  <br><br>
  <label for = "pseudo">Pseudo</label> <input type = "text" name = "pseudo" id = "pseudo">
  <br><br>
  <label for = "motdepasse">Mot de passe</label> <input type = "text" name = "motdepasse" id = "motdepasse">
</fieldset>
<input type = "submit" value = "Envoyer">
</form>
</body>
</html>