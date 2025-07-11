package com.vetias.string;

import java.util.ArrayList;
import java.util.List;

public class StreamUpperCaseName {
     public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("hari");
        names.add("jai");
        names.add("naveen");
        names.add("nithish");
        names.add("siva");
        names.stream()
        .filter(name->name.startsWith("s")|| name.startsWith("n"))
        .distinct().map(String::toUpperCase).forEach(System.out::println);
    }

}
