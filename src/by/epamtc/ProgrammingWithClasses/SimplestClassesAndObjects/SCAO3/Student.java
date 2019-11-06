package by.epamtc.ProgrammingWithClasses.SimplestClassesAndObjects.SCAO3;

import java.util.Arrays;

public class Student {
    private String name;
    private int groupNumber;
    private int[] marks;

    public Student(String name, int groupNumber, int[] marks) {
        this.name = name;
        this.groupNumber = groupNumber;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", groupNumber=" + groupNumber +
                ", marks=" + Arrays.toString(marks) +
                '}';
    }
}
