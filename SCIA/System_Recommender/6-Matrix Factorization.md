
Problèmes des autres systèmes de recommandation :
1. Cold Start : un nouvel utilisateur ne va pas avoir beaucoup noté et n'aura pas de bonne recommendation 
2. Popularity binas : La majorité des notes sont sur peu de films et la majorité des notes proviennent des mêmes personnes
3. Scalabilité issue : $\theta(n^p)$ avec p > 1

On essaye de régler le 3ième problème.

A : n * m
B : n * k
C : k * m

A = B @ C

1. Choose k
2. Initiate B, C randomly
3. $min_B(a_{ij} - \sum_k b_{ik} c_{kj}^*) = B^*$
4. $min_C(a_{ij} - \sum_k b_{ik}^* c_{kj}) = C^*$
5. Répéter 3 et 4 tel que $|a_{ij} - a_{ij}^*| < \epsilon$ $\forall{ij}$
6. 