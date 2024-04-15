
ALS : Alternating Least Squares

Problèmes des autres systèmes de recommandation :
1. Cold Start : un nouvel utilisateur ne va pas avoir beaucoup noté et n'aura pas de bonne recommandation 
2. Popularity bias : La majorité des notes sont sur peu de films et la majorité des notes proviennent des mêmes personnes
3. Scalabilité issue : $\theta(n^p)$ avec p > 1

On essaye de régler le 3ᵉ problème.

A : n * m
B : n * k
C : k * m

A = B @ C

1. Choisir k
2. Initialiser B, C aléatoirement
3. $min_B(a_{ij} - \sum_k b_{ik} c_{kj}^*) = B^*$
4. $min_C(a_{ij} - \sum_k b_{ik}^* c_{kj}) = C^*$
5. Répéter 3 et 4 tels que $|a_{ij} - a_{ij}^*| < \epsilon$ $\forall{ij}$ (d'où le alternative dans ALS)

```python
(A - np.dot(B, C) * R) ** 2
```
avec R = {0 si $A_{ij} = NaN$, 1 sinon}

