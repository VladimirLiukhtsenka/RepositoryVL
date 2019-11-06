package by.epamtc.ProgrammingWithClasses.SimplestClassesAndObjects.SCAO3;

public class StudentView {
    private StudentLogic studentLogic = new StudentLogic();

    public void printExellentStudent(Student student) {
        if (studentLogic.isExcellentStudent(student)) {
            System.out.println("Отличник " + student.getName() + " Из руппы: " + student.getGroupNumber());
        }
    }
}
