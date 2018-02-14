Feature: Recherche google  
#Scenario Rechercher CGI sur google
Scenario:
    
   Given Je suis sur google
   Then Je devrais voir "Google"  
   When Je saisie "CGI"
   And Je clique sur le bouton de recherche 
   Then Je devrais voir "CGI" 