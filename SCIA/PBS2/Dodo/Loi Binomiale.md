---
cards-deck: PBS
---
MOC: [[Maths]] [[$IA]]
Source :
Date : 2024-04-02
***

# Loi binomiale contexte #card
La loi binomiale modélise le nombre de succès k dans un certain nombre n d'essais indépendants, où chaque essai a une probabilité p de succès et 1−p de non-succès.
La loi Binomial est une loi **discrète**

# Densité
Soit $p \in [0,1]$ et $n \in \mathbb N$. On dit que $X \leadsto B(n,p)$ si elle admet pour densité la fonction f définie par: #card 
$$
f(k) = (_k^n)p^k(1-p)^{n-k}
$$
![[Pasted image 20240327233539.png]]

# Fonction de répartition

Fonction de répartition d'une loi binomial F : #card 
![[Pasted image 20240327234111.png]]
# Propriété 

*Espérance* $X\leadsto B(n,p)$ :: $E(x) = np$

*Variance* $X\leadsto B(n,p)$ :: $V(x) = np(1-p)$

$B(n,p)$ à pour fonction caractéristique :: $\phi(t) = (1 - p + pe^{it})^n$ pour $t \in \mathbb R$  

Théorème binomiale :: $\left(^n_k\right)x^ky^{n-k} = (x + y)^n$

$B(n,p)$ à pour information de fisher :: $I(p) =  \frac n {p(1-p)}$  