public class DiagonalSum {

    public static int diagonalSum(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == j) {
                    sum += matrix[i][j];
                } else if (i + j == matrix.length - 1) {
                    sum += matrix[i][j];
                }
            }
        }

        return sum;

        // int sum = 0;
        // int n = matrix.length; // Assuming a square matrix for simplicity

        // for (int i = 0; i < n; i++) {
        // // Primary diagonal: elements where row index equals column index
        // sum += matrix[i][i];

        // // Secondary diagonal: elements where the row index and column index sum to
        // n-1
        // // Check to avoid adding the central element of an odd-dimension matrix twice
        // if (i != n - 1 - i) {
        // sum += matrix[i][n - 1 - i];
        // }
        // }

        // return sum;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };

        int sum = diagonalSum(matrix);
        System.out.println("Sum of diagonals: " + sum);
    }
}
