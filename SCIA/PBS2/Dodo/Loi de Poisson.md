---
cards-deck: PBS
---
MOC: [[Maths]] [[$IA]]
Source :
Date : 2024-04-01
***

# Loi de poisson contexte #card 
Cette loi de probabilité discrète est utilisée pour modéliser le nombre d'événements se produisant dans un intervalle de temps ou d'espace donné, lorsque ces événements surviennent de manière aléatoire et indépendante à un taux constant.

# Densité

Soit $\lambda \in \mathbb R_+^*$. On dit que $X \leadsto Pois(\lambda)$ si elle admet pour densité la fonction f définie par: #card
$$f(x) = \frac {e^{-\lambda}\lambda^x} {x!}$$
![[Pasted image 20240401113459.png | 300]]

# Propriété

*Espérance* $X\leadsto Pois(\lambda)$ :: $E(x) = \lambda$

*Variance* $X\leadsto Pois(\lambda)$ :: $V(x) = \lambda$

$Pois(\lambda)$ à pour fonction caractéristique :: $\phi(t) = exp(\lambda (e^{it} - 1))$ pour $t \in \mathbb R$  

Serie de taylor :: $e^z = \sum_{k=0}^{+\infty}\frac {z^k} {k!}$

$Pois(\lambda)$ à pour information de fisher :: $I(\lambda) =  \frac 1 {\lambda}$  