package com.demo.java.java8.lambda;

import com.demo.java.java8.lambda.po.Student;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by maobufan on 17/7/6.
 */
public class StreamTest {

    public static void main(String []args){

        Map<Integer,String> map= Maps.newHashMap();

        List<Student> students=Student.list();

        /**
         * eg 1
         */

        List<String> names=students.stream().map((Student a)-> {
                if(a.getId()==65){
                    return a.getName();
                };
               return "-";
        }).collect(Collectors.toList());

        System.out.print(names);
        System.out.println("************");

        /**
         * eg 2
         */

        List<Student> filterStu=students.stream().map((Student b)->{
            if(b.getId()>65){
               return b;
            }
            return null;
        }).filter(a->{ return a!=null;}).collect(Collectors.toList());

        Student.print(filterStu);
//        List<Student> filterStu2=students.stream().map((s)-> s.getId()>65);
        System.out.println("****************");

        /**
         * eg 3
         */

        List<Student> studentList= Arrays.asList(new Student(34L, "feixiang"), new Student(35L, "feiyu"), new Student(32L, "feixiang"));
        List<String> nameList=studentList.stream().map(Student::getName).collect(Collectors.toList());
        System.out.print(nameList);
        List<Long> ids=studentList.stream().map((s)->s.getId()).collect(Collectors.toList());
        System.out.print(ids);








    }

}
