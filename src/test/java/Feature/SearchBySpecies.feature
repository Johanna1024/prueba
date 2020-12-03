
Feature:  search tree
Scenario: search tree by species
Given 	  the user is on  https://www.arboladourbano.com/
And       the users chooses "En todo el Mapa"
And       the user clicks on "que especie" and chooses "Abutilon grandifolium"
And       the user clicks on "buscar" 
Then 	   the page shows all trees that are "Abutilon grandifolium"