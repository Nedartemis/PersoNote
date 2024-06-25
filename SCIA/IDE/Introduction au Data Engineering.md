---
cards-deck: IDE
---
MOC: [[$INFORMATIQUE]] [[2 Casquettes/ING2/SCIA/SCIA]]
Source :
Date : 2024-02-20
***
Data engineering ::: Conception, mise en œuvre et optimisation des architectures, des pipelines et des systèmes. C'est indispensable dans l'informatique avancé pour gérer les donnés (les récupérer et les traiter).

# BIG DATA
## c'est quoi le big data

big data :: Le big data est définie sur 3v le volume (grande quantité de données), la variété (diversité des types de données) et la vélocité (vitesse à laquelle les données sont générées et traitées).

comment aller plus vite pour les grosses taches fréquentes ? #card
- vertical scaling : plus grosse machine ( plus cher )
- horizontal scaling : plus de machines (moins cher mais moins connecté )

quand avons nous besoins de bigdata ? #card
- si ça tiens pas en ram
	- exemple: si la marchandise tiens dans un camions pas besoin de porte containers
- si on a des contraintes de temps et qu'on a peux pas se satisfaire de 2 machines

## De quoi avons nous besoin pour faire du big data

- gérer tout les erreurs (les pannes par example)
	- at most once ::: ensemble de donné traité que une fois (panne => risque pas traité)
	- at least once ::: ensemble de donné traité plusieurs fois (panne => tkt car traité plusieurs fois)
	- exactly once ::: a dream, on peut tricher (j'ai pas mon age + 1 j'ai 22)
- connecté les machines pour qu'elle travaille en meme temps
- composant distribué 3 types pour le big data:
	- [[Storage]]
	- [[Stream]]
	- [[Processing]] 
- besoin d'employer du métier 
	- data analyst ::: analyse et interprète des données pour fournir des insights et des recommandations basées sur des tendances et des modèles identifiés.(exemple: pac de bière pas loin des couche culotte).
	- data scientist ::: gère prbtique complexe, analyse et interprète des données pour extraire des informations exploitables.
	- data engineer/architecte ::: se concentre sur l'acquisition, le stockage, le traitement et la préparation des données pour permettre des analyses ultérieures faites par les data scientist et les data analyst.
	- (data/ML) devops ::: gère les machines et les environnements sur lesquelles tourne les machines pour tout les corps de metier.

## Solution pour du big data

Hadoop ::: framework open source pour le stockage distribué et le traitement parallèle de grands ensembles de données sur des clusters de serveurs.

caractéristiques du cloud #card
	- pas d’investissement initial
	- dynamique exemple j'en veut que 1 mois par ans
	- moins bonne performance