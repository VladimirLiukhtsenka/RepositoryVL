package by.epamtc.Algorithmization.Decomposition;

/*
9. Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади,
если угол между сторонами длиной X и Y— прямой.
 */
public class D9 {
    public static void main(String[] args) {
        double x = 3;
        double y = 4;
        double z = 3.5;
        double t = 2.5;
        System.out.printf("%3.3f", TetragonArea(x, y, z, t));
    }

    private static double TriangleArea(double side1, double side2, double side3) {
        double p = (side1 + side2 + side3) / 2;
        return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }

    private static double Hupotenuse(double a, double b) {
        double hup = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        return hup;
    }

    private static double TetragonArea(double x, double y, double z, double t) {
        //разбиваем четырехугольник на два треугольника, один из которых точно прямоугольный
        double hypotenuse = Hupotenuse(x, y);
        double rightTriangleArea = TriangleArea(x, y, hypotenuse);
        double secondTriangleArea = TriangleArea(hypotenuse, z, t);
        // сумма четырехугольника = сумме двух этих треугольников
        return rightTriangleArea + secondTriangleArea;
    }
}
