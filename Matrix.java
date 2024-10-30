public class Matrix {
    int[][] matrix; // 2D array to store matrix values
    int N; // Number of rows in the matrix
    int M; // Number of columns in the matrix
    int n; // Modulo value for matrix elements

    // Method to fill the matrix with random values modulo n
    void fillMatrix(int n) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matrix[i][j] = (int) (Math.random() * n);
            }
        }
    }

    // Constructor to initialize the matrix with given dimensions and modulo value
    public Matrix(int N, int M, int n) {
        this.N = N;
        this.M = M;
        this.n = n;
        matrix = new int[N][M];
        fillMatrix(n); // Fill the matrix with random values
    }

    // Method to print the matrix
    public void printMatrix() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}