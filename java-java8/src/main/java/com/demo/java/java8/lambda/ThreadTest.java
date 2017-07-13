package com.demo.java.java8.lambda;

/**
 * Created by maobufan on 17/7/6.
 */
public class ThreadTest {

    public static void main(String []args){
        new Thread(() -> System.out.print("hello world")).start();
    }
}
