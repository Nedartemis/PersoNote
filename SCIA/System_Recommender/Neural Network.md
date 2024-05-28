
Fonction d'activation : casser la linéarité, sans ça pareil à une régression logistique.

Feed forward vs recursive vs convolution

x $\in R^n$ 

$R^n --> R^k$


Réduction de dimension
1. PCA --> rotation (comme vu en FTML)
2. t-SNE (coute beaucoup computanionnelement)
3. AUTO Encoder


### Auto Encoder

Réseau de neurones :
- couche en entrée taille n
- k la taille de la couche du milieu
- miroir au niveau des couches
- donc la derniere est de taille n
- on l'entraîne
- on le coupe en deux
- et voila on a un NN qui passe de la dimension n à k


1. 
User --> k dim
Item --> k dim
2. 
produit vectoriel --> probabilité de recommendation
3. 


SGD : nul à chier
Adam : dev 0.8763 - test ?
AdamW : dev 0.8812 - test 0.8921
AdaDelta : nul à chier
Adagrad : nul à chier
Adamax : dev  0.8872 - test 0.8830
Adafactor : se fait strike si patience en dessous de 15