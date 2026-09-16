public class TransposeArray {
    public static void main(String[] args) {
        int[][] original = {
            {20, 60, 50},
            {50, 90, 10}
        };

        System.out.println("Original Array:");
        printMatrix(original);

        int rows = original.length;
        int cols = original[0].length;
        int[][] transposed = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = original[i][j];
            }
        }

        System.out.println("After changing the rows and columns of the said array:");
        printMatrix(transposed);
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}