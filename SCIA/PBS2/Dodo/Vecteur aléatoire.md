---
cards-deck: PBS
---
MOC: [[Maths]] [[$IA]]
Source :
Date : 2024-04-01
***
# Définition
Soit $d \gt 1$, Un vecteur aléatoire est une fonction de Ω (univers) dans $\mathbb R^d$.

Fonction de répartition :: $F(x,y) = P(X\le x ~et~ Y\le y)$

Densité :: $$F_{X,Y}(x,y) = \int_{-\infty}^x\int_{-\infty}^y f(u,v)dvdu$$

# Propriété

Loi Conjointe #card
Cas discret : donnée des probabilités $P(X_1 = x_1, . . . , X_d = x_d)$
Cas continue : densité de la loi jointe $f(X_1,...,X_d ) (x_1,..., x_d )$ (conditions similaires au cas unidimensionnel).

Loi marginales #card 
$$f_X(x) = \int_{-\infty}^{+\infty} f(x,y)dy$$
$$f_Y(y) = \int_{-\infty}^{+\infty} f(x,y)dx$$

Lois conditionnelles #card 
$$f_{X|Y}(x)=\frac{f_{X,Y}(x,y)}{f_Y(y)}$$
$$f_{Y|X}(y)=\frac{f_{X,Y}(x,y)}{f_X(x)}$$

Indépendance, deux variables aléatoire sont indépendantes si #card 
$$P(X\le x ~et~ Y\le y) = P(X\le x)*P(Y\le y)$$
$$f(x,y) = f_x(x) * f_y(y)$$

Soit S = X+Y  alors $f_s(x) = ?$
#card 
$$f_s(x) = \int_{-\infty}^{+\infty}f(x-y,y)dy$$

Soit S = X+Y et X et Y indépendantes alors $f_s(x) = ?$
#card 
$$f_s(x) = \int_{-\infty}^{+\infty}f_x(x-y)f_y(y)dy = (f_x*f_y)(x)$$

Soit $Z = (_y^x)$ alors le Moments est :: $$E(Z) = (_{E(y)}^{E(x)})$$

Soit $Z = (_y^x)$, la Covariance et sa matrice de covariance #card 
$$cov(x,y) = E((X-E(X))*(Y-E(Y))) = E(UV) - E(U)E(V)$$
matrice :
$$cov(Z) = (_{Cov(x,y)\ \ \ Var(Y)}^{Var(X)\ \ \ \ \ Cov(x,y)})$$
SI X et Y indépendantes alors $Cov(x,y) = 0$

Coefficient de corrélation :: $$r(x,y)=\frac{Cov(x,y)}{\sqrt{Var(x)*Var(y)}}$$

Un vecteur aléatoire $(X_1,..., X_d )^T$ est dit gaussien si :: toute combinaison linéaire des variables aléatoires $X_k$ est gaussienne.

Un vecteur gaussien est entièrement caractérisé par :: $m = (E(X_1), . . . , E(X_d ))^T$ et sa matrice de variances-covariances Σ. Sa loi sera notée $N_d(m, Σ)$ et nous parlerons de loi normale multidimensionnelle.

# Proposition

Soit $X \leadsto N_d(m, Σ)$. Sa densité est donnée par :: $$f(x) = (\frac 1 {\sqrt {2\pi}})^2 \frac 1 {\sqrt{|det \Sigma |}}exp(- \frac 1 2 (x-m)^T\Sigma^{-1} (x-m))$$

Soit $X = (X_1, . . . , X_d )$ un vecteur gaussien. Les variables aléatoires $X_1, . . . , X_d$ sont indépendantes si et seulement si :: la matrice Σ est diagonale.

Soient $X = (X_1, . . . , X_d )$ un vecteur gaussien et A une matrice de taille d × p. Le vecteur$AX \leadsto$ :: $N(Am, AΣA^T )$.

# Fonction caractéristiques
[[Fonction caractéristique]]