package workshop;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CharacterBaseLeader {
    public static void main(String[] args) {
        try(BufferedReader reader= new BufferedReader(new FileReader("E:\\coding\\java-workshop\\src\\com\\vetias\\java\\workshop\\hari.txt"))){
    String line;
    while ((line = reader.readLine())!=null) {
        System.out.println(line);
        
    }        
        }catch(IOException e){
            System.out.println("An error occured in reading the file:");
            e.printStackTrace();
        }
    }

}
