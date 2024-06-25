---
cards-deck: PBS
---
MOC: [[Maths]] [[$IA]]
Source :
Date : 2024-03-26
***

# Loi normale contexte 
#card 
L'une des distributions les plus importantes en statistique. Elle est caractérisée par sa forme de cloche symétrique et est souvent utilisée pour modéliser des phénomènes naturels.

# Densité

Soit un intervalle $(\mu,\sigma) \in \mathbb R * \mathbb R_+^*$. On dit que $X \leadsto N(\mu,\sigma)$ si elle admet pour densité la fonction f définie par: #card
$$f(x) = \frac 1 {\sigma \sqrt {2\pi}} exp(-\frac {(x-m)^2}{2\sigma^2})$$
![[Pasted image 20240326125847.png | 300]]

# Propriété

Soit $X \leadsto N(m,\sigma^2)$ et $(a,b) \in \mathbb R^2$ tq $a \ne 0$. Alors $aX+b\leadsto$ ? 
#card 
$$ aX+b\leadsto N(am+b,a^2\sigma^2)$$

$X \rightarrow N(m,\theta^2) \leftrightarrow Z \rightarrow N(0,1)?$
#card 
- $X \leadsto N(m,\sigma^2) \Rightarrow \frac {X-m} \sigma \leadsto N(0,1)$
- $Z \leadsto Z(0,1) \Rightarrow m + \sigma Z \leadsto N(m,\sigma^2)$

Soit X et Y 2 V.A. tel que $X\leadsto N(m_1,\sigma_1^2)$ et $Y\leadsto N(m_2,\sigma_2^2)$. Alors $(X+Y) \leadsto$?
#card 
$$ (X + Y) \leadsto N(m_1+m_2, \sigma_1^2+\sigma_2^2)$$

Variance et Espérance d'une loi normale
#card 
- $E(X) = m$
- $V(X) = \theta^2$

Loin normal centré réduite
#card 
Soit X suit une loi normal centrée réduite, alors $X\leadsto N(0,1)$

Autre propriété se la loi Normal: #card 
- $\mathbb P(X \le 0) = \mathbb P(X\ge 0) = 0,5$
- $\mathbb P(X \le -a) = \mathbb P(X\ge a)$
- $\mathbb P(-1,96 \le X \le 1,96) \approx 0,95 \text{ et } \mathbb P(-2,58 \le X \le 2,58) \approx 0,99$

$N(m,\theta^2)$ à pour fonction caractéristique :: $\phi(t) = e^{- \frac {\theta^2t^2} 2 + itm}$

$N(m,\theta^2)$ à pour information de fisher :: $I(m) =\frac 1 {\theta^2}$  et $I(\theta^2) = \frac 1 {2\theta^4}$