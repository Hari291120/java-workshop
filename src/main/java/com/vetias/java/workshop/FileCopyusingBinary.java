package com.vetias.java.workshop;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.imageio.stream.FileImageOutputStream;

public class FileCopyusingBinary {

    public static void main(String[] args) {
        try(FileInputStream in = new FileInputStream("dhoni-2016-getty_1654515327472_1657137509048.avif");
            FileOutputStream outputsStram =new FileOutputStream("Mylogo.jpeg"))
    {
        byte[] chunk = new byte[2048];
        int byteRead;
        while((byteRead=in.read(chunk))!=-1){
            outputsStram.write(chunk,0,byteRead);



        }
            
        }catch(IOException e){
            System.out.println("Error in Reading or Writing the file");
        }

            }

        

    }


