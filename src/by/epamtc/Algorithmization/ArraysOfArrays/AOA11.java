package by.epamtc.Algorithmization.ArraysOfArrays;

/*
11. Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
которых число 5 встречается три и более раз.
 */
public class AOA11 {
    public static void main(String[] args) {
        int row = 10;
        int column = 20;
        int countFive = 0;
        boolean isFive = false;
        int[][] matrix = new int[row][column];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = (int) (Math.random() * 16);
                System.out.printf(" %3d", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.print("Номера строк, в которых число 5 встречается три и более раз: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 5) {
                    countFive++;
                }
                if (countFive >= 3) {
                    isFive = true;
                }
            }
            if (isFive) {
                System.out.print(i + "; ");
            }
            isFive = false;
            countFive = 0;
        }
    }
}
