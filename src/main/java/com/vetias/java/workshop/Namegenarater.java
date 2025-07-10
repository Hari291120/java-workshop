package com.vetias.java.workshop;

import java.util.Scanner;

public class Namegenarater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name=scanner.nextLine();
        System.out.println("Enter your gender:");
        String gender= scanner.nextLine();
        System.out.println("Enter your qulification:");
        String qulification=scanner.nextLine();
        if("male".equals(gender)){
            System.out.println("Mr,"+ name+" "+qulification);
        }
        else{
            System.out.println("Miss."+name+" "+qulification);
        } 
     }
}
