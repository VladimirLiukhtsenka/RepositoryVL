package by.epamtc.Algorithmization.ArraysOfArrays;

/*
16. Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3,
...,n^2 так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между
собой. Построить такой квадрат.
 */
public class AOA16 {
    public static void main(String[] args) {
        int n = 3;
        int sumRow;
        int sumColumn = 0;
        int sumFirstDiag = 0;
        int sumSecondDiag = 0;
        boolean flag;
        boolean isMagicSquare = false;
        int sumArithProgress = ((1 + n * n) * n * n) / 2;
        int mastSumForMagicSquare = sumArithProgress / n;
        int[][] matrix = new int[n][n];
        while (!isMagicSquare) {
            //создаем массив для хранения чисел
            int[] difNum = new int[n * n];
            int countDifNum = 0;
            isMagicSquare = true;
            //запалняем матрицу
            for (int i = 0; i < matrix.length; i++) {
                sumRow = 0;
                for (int j = 0; j < matrix[0].length; j++) {
                    flag = false;
                    while (!flag) {
                        int random = (int) (Math.random() * (n * n)) + 1;
                        //проверяем находится ли число в массиве
                        if (!ConteinsNumber(random, difNum)) {
                            matrix[i][j] = random;
                            difNum[countDifNum] = random;
                            countDifNum++;
                            flag = true;
                            sumRow += matrix[i][j];
                        }
                    }
                }
                if (sumRow != mastSumForMagicSquare) {
                    isMagicSquare = false;
                    break;
                }
            }
            if (!isMagicSquare) {
                continue;
            }
            sumRow = 0;
            //подсчитываем суммы в стоках,столбцах и диагоналях
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    sumRow += matrix[i][j];
                    sumColumn += matrix[j][i];
                    if (i == j) {
                        sumFirstDiag += matrix[i][j];
                    }
                    if (i + j == n - 1) {
                        sumSecondDiag += matrix[i][j];
                    }
                }
                //условие для проверки квадрата на магию
                if (sumColumn != mastSumForMagicSquare || sumRow != mastSumForMagicSquare) {
                    isMagicSquare = false;
                    break;
                }
                sumRow = 0;
                sumColumn = 0;
            }
            //условие для проверки квадрата на магию
            if (sumFirstDiag != mastSumForMagicSquare || sumSecondDiag != mastSumForMagicSquare) {
                isMagicSquare = false;
            }
            sumColumn = 0;
            sumFirstDiag = 0;
            sumSecondDiag = 0;
        }
        //печатаем магический квадрат
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.printf(" %3d", matrix[i][j]);
            }
            System.out.println();
        }
    }

    private static boolean ConteinsNumber(int numb, int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] == numb) {
                return true;
            }
        }
        return false;
    }
}
