---
cards-deck: SCIA
---
MOC: [[Maths]] [[$IA]]
Source :
Date : 2024-06-20
***
1. $\forall x \in H$ et $\forall \theta \in \Theta \subset \mathbb R, f(x,\theta) \gt 0$
2. $f$ est dérivable par rapport a $\theta$.
	nous pourrons définir l'information de Fisher:
	$$I(\theta):= E\left(\frac {f'(X,\theta)}{f(X,\theta)}\right)$$

	$$\Leftrightarrow I(\theta):= E\left(\left(\frac {\partial log f} {\partial \theta}(X,\theta)\right)^2\right)$$
## Théorème
Sous réserve que f soit deux fois dérivable en $\theta$, $I(\theta) = -E\left(\frac {\partial^2logf}{\partial \theta^2}(X,\theta) \right)$
