package kgTeacher;

import java.util.Comparator;
import java.util.PriorityQueue;

class PriorityQueueEg {
    public static void main(String[] args) {
        PriorityQueue<Student> queue= new PriorityQueue<>(new Comparator<T>();

    public int comparator(Student student, Student t1) {
        return student.getGrade() - t1.getGrade();
    }
});

class Student {
    private final String name;
    private final char grade;

    public Student(String name, char grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public char getGrade() {
        return grade;
    }

}}
