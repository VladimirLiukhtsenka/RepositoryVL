package by.epamtc.ProgrammingWithClasses.SimplestClassesAndObjects.SCAO7.view;

import by.epamtc.ProgrammingWithClasses.SimplestClassesAndObjects.SCAO7.logic.TriangleLogic;
import by.epamtc.ProgrammingWithClasses.SimplestClassesAndObjects.SCAO7.bean.Triangle;

public class TriangleView {
    private TriangleLogic triangleLogic = new TriangleLogic();

    public void printTriangle(Triangle triangle) {

        System.out.printf("Периметр треугольника: %3.2f. Площадь треугольника: %3.2f. "
                , triangleLogic.trianglePerimeter(triangle),
                triangleLogic.triangleSquare(triangle));
        System.out.printf("Точка пересечения медиан: x(%3.2f) y(%3.2f).", triangleLogic.intersectingMedians(triangle).getX(),
                triangleLogic.intersectingMedians(triangle).getY());
    }
}
