---
cards-deck: SCIA
---
MOC: [[Maths]] [[IA]]
Source :
Date : 2024-03-24
***

## Fonction de répartition et loi de probabilités
[[Fonction de répartition et loi de probabilité]]

## Propriété d'une V.A. X
[[Propriété d'une V.A.]]

# Les différentes lois
## Loi Uniforme
[[Loi Uniforme]]

## Loi de Bernoulli
[[Loi de Bernoulli]]

## **Loi binomiale**
[[Loi Binomial]]

## Loi de Poisson

## Loi Exponentiel
[[Loi Exponentiel]]

## Loi Normal
[[Loi Normale]]

## Loi de Pareto


## Vecteur

Vecteur aléatoire :: $$Z = (_y^x)$$

Fonction de répartition :: $$F(x,y) = P(X\le x ~et~ Y\le y)$$

Densité :: $$F(x,y) = \int_{-\infty}^x\int_{-\infty}^y f(x,y)dydx$$

Loi marginales #card 
$$f_x(x) = \int_{-\infty}^{+\infty} f(x,y)dy$$
$$f_y(y) = \int_{-\infty}^{+\infty} f(x,y)dx$$

Lois conditionnelles #card 
$$f_{x|y}(x)=\frac{f(x,y)}{f_y(y)}$$
$$f_{y|x}(y)=\frac{f(x,y)}{f_x(x)}$$

Indépendance #card 
$$P(X\le x ~et~ Y\le y) = P(X\le x)*P(Y\le y)$$
$$f(x,y) = f_x(x) * f_y(y)$$

S = X+Y $$f_s(x) = ?$$
#card 
$$f_s(x) = \int_{-\infty}^{+\infty}f(x-y,y)dy$$

S = X+Y, Si X et Y indépendantes $$f_s(x) = ?$$
#card 
$$f_s(x) = \int_{-\infty}^{+\infty}f_x(x-y)f_y(y)dy = (f_x*f_y)(x)$$

Moments :: $$E(Z) = (_{E(y)}^{E(x)})$$

Covariance et sa matrice de covariance #card 
$$cov(x,y) = E((X-E(X))*(Y-E(Y))) = E(UV) - E(U)E(V)$$

matrice : 
$$cov(Z) = (_{Cov(x,y)\ \ \ Var(Y)}^{Var(X)\ \ \ \ \ Cov(x,y)})$$

SI X et Y indépendantes alors Cov(x,y) = 0

Corelation :: $$r(x,y)=\frac{Cov(x,y)}{\sqrt{Var(x)*Var(y)}}$$

## Suite

suite de variable :: $$(X_n)n\in \mathbb N$$

Convergence presque sûre :: $$X_n\xrightarrow{\text{P.S}}X \text{ si } P({X_n\xrightarrow[n \rightarrow +\infty]{} X}) = 1$$

Convergence en probabilitee:: $$X_n \xrightarrow{prob}X \text { si } \forall \epsilon > 0 \text{ }P((X_n-X)<\epsilon) \xrightarrow[n\rightarrow +\infty]{}1$$

Convergence L2 :: $$X_n \xrightarrow{L2} X \text{ si }E[(X_n-X)^2] \xrightarrow[n\rightarrow +\infty]{}0$$

Convergence en LOI 
#card 
$$X_n \xrightarrow{loi}X \text{ si } \forall A \subset \mathbb R \text { on a } P(X_n\in A) \xrightarrow[n \rightarrow +\infty]{}P(X\in A)$$
et
$$F_n(a)\rightarrow f(a)$$

Implication des lois :![[Pasted image 20240401121526.png]]


Loi des grands nombre :![[Pasted image 20240401121542.png]]


TH.CENTRAL LIMITE:
![[Pasted image 20240401121557.png]]]]