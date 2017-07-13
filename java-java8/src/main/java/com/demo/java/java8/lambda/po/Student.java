package com.demo.java.java8.lambda.po;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.Random;

/**
 * Created by maobufan on 17/7/6.
 */
public class Student {

    private Long Id;

    private String name;

    private Double score;

    public Student() {
    }

    public Student(Long id, String name) {
        Id = id;
        this.name = name;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}'+"\r\n";
    }

    public static List<Student> list(){
        Random random=new Random();
        List<Student> studentList= Lists.newArrayList();
        for(long i=60;i<70;i++){
            Student student=new Student();
            student.setId(i);
            student.setName("stu_"+(i-60));
            student.setScore(Double.valueOf(random.nextInt(90)+" "));
            studentList.add(student);
        }
        return studentList;
    }

    public static void print(List<Student> list){
        for(Student student:list){
            System.out.print(student);
        }
    }
}
