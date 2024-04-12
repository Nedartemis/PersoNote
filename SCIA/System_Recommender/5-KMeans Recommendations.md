
Unsupervised Learning

Samples of n features

Steps:
- Choose k points (centroids) $\nu_i$, each $\nu_i$ is composed of n random values
- repeat forever: 
	- Assign each sample to its closest centroids (with euclidian distance)
	- Break if none of the sample has changed its centroid
	- Change the position of each centroids by the mean of all their associated points (samples)

C'est forcément la distance euclidienne qui est utilisé car lorsque l'on fait la moyenne pour recalculer la position des centroids, seul cette distance garantit que le centroid devienne bien le centre.

Les clusters petits sont mauvais, il faut les éviter.
Méthodes de résolution : 
- diminuer le k
- changer les points d'initialisations
- supprimer le cluster le plus faible considéré comme des "outliers", du bruit
- changer l'algo de clustering qui n'a pas de hyperparamètre k.

