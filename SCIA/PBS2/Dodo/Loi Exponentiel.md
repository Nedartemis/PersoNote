---
cards-deck: PBS
---
MOC: [[Maths]] [[$IA]]
Source :
Date : 2024-03-26
***

# Loi exponentiel contexte #card
Utilisée pour modéliser le temps entre les occurrences successives d'un événement, lorsque ces événements se produisent de manière aléatoire et indépendante à un taux constant.

# Densité

Soit $\lambda \gt 0$. On dit que $X \leadsto Exp(\lambda)$ si elle admet pour densité la fonction f définie par: #card
$$
\begin{aligned} 
&f(x) = \left\lbrace\begin{array}{lll} 
\ \ 0\ &si\ x \lt 0 \\
\ \ \lambda e^{-\lambda x} &si\ x \ge 0 
\end{array}\right.
\end{aligned}
$$
![[Pasted image 20240326122804.png|300]]

# Fonction de répartition

Fonction de répartition d'une loi exponentiel F: #card
$$
\begin{aligned} 
&F(x) = \left\lbrace\begin{array}{lll} 
\ \ \ \ \ 0\ &si\ x \lt 0 \\
\ \ 1- e^{-\lambda x} &si\ x \ge 0 
\end{array}\right.
\end{aligned}
$$
![[Pasted image 20240326125126.png | 300]]

# Propriété

**La loi exponentielle est sans mémoire**

*Espérance* $X \leadsto Exp(\lambda)$ :: $E(X) = \frac 1 \lambda$

*Variance* $X \leadsto Exp(\lambda)$ :: $E(X) = \frac 1 {\lambda^2}$

*Normalisation* $X\leadsto Exp(\lambda)$ ::  $Z=\lambda X \Rightarrow Z \leadsto Exp(1)$

*Inversion* $Z \leadsto Exp(1)$ :: $X = \frac Z \lambda \Rightarrow X \leadsto Exp(\lambda)$

$Exp(\lambda)$ à pour fonction caractéristique :: $\phi(t) = \frac \lambda {\lambda-it}$

$E(\lambda)$ à pour information de fisher :: $I(\lambda) =\frac 1 {\lambda^2}$ 