package workshop.tempdata.beans;

import java.time.LocalDateTime;

public class Building {
      private String name;
      private double area;
      private int floors;
      private LocalDateTime openDataTime;
      private LocalDateTime closeDataTime;
      private String description;
      public void area(double area){
            area=area;
      }
         public double getarea(){
            return area;
         } 
      public void floor (double floor) {
            floor=floor;    
      }     
      public double getfloor(){
            return floors;
      }
         }
      

