---
cards-deck: SCIA
---
MOC: [[Maths]] [[IA]]
Source :
Date : 2024-03-26
***
# Contexte

Utilisée pour modéliser le temps entre les occurrences successives d'un événement, lorsque ces événements se produisent de manière aléatoire et indépendante à un taux constant.
# Densité

Soit $\lambda \lt 0$. On dit que $X \leadsto Exp(\lambda)$ si elle admet pour [densité](obsidian://open?vault=Brain&file=5%20Garden%2FNotes%2FFonction%20de%20r%C3%A9partition%20et%20loi%20de%20probabilit%C3%A9) la fonction f définie par: #card

Loi exponentiel definition #card 
$$
\begin{aligned} 
&f(x) = \left\lbrace\begin{array}{lll} 
\ \ 0\ &si\ x \lt 0 \\
\ \ \lambda e^{-\lambda x} &si\ x \ge 0 
\end{array}\right.
\end{aligned}
$$
![[Pasted image 20240401120552.png]]

# Fonction de répartition

Fonction de répartition de X vaut #card
$$
\begin{aligned} 
&F(x) = \left\lbrace\begin{array}{lll} 
\ \ \ \ \ 0\ &si\ x \lt 0 \\
\ \ 1- e^{-\lambda x} &si\ x \ge 0 
\end{array}\right.
\end{aligned}
$$
![[Pasted image 20240401120608.png]]

# Propriété

*Espérance* $X \leadsto Exp(\lambda)$ :: $E(X) = \frac 1 \lambda$

*Variance* $X \leadsto Exp(\lambda)$ :: $E(X) = \frac 1 {\lambda^2}$

*Normalisation* $X\leadsto Exp(\lambda)$ ::  $Z=\lambda X \Rightarrow Z \leadsto Exp(1)$

*Inversion* $Z \leadsto Exp(1)$ :: $X = \frac Z \lambda \Rightarrow X \leadsto Exp(\lambda)$