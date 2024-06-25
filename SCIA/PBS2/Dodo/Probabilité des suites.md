---
cards-deck: PBS
---
MOC: [[Maths]] [[$IA]]
Source :
Date : 2024-04-01
***

Suite de variable :: $(X_n)n\in \mathbb N$

Convergence presque sûre :: $X_n\xrightarrow{\text{P.S}}X \text{ si } P({X_n\xrightarrow[n \rightarrow +\infty]{} X}) = 1$

Convergence en probabilité :: $X_n \xrightarrow{prob}X \text { si } \forall \epsilon > 0 \text{ }P((X_n-X)<\epsilon) \xrightarrow[n\rightarrow +\infty]{}1$

Convergence L2 :: $X_n \xrightarrow{L2} X \text{ si }E[(X_n-X)^2] \xrightarrow[n\rightarrow +\infty]{}0$

Convergence en LOI 
#card 
- $X_n \xrightarrow{loi}X \text{ si } \forall A \subset \mathbb R \text { on a } P(X_n\in A) \xrightarrow[n \rightarrow +\infty]{}P(X\in A)$
- $F_n(a)\rightarrow f(a)$

Implication des lois ::![[Pasted image 20230514225445.png]]

 Théorème de Paul Lévy #card  Si la suite de v.a. (Xn) converge en loi vers une v.a. X alors $\underset{n\rightarrow +\infty}{lim}ϕ_{X_n} (t) = ϕ_X (t)$ pour tout réel t.
Réciproquement, si la suite des fonctions caractéristiques $(ϕ_{X_n} )$ converge simplement vers une fonction ϕ quand n tend vers +∞ et si la fonction ϕ est continue en zéro alors ϕ est la fonction caractéristique d'une variable aléatoire X telle que $(X_n)$ converge vers X en loi.

# Théorème centrale limite
## Loi forte des grand nombres #card

Soit ($X_i$) une suite de variables aléatoires i.i.d.( indépendantes et identiquement distribuées) telle que $E(|X_1|) \lt + \infty$.
Notons $m:= E(X_1)$.
$$\underset {n \longrightarrow+\infty}{lim} \bar X_n = m $$
au sens de la convergence p.s. où $\hat X_n := \frac {X_1 + ... + X_n} n$

## Loi faible des grands nombre #card 
$\overset - X = \frac {X_1...X_n} n$ les $X_i$ ont une variance et $Cov(X_i,X_j) = 0$ et $E(X_i)=m$ alors: 
$$\overset - X_n \overset {prob}\longrightarrow n$$

## T.C.L cas unidimensionnel #card 
Soit $(Xi)$ une suite v.a. i.i.d. 
Notons $m = E(X_i)$ et $\sigma^2 = V(X_i)$  alors:$$\frac {\sqrt n (\overset - X_n - m)} \sigma$$ converge en loi vers une loi normale centrée réduite.


## T.C.L cas multidimensionnel #card 
Soit $(Xi)$ une suite v.a. de $\mathbb R^d$ i.i.d. 
Notons $m = E(X_i) \in \mathbb R^d$ et $\sum$  la matrice de variances-covariances.:$$\sqrt n \left(\frac 1 n \sum_{i=1}^n X_i - m\right) $$ converge en loi vers une loi normale multidimensionnelle $N(0, \sum)$.
