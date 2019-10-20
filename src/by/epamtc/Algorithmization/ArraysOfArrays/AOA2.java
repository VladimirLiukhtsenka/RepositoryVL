package by.epamtc.Algorithmization.ArraysOfArrays;

/*
2. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
 */
public class AOA2 {
    public static void main(String[] args) {
        int[][] matrix = new int[7][7];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = (int) (Math.random() * 11);
                System.out.print(" " + matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Элементы, стоящие на диагонали: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (j == i) {
                    System.out.print(" " + matrix[i][j] + " ");
                }
            }
        }
    }
}
