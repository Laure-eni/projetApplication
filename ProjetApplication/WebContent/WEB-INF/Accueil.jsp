<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="content-type" content="text/html;charset=UTF-8 ">
<title>Accueil1</title>


</head>
<style type = "text/css">
<%@include file = "Accueil.css"%></style>

<body>

<h1>Accueil</h1>

<div class="container">
        <div class="lien"><button class="btnLien" onclick="window.location.href = '/ProjetApplication/Connexion';">Connexion</button></div><br>

        <div class="lien"><button class="btnLien"  onclick="window.location.href = '/ProjetApplication/Inscription';">Incription</button></div>

</div><br>

<br><div class="titre"><h2><img src="https://fontmeme.com/permalink/210111/4f4d71a720599638056263ab5eae5402.png" alt="cursive-fonts" border="0"></h2></div>


<div class="paragraphe"><p class="para" id="P">
Bienvenue sur notre site d'enchères pour l'association " les objets sont nos amis". Ici, nous proposons de doonner une seconde vie aux objets en facilitant les échanges. 
Encourager la réutilisation des objets et promouvoir des échanges non commerciaux. 
De nombreux objets sont jetés bien qu’étant encore en bon état de fonctionnement par manque d’un réseau d’échange. 
Nous proposons une solution qui permettrait l’acquisition de matériels de seconde main sans frais fonctionnant avec des Credits. Vous pouvez vous inscrire gratuitement, nous offrons 50 crédits à tout les nouveaux inscrits !

</p></div>

<div class="conteneur"><h3>Bonnes enchères !</h3>
       

<label class="label" for="site-search">Chercher une enchère:</label><br>
  
                   <br> <select class="categories" size="1" >
							<optgroup class="categories" label="Catégories">
								<option>Vêtements</option>
								<option>Ameublement</option>
								<option>Informatique</option>
								<option>Sport et Loisirs</option>
							</optgroup>	
		          	</select><br>
                
<br><input class="recherche" type="search" id="site-search" name="q"
       aria-label="Search through site content" placeholder="Rechercher sur le site…">

           

<button class="btn">go !</button><br><br></div>



</body>
<footer><div class="img"><img src="https://fontmeme.com/permalink/210112/cc6751324b3c09af27dfdaad555f1322.png" alt="cursive-fonts" border="0"></div></footer>
</html>