package com.demo.java.java8.lambda;

import com.demo.java.java8.lambda.po.Student;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by maobufan on 17/7/6.
 */
public class SortTest {

    public static void main(String[] args) {
        //sort
        List<Student> studentList = Student.list();
        /**
         * sort eg1 method body need return statement
         */
        Comparator<Student> studentComparator = (Student a, Student b) -> {
            return a.getScore().compareTo(b.getScore());
        };
        studentList.sort(studentComparator);
        Student.print(studentList);
        System.out.println("**********");
        /**
         * 反转
         */
        studentList.sort(studentComparator.reversed());
        Student.print(studentList);
        System.out.println("**********");
        /**
         * sort eg2
         */
        Collections.sort(studentList, (Student a, Student b) -> a.getId().compareTo(b.getId()));
        Student.print(studentList);

        System.out.println("**********");

        /**
         * sort eg3
         */
        studentList.sort((Student s1, Student s2) -> s2.getScore().compareTo(s1.getScore()));
        Student.print(studentList);
        System.out.println("**********");

        /**
         * eg 4
         */
        List<Student> students = Arrays.asList(new Student(34L, "feixiang"), new Student(35L, "feiyu"), new Student(32L, "feixiang"));

        students.sort((s1,s2)->{
            if(s1.getName().equals(s2.getName())){
                return s2.getId().compareTo(s1.getId());
            }
            return s1.getName().compareTo(s2.getName());
        });
        Student.print(students);

        /**
         * eg 5
         * first sort by id
         * then sort by name
         */
        students.sort(Comparator.comparing(Student::getId).thenComparing(Student::getName));

        Student.print(students);

    }

}
