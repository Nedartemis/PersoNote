---
cards-deck: SCIA
---
MOC: [[Maths]] [[IA]]
Source :
Date : 2024-03-25
***

# Contexte

Cette loi suppose que chaque résultat possible a une probabilité égale de se produire. Elle est souvent utilisée pour modéliser des situations où tous les résultats sont également probables.
# Densité

Soit un intervalle $[a,b] \in \mathbb R$. On dit que $X \leadsto Unif(a,b)$ si elle admet pour densité la fonction f définie par: #card
$$
f(x) = \left\lbrace\begin{array}{lll} 
\frac{1}{b-a}\ si\ x\in[a,b] \\
 \ \ 0\ \ \ \  sinon
\end{array}\right.
$$
![[Pasted image 20240401120347.png]]


# Fonction de répartition

Fonction de répartition d'une loi uniforme F  : #card 
- $x > a \Rightarrow F(X) = 0$
- $a < x < b \Rightarrow F(X) = \frac {x - a} {b - a}$
- $x > b \Rightarrow F(X) = 1$

![[Pasted image 20240401120437.png]]

# Propriété

*Espérance* $X\leadsto Unif(a,b)$ :: $E(x) = \frac{(a + b)}{2}$

*Variance* $X\leadsto Unif(a,b)$ :: $V(x) = \frac{(b - a)^2}{12}$

**Normalisation** $X\leadsto Unif(a,b)$ :: $Z = \frac {X - a} {b - a} \Rightarrow Z\leadsto Unif(0,1)$  

**Inversion** $X\leadsto Unif(1,0)$ :: X = $a + (b-a)Z \Rightarrow X\leadsto Unif(a,b)$