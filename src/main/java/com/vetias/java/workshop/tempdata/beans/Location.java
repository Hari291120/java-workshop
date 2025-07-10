package com.vetias.java.workshop.tempdata.beans;
public class Location {
    private String name;
    private double latitude;
    private double longitude;
    private String description;
    private String country;
    private String city;
    private String address;
    public void setName(String aName ){
        name = aName; }
      public String getname() {
        return name;
    }

      public void setlatitude(double alatitude){
          latitude = alatitude;
    }
        public double getlatitude(){
          return latitude;
    } 
        public void setlongtitude(double along){
            longitude=along;
    }
        public double getlongtitude(){
            return longitude;
    }
       public void setdescrription( String des){
         description = des;
       }

          public String getdescription() {
            return description;
    }
          public void setaddress(String addresses) {
            address = addresses;
    }
          public String getaddress(String address){
             return address;
    }          
@Override
          public String toString(){
            return"Location{"+
                  "name:'"+ name + '\''+
                  ",latitude;"+ latitude +
                  ", longitude:"+ longitude +
                  ",address:'"+ address +'\''+
                '}';
            }
          }                                                                                                                                                          
