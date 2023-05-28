<H1>Contrôle et Projet Programmation Distribuée </H1>
<p>
On souhaite créer un système distribué basé sur les micro-services Cette application devrait
permettre de gérer et d’automatiser le processus des infractions concernant des véhicules
suites à des dépassement de vitesses détectés par des radars automatiques. 
Le système se compose de trois micro-services :
</p>
<p>
  • Le micro-service qui permet de gérer les radars. Chaque radar est défini par son id, sa
   vitesse maximale, des coordonnées : Longitude et Latitude.
</p>
<p>
  • Le micro-service d’immatriculation qui permet de gérer des véhicules appartenant des
   propriétaires. Chaque véhicule appartient à un seul propriétaire. Un propriétaire est
   défini par son id, son nom, sa date de naissance, son email et son email. Un véhicule
   est défini par son id, son numéro de matricule, sa marque, sa puissance fiscale et son modèle.
</p>
<p>
  • Le micro-service qui permet de gérer les infractions. Chaque infraction est définie par
  son id, sa date, le numéro du radar qui a détecté le dépassement, le matricule du
  véhicule, la vitesse du véhicule, la vitesse maximale du radar et le montant de l’infraction.
</p>
<p>
En plus des opérations classiques de consultation et de modifications de données, le système
doit permettre de poster un dépassement de vitesse qui va se traduire par une infraction. En
plus, il doit permettre à un propriétaire de consulter ses infractions.
</p>

<H3>Diagramme de classe global du projet</H3>

<img src="CAPTURES/classe.png">

<H3>Le micro-service Immatriculation</H3>


<h4>Test GRPC</h4>

Get Proprietaire :

<img src="CAPTURES/13.png">

Update Proprietaire : 

 <img src="CAPTURES/12.png">
 
Get Proprietaire By id:

  <img src="CAPTURES/14.png"> 
  
Save Proprietaire :

  <img src="CAPTURES/15.png"> 
  
Get Voitures :
 <img src="CAPTURES/16.png"> 
 
Save Voiture :
 
 <img src="CAPTURES/17.png"> 
 
 Update Voiture :
  
 <img src="CAPTURES/18.png"> 
 
Delete Voiture :
 
 <img src="CAPTURES/19.png"> 

<h4>Test GraphQL </h4>

<img src="CAPTURES/1.png">

<img src="CAPTURES/2.png">

<img src="CAPTURES/3.png">

<img src="CAPTURES/4.png">

<img src="CAPTURES/5.png">

<img src="CAPTURES/6.png">

<h4>Test Rest </h4>

<img src="CAPTURES/7.png">

<img src="CAPTURES/8.png">

<img src="CAPTURES/9.png">

<img src="CAPTURES/10.png">

<img src="CAPTURES/11.png">


<H3>Le micro-service Infractions</H3>

<h4>Test Navigateur </h4>

<img src="CAPTURES/20.png">

Get Infractions :

<img src="CAPTURES/21.png">

Get Infractions By id:

<img src="CAPTURES/22.png">

<h4>Test PostMan </h4>

Get Infractions:

<img src="CAPTURES/23.png">

Save Infraction:

<img src="CAPTURES/24.png">

Update Infraction:

<img src="CAPTURES/25.png">

Delete Infraction:

<img src="CAPTURES/26.png">

<H3>Le micro-service Radar</H3>

<p> Chaque dépassement de vitesse, ce service
devrait consulter le service d’immatriculation pour récupérer les informations sur le
propriétaire du véhicule. Ensuite il fait appel au service Infraction pour générer une
nouvelle infraction. La communication entre les services peut se faire au choix entre
REST, SOAP, GRPC ou GraphQL.</p>

Get Radars

<img src="CAPTURES/27.png">

Get Radars By Id

<img src="CAPTURES/28.png">

<H3>Mettre en place les services techniques de l’architecture micro-service (Gateway,
Eureka Discovery service)</H3>

Gateway 
 
 Get Radars

<img src="CAPTURES/34.png">

Eureka Discovery service

<img src="CAPTURES/33.png">

Frontend avec Angular
 
<img src="CAPTURES/29.png">

<img src="CAPTURES/30.png">
 
<img src="CAPTURES/31.png">
  
<img src="CAPTURES/32.png">









  
  
 




