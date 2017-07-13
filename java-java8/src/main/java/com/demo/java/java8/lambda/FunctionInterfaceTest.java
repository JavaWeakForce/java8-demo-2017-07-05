package com.demo.java.java8.lambda;

import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

/**
 * Created by maobufan on 17/7/6.
 */
public class FunctionInterfaceTest {

    public static void main(String []args){
        /**
         * eg1
         */
       Runnable run= () -> {
            for (int i = 0; i < 10; i++) {
                if (i % 2 == 0){
                    System.out.print("hello_" + i);
                }
            }
        };
        run.run();

        System.out.println("***********");

        /**
         * eg2
         */
        ITest test=() ->{
            return "4";
        };
        String tStr=test.get();

        String str=test.getStr(8);

        ITest timpl=new TestImpl();

        boolean equals=test.equals("4");

        System.out.print(tStr+"   "+str+"   "+equals+"    "+test+"   "+timpl.get());
        System.out.println("***********");
        /**
         * eg3
         */
      ITest testimp=  ()-> {
          int sum=0;
            for (int j = 3; j < 10; j++) {
                sum=sum+j;
            }
            return sum+"";
        };
        String timpStr=testimp.get();
        System.out.print(timpStr);

        System.out.println("***********");

        /**
         * paramter
         * eg 4
         */
        IParaTest ipTest=(a)->{
            return a;
        };
        int a=ipTest.get(5);
        System.out.print(a);
        System.out.println("***********");
        /**
         * eg 5
         */
        Supplier<Integer> supplier=() ->{
            return 3;
        };
        System.out.print(supplier.get());

        System.out.println("***********");

        /**
         * eg 6
         */
        UnaryOperator<Integer> unary= T->T;

        System.out.print(unary.apply(123));
        System.out.println("***********");

        /**
         * eg 7
         */
        Predicate<Integer> predicate=(m)->{
            if(a>5){
                return true;
            }
            return false;
        };
        System.out.print(predicate.test(7));

    }
}
