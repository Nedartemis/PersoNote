---
cards-deck: PBS
---
MOC: [[Maths]] [[$IA]]
Source :
Date : 2024-03-27
***

# Loi de bernoulli contexte
#card
Utilisée pour modéliser des expériences aléatoires à deux résultats possibles (succès ou échec), avec une probabilité de succès constante p.
La loi Binomial est une loi **discrète**

# Densité

Soit $p \in [0,1]$. On dit que $X\leadsto B(p)$ si elle admet pour densité la fonction f définie par: #card 
$$
f(x) = \left\lbrace\begin{array}{lll} 
\quad \  p\qquad si\ x = 1 \\
\ 1-p\ \ \ \ \ si\    x = 0 \\
\quad \ 0 \qquad sinon
\end{array}\right.
$$
![[Pasted image 20240327231148.png|300]]

# Fonction de répartition

Fonction de répartition du loi de Bernoulli F : #card 
- $x < 0 \Rightarrow F(X) = 0$
- $0 <= x < 1  \Rightarrow F(X) = (1-p)$
- $x >= 1 \Rightarrow F(X) = 1$
![[Pasted image 20240327232134.png]]

# Propriété

Espérance $X\leadsto B(p)$ :: $E(x) = p$

Variance $X\leadsto B(p)$ :: $V(x) = p*(1-p)$

$B(p)$ à pour fonction caractéristique :: $\phi(t) = 1 - p + pe^{it}$ pour $t \in \mathbb R$  
