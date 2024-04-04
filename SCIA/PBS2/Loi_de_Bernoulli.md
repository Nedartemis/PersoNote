---
cards-deck: SCIA
---
![[Pasted image 20240401115809.png]]MOC: [[Maths]] [[IA]]
Source :
Date : 2024-03-27
***

# Contexte

Utilisée pour modéliser des expériences aléatoires à deux résultats possibles (succès ou échec), avec une probabilité de succès constante p.

# Densité

Soit $p \in [0,1]$. On dit que $X\leadsto B(p)$ si elle admet pour densité la fonction f définie par: #card $$
f(x) = \left\lbrace\begin{array}{lll} 
\quad \  p\qquad si\ x = 1 \\
\ 1-p\ \ \ \ \ si\    x = 0 \\
\quad \ 0 \qquad sinon
\end{array}\right.
$$
![[Pasted_image_20240327231148.png]]

# Fonction de répartition

Fonction de répartition du loi de Bernoulli F : #card 
- $x < 0 \Rightarrow F(X) = 0$
- $0 <= x < 1  \Rightarrow F(X) = 1 -q$
- $x >= 1 \Rightarrow F(X) = 1$
![[Pasted_image_20240327232134.png]]

# Propriété

*Espérance* $X\leadsto B(p)$ :: $E(x) = p$

*Variance* $X\leadsto B(p)$ :: $V(x) = p*(1-p)$

**Normalisation** $X\leadsto Unif(a,b)$ :: $Z = \frac {X - a} {b - a} \Rightarrow Z\leadsto Unif(0,1)$  

**Inversion** $X\leadsto Unif(1,0)$ :: X = $a + (b-a)Z \Rightarrow X\leadsto Unif(a,b)$