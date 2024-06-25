---
cards-deck: IDE
---
MOC: [[$INFORMATIQUE]] [[2 Casquettes/ING2/SCIA/SCIA]]
Source :
Date : 2024-02-24
***
Processing ::: Composante distribué du big data utilisé dans le traitement conséquent de donnée. Implique souvent des algorithmes de type MapReduce.

algorithmes de type MapReduce ::: algo de traitement distribué de données massives. Il divise une tâche en étapes de mapping (transformation) et de réduction (agrégation) exécutées de manière parallèle sur un cluster de machines.

Agrégation :: processus de regroupement ou de combinaison de plusieurs éléments ou données.

2 types de processing :: batch processing et stream processing.

batch processing ::: je prend un gros ensemble de donnée connue et je le transforme. Cette méthode utilise des solutions de [[Storage]]. (SPARK leader)

stream processing ::: traite plein de **petites données** rapidement grace au [[Stream]]. peut choisir d’être rapide ou lente selon la demande (FLINK leader)