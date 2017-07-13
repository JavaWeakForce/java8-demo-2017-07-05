package com.demo.java.java8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by maobufan on 17/7/12.
 */
public class MapTest {

    public static void main(String []args){

        List<Integer> nums= Arrays.asList(1,2,3,4,5);
        /**
         * eg 1
         */
        nums.stream().map((num)->num+1).forEach((n)->System.out.print(n+" "));
        System.out.println(nums);

        /**
         * eg 2
         */
        Integer total=nums.stream().reduce((sum,num)->sum*num).get();
        System.out.println(total);

        /**
         * eg 3
         */
       IntStream intStream=nums.stream().mapToInt((a)->a);
       System.out.println(intStream.sum());


    }

}
