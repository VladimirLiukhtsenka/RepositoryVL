package by.epamtc.ProgrammingWithClasses.SimplestClassesAndObjects.SCAO7;


import by.epamtc.ProgrammingWithClasses.SimplestClassesAndObjects.SCAO7.bean.Point;
import by.epamtc.ProgrammingWithClasses.SimplestClassesAndObjects.SCAO7.bean.Triangle;
import by.epamtc.ProgrammingWithClasses.SimplestClassesAndObjects.SCAO7.view.TriangleView;

/*
7. Описать класс, представляющий треугольник.
Предусмотреть методы для создания объектов, вычисления площади, периметра и точки пересечения медиан.
 */
public class Main {
    public static void main(String[] args) {
        Point pointA = new Point(1, 3);
        Point pointB = new Point(4, 1);
        Point pointC = new Point(-4, 1);
        Triangle triangle = new Triangle(pointA, pointB, pointC);
        TriangleView triangleView = new TriangleView();
        triangleView.printTriangle(triangle);
    }
}
