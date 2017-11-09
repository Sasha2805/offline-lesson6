package com.company;

import java.util.*;

public class Student implements Comparable<Student>{
    private String name;
    private int course;

    public Student() {
        this("", 0);
    }

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public static void printStudents(Set<Student> students){
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            System.out.println(student);
        }
    }

    public static void printStudents(Set<Student> students, int course){
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getCourse() == course){
                System.out.println(student);
            }
        }
    }

    public static Set<Student> union(Set<Student> set1, Set<Student> set2){
        Set<Student> students = new HashSet<>();
        students.addAll(set1);
        students.addAll(set2);
        return students;
    }

    public static Set<Student> intersect(Set<Student> set1, Set<Student> set2){
        Set<Student> students = new LinkedHashSet<>();
        Iterator<Student> iterator = set2.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (set1.contains(student)){
               students.add(student);
            }

        }
        return students;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (course != student.course) return false;
        return name.equals(student.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + course;
        return result;
    }

    @Override
    public int compareTo(Student student) {
        return (this.course - student.course);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

}
