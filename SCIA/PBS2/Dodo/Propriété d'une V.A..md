---
cards-deck: PBS
---
MOC: [[Maths]] [[$IA]]
Source :
Date : 2024-03-24
***
## Esperance

Soit X une variable aléatoire.

**Esperance de X** #card 
- $E(X) = \int_{- \infty}^{+\infty}xf(x)dx$
- Si elle diverge alors X n'a pas d’espérance.


**Propriété de l’espérance**: #card 
soit X et Y deux variable aléatoire admettant chacune une espérance:
1. $\forall(\alpha,\beta)\in\mathbb R,\  E(\alpha X + \beta) = \alpha E(X) + \beta$
2. $E(X + Y) = E(X) + E(Y)$
3. Théorème de transfert : Pour toute fonction $\varphi$ continue: $E(\varphi(X)) = \int_{- \infty}^{+\infty} \varphi(x)f(x)dx$
	S'il n'y a pas de convergence absolue de l'intégrale, alors $\varphi(X)$ n'admet pas d'ésperance.
	
## Variance

Variance de X #card
- $Var(X) = E((X - E(X))^2) = \int_{- \infty}^{+\infty} (X - E(X))^2f(x)dx$
- Si X n'a pas d’ésperance ou si cette intégrale diverge alors la variable X n'a pas de variance.
- $\sigma(X) = \sqrt{Var(X)}$

Propriété de la variance : #card 
Soit X et Y deux variable aléatoire indépendante et $(a,b) \in R$: 
1. $Var(X) = E(X^2) - E(X)^2$
2. $Var(aX + b) = a^2 Var(X)$
3. $Var(X + Y) = Var(X) + Var(Y)$ si X et Y indépendante

Inégalité de Tchebychev #card 
$$\forall \epsilon \gt 0,\ P(|X - E(X)| \gt \epsilon) \le \frac {Var(X)}{\epsilon^2}$$
