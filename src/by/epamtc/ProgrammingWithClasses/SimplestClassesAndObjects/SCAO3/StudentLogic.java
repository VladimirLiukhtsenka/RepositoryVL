package by.epamtc.ProgrammingWithClasses.SimplestClassesAndObjects.SCAO3;

public class StudentLogic {

    public boolean isExcellentStudent(Student student) {
        boolean flag = true;
        for (int i = 0; i < student.getMarks().length; i++) {
            if (student.getMarks()[i] < 9) {
                flag = false;
            }
        }
        return flag;
    }
}