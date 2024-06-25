---
cards-deck: PBS
---
MOC: [[Maths]] [[$IA]]
Source :
Date : 2024-04-01
***
# Loi binomiale négative contexte #card 
La loi binomiale négative modélise le nombre de succès k avant d'atteindre un certain nombre fixe n d'échecs dans une série d'essais indépendants.
La loi binomiale négative est discrète.

# Densité

Soit $p \in [0,1]$ et $n \in \mathbb N$. On dit que $X \leadsto Bn(n,p)$ si elle admet pour densité la fonction f définie par: #card 
$$
f(x) = (_{\ \ \ \ \ k}^{k+n-1})p^n(1 - p)^k
$$
![[Pasted image 20240401125138.png | 300]]

# Propriété

*Espérance* $X\leadsto Bn(n,p)$ :: $E(x) = n\frac {1-p} {p}$

*Variance* $X\leadsto Bn(n,p)$ :: $V(x) = n\frac {1-p} {p^2}$