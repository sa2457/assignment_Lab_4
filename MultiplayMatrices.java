public class MultiplayMatrices {

    public static void main(String[] args) {
        int row1 = 2, column1 = 3;
        int row2 = 3, column2 = 2;
        int[][] firstMatrix = { {3, 2, 7}, {3, 5, 4} };
        int[][] secondMatrix = { {6, 3}, {9, 0}, {7, 4} };

        int[][] product = new int[row1][column2];
        for(int i = 0; i < row1; i++) {
            for (int j = 0; j < column2; j++) {
                for (int k = 0; k < column1; k++) {
                    product[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                }
            }
        }


        System.out.println("Prouduct of two matrices is: ");
        for(int[] row : product) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }
    }
}
