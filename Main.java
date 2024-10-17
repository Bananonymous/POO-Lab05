public class Main {
    //Hello World
    public static void main(String[] args) {
        int[][] mat1, mat2;
        mat1 = mat2 = new int[2][2];
        boolean isCompat = operations.checkMatrixCompat(mat1,mat2);

        System.out.println(isCompat);
    }
}
