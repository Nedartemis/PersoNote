---
cards-deck: IDE
---
MOC: [[$INFORMATIQUE]] [[2 Casquettes/ING2/SCIA/SCIA]]
Source :
Date : 2024-02-24
***
Storage ::: Le stockage dans le contexte des Big Data est une composante distribuée principalement utilisé pour les données volumineuses. Pour les données moins volumineuse avec un flux important il est conseillé d'utiliser des [[Stream]].
# Solution de stockage
## Bases de données distribué

consistance ::: tout les noeud on la même donnée ( lent )
availability ::: distribute la donnée rapidement (donnée entre deux noeud peut être différentes)
partition tolérance ::: SI problème de réseau entre les nœuds, le système rester opérationnel.

Théorème CAP #card 
Impossible de garantir simultanément le 3(consistance, abailability, partiton tolérance) propriété sachant qu'on veut toujours la partition tolérance on peut avoir:
- AP : different noeud qui peuvent avoir pour la meme donnée deux valeur diff (facebook)
- CP : préférer attendre et être sur que tout est bon (transaction bancaire)

## bases de données noSQL

4 types de bases de données noSQL: #card
- base orienté colonne : Fonctionnement inverse de SQL, pratique pour l'analytique (exemple: age moyen des étudiants). utilise des clés index ou partitionnement(clé sur des noeud).
- base clé valeur (htable)
- base document: arborescence
- base orienté graphe : utilisé pour les reseaux sociaux

## data lake

Data lake ::: stockage distribué pour des données volumineuses permettant la lecture et l'écriture à plusieurs endroits tout en ajoutant de la fiabilité. 

On l'utilise :: Pour stoker de la data en attente d'analyse. 

Il ne faut jamais mettre de :: petite donné et pas de json et xml car data lake coupe la données.

data lake technical architecture :: traitement de donné bronze/silver/gold (voir graphe slide)