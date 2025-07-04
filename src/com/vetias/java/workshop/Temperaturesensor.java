package workshop;
import workshop.tempdata.beans.Sensor;

public class Temperaturesensor implements Sensor {
           private float temperature ;
           public Temperaturesensor (float aTemperature){
             temperature=aTemperature;
}
           public float getReading(){
            return temperature;
           }

}
