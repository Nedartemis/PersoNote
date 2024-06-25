---
cards-deck: PBS
---
MOC: [[Maths]] [[$IA]]
Source :
Date : 2024-04-04
***

# Vraisemblance contexte #card
En termes simples, la vraisemblance mesure à quel point un ensemble de données est compatible avec un modèle statistique spécifique.
Plus précisément, la vraisemblance est la probabilité d'observer les données que nous avons réellement observées, étant donné un certain modèle ou une certaine hypothèse sur la manière dont ces données ont été générées.

Exemple #card
pile ou face, je pense que ma piece a une proba de $\frac 1 2$ de faire face $P_f =\frac 1 2$.
je lance 2 fois ma piece et j'ai deux face donc la vraisemblance est: $L(x_1 = F,x_2 = F, \theta = P_f = \frac 1 2) = \frac 1 4$
On peut traduire  ca comme, la probabilité que ma piece soit équilibrer est de $\frac 1 4$.

# Fonction de vraisemblance

Loi dépend de θ donc la densité associée aussi que nous noterons f (X, θ) : #card
$$L(x_1,...,X_2,\theta) = \displaystyle \prod_{i=1}^{n} f(x_i,\theta)$$

passage au log pour simplifier les calcule du maximum : #card
$$log (L(x_1,...,X_2,\theta)) = log(\displaystyle \prod_{i=1}^{n} f(x_i,\theta))$$

# Maximum de vraisemblance #card
Logiquement on cherche souvent le maximum de la vraisemblance pour avoir la valeur de $\theta$ la plus probable. Dans l'exemple de la piece si je la lance 1000 fois j'aurais un certain nombre de face et de pile, en maximisant la vraisemblance je vais avoir la probabilité d'avoir face la plus probable.

On note $\hat\theta$ :: la probabilité la plus probable.

## Cas unidimensionnel

si L est de classe $C^2$ (i.e. deux fois dérivable par rapport à θ et de dérivée seconde continue), $\hat \theta$ est solution du système : #card
$$
\left\lbrace\begin{array}{lll} 
\frac {\delta log(L)} {\delta \theta} = 0\\
\frac {\delta^2 log(L)} {\delta \theta^2} \lt 0\\
\end{array}\right.
$$
La condition 1 est nécessaire et la 2 est suffisantes .

## Théorème #card
Sous les conditions suivantes : 
- Θ ouvert de R 
- $P_\theta  \ne P_{\theta'}$ si $\theta = \theta'$ 
- $f (x, \theta) > 0$ pour tout réel x ∈ H et tout réel θ ∈ Θ 
- $\frac {\delta log L} {\delta \theta}$ existe pour tout réel x ∈ H et tout réel θ ∈ Θ 
Alors il existe une suite de solutions $\hat\theta_n$ de l'équation de vraisemblance qui converge fortement vers la vraie valeur du paramètre $\theta_0$.
