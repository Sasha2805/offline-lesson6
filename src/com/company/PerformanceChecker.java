package com.company;

import java.util.Collection;
import java.util.Iterator;

public class PerformanceChecker {

    public static void checkAdding(int count, Collection<Student> collection){
        long beforeFill = System.currentTimeMillis();
        for (int i = 0; i < count; i++){
            collection.add(new Student());
        }
        System.out.println("The total time is: "+ (System.currentTimeMillis() - beforeFill) + "ms");
    }

    public static void checkReading(int count, Collection<Student> collection){
        for (int i = 0; i < count; i++){
            collection.add(new Student());
        }
        Iterator<Student> iterator = collection.iterator();
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


    public static void checkRemoving(int count, Collection<Student> collection){
        for (int i = 0; i < count; i++){
            collection.add(new Student());
        }
        Iterator<Student> iterator = collection.iterator();
        Student student = new Student();
        long timeMillis = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            int index = (int) (Math.random() * count);
            for (int j = 0; j <= index; j++){
                if (iterator.hasNext()){
                    student  = iterator.next();
                }
                if (j == index){
                   collection.remove(student);
                }
            }
        }
        System.out.println("The total time is: "+ (System.currentTimeMillis() - timeMillis) + "ms");
    }
}
