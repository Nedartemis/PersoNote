---
cards-deck: SCIA
---
MOC: [[Maths]] [[IA]]
Source :
Date : 2024-03-26
***
# Contexte

L'une des distributions les plus importantes en statistique. Elle est caractérisée par sa forme de cloche symétrique et est souvent utilisée pour modéliser des phénomènes naturels.

# Densité

Soit un intervalle $(\mu,\sigma) \in \mathbb R * \mathbb R_+^*$. On dit que $X \leadsto N(\mu,\sigma)$ si elle admet pour densité la fonction f définie par: #card
$$f(x) = \frac 1 {\sigma \sqrt {2\pi}} exp(-\frac {(x-m)^2}{2\sigma^2})$$
![[Pasted image 20240401120751.png]]

# Fonction de répartition
![[Pasted image 20240401120834.png]]

# Propriété

Espérance $X \leadsto N($

Loi normal centrée réduite: $X \leadsto N(0,1)$

$$
\begin{aligned}
&Soit\  X \leadsto N(m,\sigma^2)\ et\ (a,b) \in \mathbb R^2\ tq\ a \ne 0\\ \\
&Alors\ aX+b\leadsto ? 
\end{aligned}
$$
#card 
$$ aX+b\leadsto N(am+b,a^2\sigma^2)$$

 $$X \rightarrow N(m,\theta^2) \leftrightarrow Z \rightarrow N(0,1)? $$
#card 
$$
\begin{aligned}
&X \leadsto N(m,\sigma^2) \Rightarrow \frac {X-m} \sigma \leadsto N(0,1) \\\\
&Z \leadsto Z(0,1) \Rightarrow m + \sigma Z \leadsto N(m,\sigma^2) \\
\end{aligned}
$$

Soit X et Y deu V.A. tel que: $$
\begin{aligned}
X\leadsto N(m_1,\sigma_1^2)& \qquad et\qquad Y\leadsto N(m_2,\sigma_2^2)\\\\
&(X+Y) \leadsto \ ?
\end{aligned}
$$ 
#card 
$$ (X + Y) \leadsto N(m_1+m_2, \sigma_1^2+\sigma_2^2)$$

Théorème : densité de $$\alpha X+\beta$$
#card 
$$
\begin{aligned}
Soient\ X\ une\ V.A.\ de\ &densité\ f_x,\ (\alpha,\beta)\in \mathbb R^2\ 
tq\ a\ne0\ et\ Y=\alpha X+ \beta.\\ \\
&f_Y(x) = \frac 1 {|\alpha|} * f_X(\frac {x-\beta} \alpha)
\end{aligned}
$$

Variance et Espérance
#card 
$$E(X) = m$$
$$V(X) = \theta^2$$
