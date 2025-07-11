package com.vetias.string;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayStream {
    public static void main(String[] args) {
         int[]marks={10,20,30,40,50,60,70,80,90,100};
    long numberofSubjectpassed = Arrays.stream(marks)
    .filter(mark-> mark > 40).count();
    System.out.println(numberofSubjectpassed);

    IntStream markStream = Arrays.stream(marks);
    numberofSubjectpassed = markStream
    .filter(mark -> mark > 40).count();
    }
   

}
