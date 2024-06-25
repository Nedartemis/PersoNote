---
cards-deck: PBS
---
MOC: [[maths]] [[$IA]]
Source :
Date : 2024-04-01
***

# Loi géométrique contexte #card
La loi géométrique est une distribution de probabilité discrète qui modélise le nombre �X d'essais nécessaires pour obtenir le premier succès dans une séquence d'essais de Bernoulli indépendants, chacun ayant une probabilité �p de succès.

# Densité

Soit $p \in [0,1]$. On dit que $X \leadsto \mathcal{G}(p)$ si elle admet pour densité la fonction f définie par: #card 
$$
f(k)= p*(1-p)^{k-1}
$$

![[Pasted image 20240401125753.png|300]]

# Fonction de répartition

Fonction de répartition d'une loi géométrique: #card
$$F(x) = 1 - q^k$$
![[Pasted image 20240401130244.png|300]]

# Propriété

*Espérance* $X\leadsto \mathcal{G}(p)$ :: $E(x) = \frac 1 p$

*Variance* $X\leadsto \mathcal{G}(p)$ :: $V(x) = \frac{1-p}{p^2}$

$\mathcal{G}(p)$ à pour fonction caractéristique :: $\phi(t) = \frac {pe^{it}} {1-qe^{it}}$