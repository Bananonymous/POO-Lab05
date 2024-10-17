public class Matrix {
    int[][] matrix;
    int N;
    int M;
    int n;

    void fillMatrix(int n) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matrix[i][j] = (int) (Math.random() * n);
            }
        }
    }

    public Matrix(int N, int M, int n) {
        this.N = N;
        this.M = M;
        this.n = n;
        matrix = new int[N][M];
        fillMatrix(n);
    }

    public void printMatrix() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
