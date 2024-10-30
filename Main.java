public class Main {
    public static void main(String[] args) {
        // Cas 1 : Matrices avec des valeurs par défaut
        testMatrices(10, 5, 5, 5, 5);

        // Cas 2 : Dimensions non compatibles pour la multiplication
        testMatrices(10, 3, 5, 4, 5); // Cela devrait échouer pour la multiplication

        // Cas 3 : Module 0 ou 1 (cas limites du modulo)
        testMatrices(0, 5, 5, 5, 5);  // Modulus 0
        testMatrices(1, 5, 5, 5, 5);  // Modulus 1

        // Cas 4 : Dimensions de matrice incorrectes
        testMatrices(10, 0, 5, 5, 5);  // Matrice 1 avec 0 ligne
        testMatrices(10, 5, 0, 5, 5);  // Matrice 1 avec 0 colonne
        testMatrices(10, -3, 5, 5, 5); // Matrice 1 avec dimensions négatives
    }

    private static void testMatrices(int module, int rows1, int cols1, int rows2, int cols2) {
        try {
            Matrix m1 = new Matrix(rows1, cols1, module);
            Matrix m2 = new Matrix(rows2, cols2, module);

            System.out.println("Testing with module = " + module + ", rows1 = " + rows1 + ", cols1 = " + cols1 +
                    ", rows2 = " + rows2 + ", cols2 = " + cols2);

            System.out.println("Matrix 1:");
            m1.printMatrix();
            System.out.println("Matrix 2:");
            m2.printMatrix();

            System.out.println("M1 + M2:");
            Matrix result = operations.operateMatr(m1, m2, module, new operations.Addition());
            result.printMatrix();

            System.out.println("M1 - M2:");
            result = operations.operateMatr(m1, m2, module, new operations.Subtraction());
            result.printMatrix();

            System.out.println("M1 * M2:");
            result = operations.operateMatr(m1, m2, module, new operations.Multiplication());
            result.printMatrix();
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}