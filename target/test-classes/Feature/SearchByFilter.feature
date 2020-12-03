

Feature:  Search Trees
Scenario: Search for all trees by filter
Given 	 	the user is in the home page
And 	    the user chooses "Marcar en el mapa"
And       the user clicks on  "Mostrar filtro"
And       the user clicks on "frutales y medicinales"
When      the user clicks search 
Then 	    the page shows all tree species on the map that are "frutales y medicinales"