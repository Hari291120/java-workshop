package com.vetias.java.workshop.tempdata.beans;

import java.time.LocalDateTime;

public class Building {
      private String name;
      private double area;
      private int floors;
      private LocalDateTime openDataTime;
      private LocalDateTime closeDataTime;
      



      public void printdetails(){
            System.out.println(name);
      }
}    

