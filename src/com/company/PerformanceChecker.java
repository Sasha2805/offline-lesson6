package com.company;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class PerformanceChecker {

    public static void checkAdding(int count, Collection<Student> collection){
        long beforeFill = System.currentTimeMillis();
        for (int i = 0; i < count; i++){
            collection.add(new Student());
        }
        long afterFill = System.currentTimeMillis();
        System.out.println("The total time is: "+ (afterFill - beforeFill) + "ms");
    }

    public static void checkReading(int count, List<Student> list){
        for (int i = 0; i < count; i++){
            list.add(new Student());
        }
        long timeMillis = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            int index = (int) (Math.random() * count);
            System.out.println(list.get(index));
        }
        System.out.println("The total time is: "+ (System.currentTimeMillis() - timeMillis) + "ms");
    }

    public static void checkReading(int count, Set<Student> set){
        for (int i = 0; i < count; i++){
            set.add(new Student());
        }
        Iterator<Student> iterator = set.iterator();
        Student student = new Student();
        long timeMillis = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            int index = (int) (Math.random() * count);
            for (int j = 0; j <= index; j++){
                if (iterator.hasNext()){
                    student  = iterator.next();
                }
                if (j == index){
                    System.out.println("[" + index + "]" + " - " + student);
                }
            }
        }
        System.out.println("The total time is: "+ (System.currentTimeMillis() - timeMillis) + "ms");
    }

    public static void checkRemoving(int count, List<Student> list){
        for (int i = 0; i < count; i++){
            list.add(new Student());
        }
        long timeMillis = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            int index = (int) (Math.random() * count);
            list.remove(index);
        }
        System.out.println("The total time is: "+ (System.currentTimeMillis() - timeMillis) + "ms");
    }

    public static void checkRemoving(int count, Set<Student> set){
        for (int i = 0; i < count; i++){
            set.add(new Student());
        }
        Iterator<Student> iterator = set.iterator();
        Student student = new Student();
        long timeMillis = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            int index = (int) (Math.random() * count);
            for (int j = 0; j <= index; j++){
                if (iterator.hasNext()){
                    student  = iterator.next();
                }
                if (j == index){
                   set.remove(student);
                }
            }
        }
        System.out.println("The total time is: "+ (System.currentTimeMillis() - timeMillis) + "ms");
    }
}
