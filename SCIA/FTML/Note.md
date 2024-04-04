
Example of a linear regression :

![[Pasted image 20240401150433.png]]

![[Pasted image 20240401150918.png]]

![[Pasted image 20240401150959.png]]

Empirical Risk : $R_n(\theta,b)=\sum_{i=1}^n(\theta x_i + b - y_i)²$

Goal : choose $\theta$ and b to minimize the risk.

They are noted $\theta^{*}$ and b* so that the gradient descent cancels :

$$\nabla_{(\theta,b)}R_n(\theta^*,b^*) = 0$$
$$\nabla_{(\theta,b)}R_n(\theta,b) =
\begin{pmatrix}
\dfrac{\partial R_n}{\partial \theta} \\[1mm]
\dfrac{\partial R_n}{\partial b}
\end{pmatrix}
(\theta,b)
$$

![[Pasted image 20240401152716.png]]

![[Pasted image 20240401152732.png]]


### OLS estimator

![[Pasted image 20240401152821.png]]
### Loss function

![[Pasted image 20240401153003.png]]
### Cosine Similarity

![[Pasted image 20240401153222.png]]