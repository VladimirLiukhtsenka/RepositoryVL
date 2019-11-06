package by.epamtc.ProgrammingWithClasses.SimplestClassesAndObjects.SCAO1;

/*
1. Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих переменных.
Добавьте метод, который находит сумму значений этих переменных, и метод,
который находит наибольшее значение из этих двух переменных.
 */

public class Main {
    public static void main(String[] args) {
        Test1 test1 = new Test1(3, 2);
        Test1View test1View = new Test1View();
        Test1Logic test1Logic = new Test1Logic();
        test1View.print(test1);
        test1.setA(3.1);
        test1.setB(2.1);
        System.out.println(test1Logic.sum(test1));
        System.out.println(test1Logic.max(test1));
    }
}
