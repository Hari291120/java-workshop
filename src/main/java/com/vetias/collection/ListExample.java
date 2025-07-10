package com.vetias.collection;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
 public static void main(String[] args) {
    List<String> names = new ArrayList<>();
    names.add("hari");
    names.add("jai");
    names.add("naveen");
    names.add("nithish");
      

    System.out.println(names);
    names.remove(1);
    for(int i= 0;i<names.size();i++){
        System.out.println(names.get(i));
    
    }
    
 }
}
 