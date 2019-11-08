package by.epamtc.ProgrammingWithClasses.SimplestClassesAndObjects.SCAO3;

import java.util.Arrays;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return groupNumber == student.groupNumber &&
                Objects.equals(name, student.name) &&
                Arrays.equals(marks, student.marks);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, groupNumber);
        result = 31 * result + Arrays.hashCode(marks);
        return result;
    }
}
