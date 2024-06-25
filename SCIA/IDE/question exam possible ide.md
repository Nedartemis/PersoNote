---
cards-deck: IDE
---
MOC: [[$INFORMATIQUE]] [[$IA]]
Source :
Date : 2024-06-22
***
- pourquoi c'est bien l’immutabilité:: car le changement de valeur est la source du problème dans le code parallèlisé.
- Fonction pure::: fonction qui doit retourner la même valeur quand on l'appel avec les mêmes paramètres.
- fonction d'ordre supérieur ::: fonction qui prend comme input une ou plusieurs autres fonction et ou envoie une ou plusieurs fonctions en valeur de retour.
- flatMap ::: aplatie et fait une transformation
- fold ::: compresse une liste en une seul valeur, est composé d'un accumulateur et d'un opérateur. foldLeft(accu:u)(ope(accu:U, element:T) => U)
- algebraic data::: un type formé d'une combinaison d'autres type
- trait ::: interface qui peut implementer une methode
- evaluation strategy::: delays l'evaluation d'une expression jusqu'a qu'on en est besoin
- accumulator ::: est une valeur qui contient des données déjà connues ou calculées.
- List::: est une structure fondamental en programming fonctionnel
- trois grand composant dans une archi big data :: storage, processing et stream,
- pourquoi l’immutabilité important pour du calcule distribué :: éviter les risques conditions ou éviter l’accès concurrent en écriture
- dans quel cas le cloud c'est moins cher que le on promise et le cas inverse :: Le cloud est moins cher que le on-premise pour des charges de travail fluctuantes ou temporaires, tandis que le on-premise est plus économique pour des charges stables et à long terme.
# Kafka

kafka ::: message bus which written in Scala. fait pour supporter batch et analyse en temps réel. est fait pour fonctionner dans un cluster
cluster ::: ensemble d'instance (noeud) qui se connaissent entre eux
la data envoyer dans kafka sont:: des messages key / value pair, ils sont écrit dans un topic (facons de grouper les message)
les 4 composantes clés de kafka sont ::: Producers, brokers, consumers, zookeeper
Producer ::: envoie le message dans le cluster kafka
brocker::: est le coeur de kafka, il reçois les message et les persistes, c'est tres performant. il y en a plusieurs dans un cluster kafka. chaque brokers gère plusieurs paartitions
consumer ::: lit les message depuis kafka, plusieurs consumers peuvent lire le même topic. il reçois les messages en les "pulling"
Zookeeper ::: c'est un outil de configuration centralisé
Architecture kafka :: ![[Pasted image 20240622161619.png]]

CAP theorem :: ![[Pasted image 20240622161746.png]]

# Spark
Spark ::: framework de data processing distribué
spark available ALIS ::: scala, python java, R
Spark Driver :::java/scala process running inside a JVM
Spark application ::: ensemble de jobs dans un programme
Spark job ::: ensemble d'opération qui se termine par une action
Spark stage ::: ensemble de tâches parallèles calculant toutes la même fonction qui doivent s'exécuter dans le cadre d'une tâche Spark, où toutes les tâches ont les mêmes dépendances aléatoires.
spark tache ::: Il s'agit du plus petit travail qui peut et doit être exécuté par un exécuteur Spark. Chaque tâche est allouée à une partition de l'ensemble de données.
micro batch ::: spark ( traiter tout les données des 50 dernières ms plutôt de une a une )
## RDD
RDD ::: Resilient, Distributed, Datasets (key, value) key not unique.
Resilient ::: capable de recalculer des partition oublié ou endommagé due a un noeud qui fail.
Distributed ::: data divisé parmi plusieurs partition elle meme dans plusieurs noeud dans un cluster.
Dataset ::: collection des data partitionnée
deux type de methods possible dans un rdd ::: transformation : RDD => RDD et action RDD => not RDD

## Dataframe
Dataframe ::: est un object en deux dimensions, peut être représenter sous forme de tableau.
Dataframe structure: #card 
- the (named) colonne, qui est la variable du dataset.
- la ligne qui est l'observation du dataset

type de donné qu'on peut mettre dans un dataframe ::: type normaux, array(list), dictionnaire
