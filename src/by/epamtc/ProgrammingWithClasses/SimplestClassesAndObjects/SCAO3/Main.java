package by.epamtc.ProgrammingWithClasses.SimplestClassesAndObjects.SCAO3;


/*
3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив из пяти элементов).
Создайте массив из десяти элементов такого типа.
Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10.
 */
public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[10];
        students[0] = new Student("Petrov I.V.", 3, new int[]{8, 9, 8, 7, 6});
        students[1] = new Student("Ivanov P.V.", 2, new int[]{9, 9, 10, 9, 10});
        students[2] = new Student("Morozov D.A.", 3, new int[]{4, 9, 7, 7, 5});
        students[3] = new Student("Nikanovich P.A", 1, new int[]{10, 9, 10, 9, 10});
        students[4] = new Student("Tkachev A.I", 4, new int[]{9, 9, 10, 9, 10});
        students[5] = new Student("Ignatov V.K.", 3, new int[]{8, 6, 8, 7, 7});
        students[6] = new Student("Pavlov D.P.", 2, new int[]{7, 9, 5, 8, 6});
        students[7] = new Student("Zaicev G.V.", 1, new int[]{5, 9, 5, 7, 7});
        students[8] = new Student("Izumovich G.A.", 3, new int[]{6, 7, 8, 7, 9});
        students[9] = new Student("Ptichkin V.V.", 4, new int[]{8, 9, 6, 9, 6});
        StudentView studentView = new StudentView();
        for (Student student : students) {
            studentView.printExellentStudent(student);
        }
    }
}
