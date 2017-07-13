package com.demo.java.java8.lambda;

import com.demo.java.java8.lambda.po.Student;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by maobufan on 17/7/12.
 */
public class FilterTest {

    public static void main(String []args){
        /**
         * eg 1
         */
        List<Integer> nums= Arrays.asList(34,56,12,33,51,24);
        String strings=nums.stream().filter((num)->num>30).map((n)->n.toString()).collect(Collectors.joining(","));
        System.out.print(strings);
        /**
         * eg 2
         */
        List<Student> students=Student.list();
        List<Student> studentsList=students.stream().filter(student -> student.getId()>65).collect(Collectors.toList());
        Student.print(studentsList);

        /**
         * eg3
         */
        List<Long> names=students.stream().filter(student -> student.getId()>63).map(Student::getId).collect(Collectors.toList());
        System.out.println(names);
    }
}
