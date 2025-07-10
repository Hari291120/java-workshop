package com.vetias.java.workshop;

public class Temperaturesensor implements Sensor {
           private float temperature ;
           public Temperaturesensor (float aTemperature){
             temperature=aTemperature;
}
           public float getReading(){
            return temperature;
           }

}
