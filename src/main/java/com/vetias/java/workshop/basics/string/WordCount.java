package com.vetias.java.workshop.basics.string;

import com.vetias.java.workshop.basics.string.WordCount;
public class WordCount {
   public int count(String inputString){
      int count=0;
      String[]words=inputString.split("");
      count=words.length;
      return count;

   }
}
   
   



