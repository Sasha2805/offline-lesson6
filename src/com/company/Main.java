package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();
        students.add(new Student("Becker", 1));
        students.add(new Student("Farrell", 1));
        students.add(new Student("Dodson", 5));
        students.add(new Student("Becker", 4));
        students.add(new Student("Edwards", 3));
        students.add(new Student("Bush", 5));
        students.add(new Student("Bush", 5));
        Student.printStudents(students);

        Set<Student> students1 = new HashSet<>();
        students1.add(new Student("Becker", 1));
        students1.add(new Student("Farrell", 1));
        students1.add(new Student("Dodson", 4));
        students1.add(new Student("Bush", 5));

        Set<Student> students2 = new HashSet<>();
        students2.add(new Student("Becker", 4));
        students2.add(new Student("Edwards", 3));
        students2.add(new Student("Bush", 5));
        students2.add(new Student("Dodson", 4));

        Set<Student> students3 = Student.union(students1,students2);
        Student.printStudents(students3);
        students3 = Student.intersect(students1, students2);
        Student.printStudents(students3);

        PerformanceChecker.checkAdding( 10000, new ArrayList<>());
        PerformanceChecker.checkAdding( 10000, new LinkedList<>());
        PerformanceChecker.checkAdding( 10000, new TreeSet<>());
        PerformanceChecker.checkAdding( 10000, new HashSet<>());

        PerformanceChecker.checkReading( 10, new ArrayList<>());
        PerformanceChecker.checkReading( 10, new LinkedList<>());
        PerformanceChecker.checkReading( 100, new TreeSet<>());
        PerformanceChecker.checkReading( 100, new HashSet<>());

    }

}
