package com.vetias.collection;

import java.util.Map;

public class StudentMap {
    public static void main(String[] args) {
        Map<Integer, String> studentMap = new java.util.HashMap<>();
        studentMap.put(101, "Alice");
        studentMap.put(102, "Bob");
        studentMap.put(103, "Charlie");
        studentMap.put(104, "David");
        studentMap.put(105, "Eve");

        System.out.println(studentMap);
    }

}
