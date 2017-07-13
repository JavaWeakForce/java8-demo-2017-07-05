package com.demo.java.java8.lambda;

import com.google.common.collect.Lists;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by maobufan on 17/7/11.
 */
public class PredicateTest {

    private static List<String> stringList= Lists.newArrayList();

    public static void main(String []args){
        List<String> names= Arrays.asList("zhangsan","lisi","wangwu");
//        names.forEach((str)->filter(str,str.length()>4));
//        System.out.print(stringList);
////        filter(names, (str)-> str.length()>5);
//        filter(names, ((str) -> str.length() > 4));
//        names.forEach((str)->{
//            if(str.length()>4){
//                stringList.add(str);
//            }
//        });

        filter3(names,(name)->name.startsWith("z"));
        System.out.print(stringList);
        Predicate<String> predicate1=(str)->str.startsWith("z");
        Predicate<String> predicate2=(str)->str.length()==7;
        filter4(Arrays.asList("zhangsan","wangwu","zhangsi","zhangwu"),predicate1.and(predicate2));
    }



    public static void filter(String name,boolean isTrue){
        if(isTrue){
            stringList.add(name);
        }
    }

    public static void filter(List<String> names,Predicate<String> predicate){
        /**
         * eg 1
         */
        names.forEach((name)->{
            if(predicate.test(name)){
                stringList.add(name);
            }
        });
        /**
         * eg 2
         */
        for(String name: names)  {
            if(predicate.test(name)) {
                System.out.println(name + " ");
            }
        }
    }

    public static void filter2(List<String> names,Predicate<String> predicate){

        /**
         * eg 2
         */
        for(String name: names)  {
            if(predicate.test(name)) {
                System.out.println(name + " ");
            }
        }
    }

    public static void filter3(List<String> names,Predicate<String> predicate){

        /**
         * eg 3
         */
        names.stream().filter((name) -> predicate.test(name)).forEach((str)->{
            stringList.add(str);
        });
    }

    public static void filter4(List<String> names,Predicate<String> predicate){
        /**
         * eg 4
         */
        names.stream().filter(predicate).forEach((str)->{
            System.out.print(str);
        });
    }
}
