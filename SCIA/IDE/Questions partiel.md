
- micro batch -> spark (traiter toutes les données des 50 dernières ms plutôt de une a une) 
- pourquoi c'est bien l’immutabilité
- car le changement de valeur est la source du problème dans le code parallélisé
- une fonction pure, c'est une fonction qu'on peut appeler n fois, elle renverra le même résultat.
- fonction d'ordre supérieur : fonction qui prend comme variable une ou plusieurs autres fonctions et/ou envoie une ou plusieurs fonctions en valeur de retour.
- transformation spark : une série de map (je prends un rdd et je renvoie un autre rdd, même type donc transformation)
- action : fais-moi la somme de tout ce que j'ai dans le rdd donc plus le même type donc action
- c'est quoi :
	- dataframe
	- rdd
	- dataset
	- brocker
	- executer
	- producer
- trois grands composants dans une archi big data: storage, processing et stream,
- dans quel cas le cloud c'est moins cher que le on promise et le cas inverse.
- dans quel cas on choisit le stream ou storage ?
- pourquoi l’immutabilité important pour du calcul distribué : éviter les risques conditions ou éviter l’accès concurrent en écriture - voir collect

# Forme de l'examen

- qcm
- question libre
- scala