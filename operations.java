public class operations {
    // Method to perform matrix operations (addition, subtraction, multiplication) with modulo
    public static Matrix operateMatr(Matrix mat1, Matrix mat2, int module, MatrixOperation operation) {
        // Create a result matrix with dimensions based on the larger of the two input matrices
        Matrix result = new Matrix(Math.max(mat1.matrix.length, mat2.matrix.length), Math.max(mat1.matrix[0].length, mat2.matrix[0].length), 0);
        for (int i = 0; i < result.matrix.length; i++) {
            for (int j = 0; j < result.matrix[0].length; j++) {
                int a, b;
                // Get value from mat1 if within bounds, otherwise use 0
                if (i < mat1.matrix.length && j < mat1.matrix[0].length) {
                    a = mat1.matrix[i][j];
                } else {
                    a = 0;
                }
                // Get value from mat2 if within bounds, otherwise use 0
                if (i < mat2.matrix.length && j < mat2.matrix[0].length) {
                    b = mat2.matrix[i][j];
                } else {
                    b = 0;
                }
                // Check if matrix values are greater than the module
                if (a > module || b > module) {
                    throw new RuntimeException("Matrix values are greater than module");
                }
                // Apply the matrix operation (addition, subtraction, multiplication) with modulo
                result.matrix[i][j] = operation.apply(a, b, module);
            }
        }
        return result;
    }

    // Interface for matrix operations
    public interface MatrixOperation {
        int apply(int a, int b, int modulo);
    }

    // Class for addition operation
    public static class Addition implements MatrixOperation {
        @Override
        public int apply(int a, int b, int modulo) {
            return Math.floorMod(a + b, modulo);
        }
    }

    // Class for subtraction operation
    public static class Subtraction implements MatrixOperation {
        @Override
        public int apply(int a, int b, int modulo) {
            return Math.floorMod(a - b, modulo);
        }
    }

    // Class for multiplication operation
    public static class Multiplication implements MatrixOperation {
        @Override
        public int apply(int a, int b, int modulo) {
            return Math.floorMod(a * b, modulo);
        }
    }
}