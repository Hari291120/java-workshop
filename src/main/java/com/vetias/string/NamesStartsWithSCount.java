package com.vetias.string;

import java.util.ArrayList;
import java.util.List;

public class NamesStartsWithSCount {
    public static void main(String[] args) {
      List<String>names=new ArrayList<>();
      names.add("hari");
      names.add("jai");
      names.add("naveen");
      names.add("nithish");
      names.add("siva");
      long nameCount=names.stream()
         .filter(name->name.startsWith("n")).count();
      System.out.println(nameCount);

    }

}
