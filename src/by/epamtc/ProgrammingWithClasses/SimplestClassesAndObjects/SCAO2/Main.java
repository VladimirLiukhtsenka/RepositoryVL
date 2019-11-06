package by.epamtc.ProgrammingWithClasses.SimplestClassesAndObjects.SCAO2;

/*
2. Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами.
Добавьте конструктор, инициализирующий члены класса по умолчанию.
Добавьте set- и get- методы для полей экземпляра класса.
 */
public class Main {
    public static void main(String[] args) {
        Test2 test2 = new Test2(5, 6);
        test2.setA(3);
        test2.setB(4);
        System.out.println(test2.getA() + " " + test2.getB());
        test2 = new Test2();
        System.out.println(test2.getA() + " " + test2.getB());
    }
}
