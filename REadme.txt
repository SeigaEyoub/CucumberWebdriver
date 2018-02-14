1.Selenium Webdriver
Prérequis :
Dans notre exemple nous utilisons Java 8
Un serveur selenium 3.9.1, lien de téléchargement, site officiel  http://www.seleniumhq.org/download/
Librairie de WebDriver Java  3.9.1, lien de téléchargement, site officiel  http://www.seleniumhq.org/download/
FirefoxDriver : http://www.java2s.com/Code/Jar/s/Downloadseleniumfirefoxdriver240jar.htm
 ChromeDriver : https://sites.google.com/a/chromium.org/chromedriver/downloads
Insatallation et Execution de Test avec Selenium:
Importez  les jars de WebDriver à votre projet java.
Dans les variables des environnements de system, ajouter  les paths vers  FirefoxDriver  et  WebDriver 
Lancez le serveur  selenium , example :  java  -jar votre_serveur_selenium.jar 
Exécutez  votre classe de  test 
Pour l’ecriture de test avec WebDriver selenium n’esitez pas de regarder ce tuto : http://www.seleniumeasy.com/selenium-webdriver-tutorials

2.BDD: Behavior Driven Development 
BDD : La spécification en langage naturel devient un test !!!
Langage Gherkin  c’est un langage spécifique créé pour décrire des comportements sans
définir comment les implémenter
Structure de base Gherkin :
Feature :
Background :
Scnario:
Given
And
When
Then
Le principe est simple :
Etant donné  mon application est en  état  X
Quand je réalise un évènement   
Alors je dois avoir mon application en état  Y.
3.Cucumber
Pas vraiment un outil de test
Plutôt un outil de collaboration, qui comprend la syntaxe Gherkin et
peut exécuter les tests sur plein d’implémentation différentes
– Ruby, Java, Groovy, JavaScript, PHP, C++, Selenium, Spring…
Pilotage par maven + Eclipse dans notre Demo.
Pour comprendre  plus le principe de développement avec cucmber/java :
https://cucumber.io/docs/reference/jvm
https://www.tutorialspoint.com/cucumber/cucumber_java_testing.htm


