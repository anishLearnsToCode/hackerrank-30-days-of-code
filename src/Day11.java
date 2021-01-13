import java.util.Scanner;

public class Day11 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] matrix = getMatrix();
        System.out.println(maximumHourglassSum(matrix));
    }

    private static int[][] getMatrix() {
        int[][] matrix = new int[6][6];
        for (int i = 0 ; i < 6 ; i++) {
            for (int j = 0 ; j < 6 ; j++) {
                matrix[i][j] = SCANNER.nextInt();
            }
        }
        return matrix;
    }

    private static int maximumHourglassSum(int[][] matrix) {
        int maximumSum = -Integer.MAX_VALUE;
        for (int row = 0; row < 4 ; row++) {
            for (int column = 0 ; column < 4 ; column++) {
                maximumSum = Math.max(maximumSum, hourglassSum(matrix, row, column));
            }
        }
        return maximumSum;
    }

    private static int hourglassSum(int[][] matrix, int row, int column) {
        int sum = 0;
        for (int i = 0 ; i < 3 ; i++) {
            sum += matrix[row][column + i] + matrix[row + 2][column + i];
        }
        return sum + matrix[row + 1][column + 1];
    }
}
