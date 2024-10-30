public class Main {
    public static void main(String[] args) {
        // Default values
        int defaultModule = 10;
        int defaultRows1 = 5;
        int defaultCols1 = 5;
        int defaultRows2 = 5;
        int defaultCols2 = 5;

        // Parse command-line arguments
        int module = args.length > 0 ? Integer.parseInt(args[0]) : defaultModule;
        int rows1 = args.length > 1 ? Integer.parseInt(args[1]) : defaultRows1;
        int cols1 = args.length > 2 ? Integer.parseInt(args[2]) : defaultCols1;
        int rows2 = args.length > 3 ? Integer.parseInt(args[3]) : defaultRows2;
        int cols2 = args.length > 4 ? Integer.parseInt(args[4]) : defaultCols2;

        // Create matrices with the specified or default dimensions
        Matrix m1 = new Matrix(rows1, cols1, module);
        Matrix m2 = new Matrix(rows2, cols2, module);


        System.out.println("The Modulus is: " + module);
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

    }
}