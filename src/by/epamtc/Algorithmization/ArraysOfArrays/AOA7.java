package by.epamtc.Algorithmization.ArraysOfArrays;
import static java.lang.Math.*;
/*
7. Сформировать квадратную матрицу порядка N по правилу:
A [I,J]=sin((I^2-J^2)/N)] и подсчитать количество положительных элементов в ней.
 */
public class AOA7 {
    public static void main(String[] args) {
        int n = 10;
        int count=0;
        double[][] matrix = new double[n][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] =  sin((pow(i,2)-pow(j,2))/n);
                System.out.printf( "%10.3f",matrix[i][j]);
                if (matrix[i][j]>0){
                    count++;
                }
            }
            System.out.println();
        }
        System.out.println("\n"+"Количество положительных элементов в матрице: "+count);
    }
}
