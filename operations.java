public class operations {
    public static boolean checkMatrixCompat(int[][] mat1, int[][] mat2) {
        //throw exception if one of the matrix
        if (mat1 != null && mat1.length == 0 || mat2 != null && mat2.length == 0) {
            throw new IllegalArgumentException("One of the matrix is null");
        }
        return mat1.length == mat2.length && mat1[0].length == mat2[0].length;
    }

    public static int[][] addMatr(int[][] mat1, int[][] mat2) {
        if(checkMatrixCompat(mat1, mat2)){return null;}
        int[][] result = new int[mat1.length][mat1[0].length];
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[0].length; j++) {
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        return result;
    }

}
