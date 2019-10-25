package by.epamtc.Algorithmization.Decomposition;
import java.util.Scanner;
/*
4. На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими
из пар точек самое большое расстояние. Указание. Координаты точек занести в массив.
 */
public class D4 {
    public static void main(String[] args) {
        double maxDistance = 0;
        int pointOne = 0;
        int pointTwo = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество точек: ");
        int n = sc.nextInt();
        int[] coordinateX = new int[n];
        int[] coordinateY = new int[n];
        for (int i = 0; i < n; i++) {
            coordinateX[i] = (int) (Math.random() * 21);
            coordinateY[i] = (int) (Math.random() * 21);
            System.out.println("Точка " + i + " имеет координаты [x,y]: [" + coordinateX[i] + "," + coordinateY[i] + "]");

        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (maxDistance < (Distance(coordinateX[i], coordinateY[i], coordinateX[j], coordinateY[j]))) {
                    maxDistance = (Distance(coordinateX[i], coordinateY[i], coordinateX[j], coordinateY[j]));
                    pointOne = i;
                    pointTwo = j;
                }
            }
        }
        System.out.print("Наибольшее расстояние между точкой  " + pointOne + " и точкой " + pointTwo + " равное: ");
        System.out.printf("%3.1f", maxDistance);
    }

    private static double Distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
    }
}
