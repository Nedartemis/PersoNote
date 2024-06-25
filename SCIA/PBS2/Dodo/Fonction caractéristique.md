---
cards-deck: PBS
---
MOC: [[Maths]] [[$IA]]
Source :
Date : 2024-04-01
***

# Fonction caractéristique  contexte 
#card
La fonction caractéristique est une fonction définie pour une variable aléatoire qui capture complètement la distribution de probabilité de cette variable aléatoire. Elle est définie comme la transformée de Fourier de la densité de probabilité de cette variable aléatoire.

Soit X une variable aléatoire, la fonction caractéristique $\phi_X(t)$ de X  avec $t \in \mathbb R$ est définie comme suit :: $$\phi_x(t) = E(e^{itX})$$

Soit X une variable aléatoire, la fonction caractéristique $\phi_X(t)$ de X  avec $t \in \mathbb R^p$ est définie comme suit :: $\phi_x(t) = E(e^{it\bullet X})$ où $\bullet$ désigne le produit scalaire de $\mathbb R^p$ .

# Propriété

$\phi_x=\phi_Y \Rightarrow$ :: X et Y suivent la même loi.

Deux variables aléatoires sont indépendantes si $\phi_{(x_1,X_2)}(t_1,t_2) =$ :: $\phi_{X_1}(t_1)\phi_{X_2}(t_2)$
# Utilité

1. **Détermination de la distribution** : Comme la fonction caractéristique détermine complètement la distribution d'une variable aléatoire, elle est utilisée pour identifier des distributions.
2. **Étude des combinaisons linéaires** : Les fonctions caractéristiques simplifient l'étude des sommes de variables aléatoires indépendantes. Si X et Y sont indépendants, la fonction caractéristique de leur somme est le produit des fonctions caractéristiques individuelles :
$$\phi_{X+Y}(t) = \phi_X(t)*\phi_Y(t)$$
4. **Calcul des moments** : Les moments d'une variable aléatoire peuvent être obtenus en dérivant la fonction caractéristique.