---
cards-deck: IDE
---
MOC: [[$INFORMATIQUE]] [[2 Casquettes/ING2/SCIA/SCIA]]
Source :
Date : 2024-02-25
***
Stream ::: composante distribué utilisés pour traiter et analyser les flux de données en temps réel. Ces systèmes sont également distribués pour gérer la vélocité des données en continu.

Propriété d'une stream #card 
- Une sorte de reverse proxi
- Une structure FIFO
- reçois des petites données d'un producteur
- renvoie les données vers un consommateur quand il an a besoin
	- chaque consumers pop la fifo quand il veut. plus ou moins vite (pop delete pas la donnée)
![[Représentation Kafka.png]]

Les languages de prgm utilisé pour les stream sont #card 
- java 15% 
	- compatible JVM
- scala  50%
	- compatible JVM
- python 70%