# Rapport de Laboratoire : Matrices

**Durée du laboratoire :** 4 périodes  
**Auteurs :** Surbeck Léon, Nicolet Victor 
## Schéma UML

![UML](UML.png)

## Description des Classes

### Classe `Matrix`

La classe `Matrix` représente une matrice de taille \(N x M\) avec un ensemble d'éléments compris entre \(0\) et \(n-1\), où \(n\) est défini comme le modulo de la matrice.

#### Attributs

- `int[][] matrix`: Tableau 2D pour stocker les valeurs de la matrice.
- `int N, M`: Dimensions de la matrice (nombre de lignes et colonnes).
- `int n`: Modulo des éléments.

#### Méthodes

- **Constructeur `Matrix(int N, int M, int n)`** : initialise une matrice de dimensions \(N x M\) avec des valeurs aléatoires modulo \(n\).
- **`fillMatrix(int n)`** : remplit la matrice avec des valeurs aléatoires comprises entre \(0\) et \(n-1\).
- **`printMatrix()`** : affiche le contenu de la matrice.

### Classe `operations`

La classe `operations` permet de réaliser les opérations entre deux matrices en respectant le modulo \(n\).

#### Méthodes

- **`operateMatr(Matrix mat1, Matrix mat2, int module, MatrixOperation operation)`** : effectue une opération donnée (addition, soustraction ou multiplication) sur deux matrices en appliquant le modulo et retourne le résultat.
- **`MatrixOperation` (Interface)** : Interface pour définir une opération entre deux matrices, implémentée pour chaque type d'opération spécifique.

#### Sous-classes d'`operations.MatrixOperation`

1. **`Addition`** : Addition élément par élément des deux matrices avec un résultat modulo \(n\).
2. **`Subtraction`** : Soustraction élément par élément des deux matrices avec un résultat modulo \(n\).
3. **`Multiplication`** : Multiplication élément par élément des deux matrices avec un résultat modulo \(n\).

### Classe `Main`

La classe `Main` permet de tester le programme en créant deux matrices de tailles spécifiées et en appliquant les opérations d'addition, soustraction et multiplication entre elles.

#### Exécution du Programme

Le programme est exécuté en ligne de commande avec les arguments suivants :

- **Argument 1 :** Modulo \(n\) des matrices
- **Argument 2, 3 :** Dimensions \(N1 x M1\) de la première matrice
- **Argument 4, 5 :** Dimensions \(N2 x M2\) de la deuxième matrice

Si les arguments ne sont pas fournis, des valeurs par défaut sont utilisées.

### Tests
Résultat de l'exécution du programme :
```
The Modulus is: 10
Matrix 1:
9 8 7 4 7
1 6 5 0 6
4 9 0 5 5
4 6 0 3 5
8 7 7 8 3
Matrix 2:
4 8 6 6 5
4 9 7 2 0
6 6 5 7 3
9 2 2 2 7
3 7 7 9 8
M1 + M2:
3 6 3 0 2
5 5 2 2 6
0 5 5 2 8
3 8 2 5 2
1 4 4 7 1
M1 - M2:
5 0 1 8 2
7 7 8 8 6
8 3 5 8 2
5 4 8 1 8
5 0 0 9 5
M1 * M2:
6 4 2 4 5
4 4 5 0 0
4 4 0 5 5
6 2 0 6 5
4 9 9 2 4
```

### Hypothèses de travail 

- Les dimensions des matrices sont des entiers positifs.
- Les valeurs des éléments des matrices sont des entiers positifs.
- Les valeurs des éléments des matrices sont comprises entre \(0\) et \(n-1\).
- Les valeurs des éléments des matrices sont générées aléatoirement.
- Les opérations sont effectuées en respectant le modulo \(n\).
- Les matrices sont affichées en ligne avec les éléments séparés par des espaces.