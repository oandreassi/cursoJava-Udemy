package com.company.SetAndMap.ExercicioSet2;

import java.util.HashSet;
import java.util.Set;

public class AppStudent {

    public static void main(String[] args) {

        Set<Integer> studentsCourseA = new HashSet<>();
        Set<Integer> studentscourseB = new HashSet<>();
        Set<Integer> studentscourseC = new HashSet<>();

        studentsCourseA.add(21);
        studentsCourseA.add(35);
        studentsCourseA.add(22);

        studentscourseB.add(21);
        studentscourseB.add(50);

        studentscourseC.add(42);
        studentscourseC.add(35);
        studentscourseC.add(13);

        Set<Integer> totalStudents = new HashSet<>(studentsCourseA);
        totalStudents.addAll(studentscourseB);
        totalStudents.addAll(studentscourseC);

        System.out.println("Total students: " + totalStudents.size());
    }
}
