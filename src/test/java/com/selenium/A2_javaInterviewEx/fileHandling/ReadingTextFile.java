package com.selenium.A2_javaInterviewEx.fileHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingTextFile {

    public static void main(String[] args)  {
        //**Reading a text file:**
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("data.txt"));
            String line ;
            while ((line = bufferedReader.readLine())!=null){
                System.out.println(line);
            }
        }catch (FileNotFoundException fe){
            fe.getMessage();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
