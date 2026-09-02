package com.selenium.A2_javaInterviewEx.files;
/*
Byte Streams
Work with raw binary data (like images, audio, and PDF files).
Examples: FileInputStream, FileOutputStream.

 Character Streams
Work with text (characters and strings). These streams automatically handle character encoding.
Examples: FileReader, FileWriter, BufferedReader, BufferedWriter.*/


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOstreamOperations {

    public static void main(String[] args) throws FileNotFoundException {
        writeFile();
        // try-with-resources: FileI  nputStream will be closed automatically
        try (FileInputStream input = new FileInputStream(System.getProperty("user.dir")+"/file.txt")) {

            int i;  // variable to store each byte that is read

            // Read one byte at a time until end of file (-1 means "no more data")
            while ((i = input.read()) != -1) {
                // Convert the byte to a character and print it to the console
                System.out.print((char) i);
            }

        } catch (IOException e) {
            // If an error happens (e.g. file not found), print an error message
            System.out.println("Error reading file.");
        }

    }


    public static void writeFile(){
        // The text we want to write
        String text = "Hello World!";

        // try-with-resources: stream will be closed automatically
        try (FileOutputStream output = new FileOutputStream(System.getProperty("user.dir")+"/file.txt")) {
            output.write(text.getBytes());  // convert text to bytes and write
            System.out.println("Successfully wrote to file.");
        } catch (IOException e) {
            System.out.println("Error writing file.");
            e.printStackTrace();
        }
    }
}
