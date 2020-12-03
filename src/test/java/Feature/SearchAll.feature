Feature:  Search trees
Scenario: Search for all trees on the entire map
Given 	  the user is on  https://www.arboladourbano.com/
And 	  	the user clicks on "all map"
When      the user clicks search
Then 	  	the page shows a message stating that the search is to wide to pick an specific point