---
cards-deck: SCIA
---
MOC: [[Maths]] [[$IA]]
Source :
Date : 2024-06-20
***

# Méthode des moments

## Théorème

Soit X une variable aléatoire de carré intégrable i.e. telle que $E(X^2) \lt +\infty$
1. $\bar X$ est un estimateur fortement convergent de l'espérance
2. $S^2$ et $S'^2$ sont des estimateurs fortement convergents de l'espérance

## exemple 1
Pour la loi géométrique, $E(X) = \frac 1 p$ donc $p = \frac 1 {E(X)}$.

A l’ordre 1, la méthode des moments nous donne l’estimateur $\hat p := \frac 1{\bar X}$.
## exemple 2
$$
\left\lbrace\begin{array}{lll} 
E(x) = \frac {\alpha}{\beta}\\
V(x) = \frac {\alpha}{\beta^2}\\
\end{array}\right.
$$
$$
\left\lbrace\begin{array}{lll} 
\alpha = \frac {E(X)^2}{V(X)}\\
\beta = \frac {E(X)}{V(X)}\\
\end{array}\right.
$$
Nous en déduisons les estimateurs donnés par la méthode des moments : $\alpha = \frac {\bar X^2}{s^2}$ et $\beta = \frac {\bar X} {S^2}$
