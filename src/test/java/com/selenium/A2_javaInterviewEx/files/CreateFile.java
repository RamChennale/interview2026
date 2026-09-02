package com.selenium.A2_javaInterviewEx.files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
/*
Other Ways to Write to Files
There are several classes you can use to write files in Java:

FileWriter - easiest choice for basic text.
BufferedWriter - better for large text files, because it is faster and supports handy features.
FileOutputStream - best for binary data (images, audio, PDFs)
    */

public class CreateFile {

   public static CreateFile createFile;

   public static void writeInTextFile() throws IOException {
        FileWriter fileWriter = new FileWriter("file_1.txt");
        fileWriter.write("New file created NOTE.");
        fileWriter.close();
    }

    public static void getFileInfoRead() throws IOException{

    }

    public static void main(String[] args){
        createFile = new CreateFile();
        try {
            File file = new File("file.txt");
            if(!file.createNewFile()){
                System.out.println("File created : "+file.getName());
                writeInTextFile();
                System.out.println("File name"+file.getName());
                System.out.println("File name"+file.getAbsoluteFile());
                System.out.println("File name"+file.canRead());
                //file.delete();
            }else {
                System.out.println("File already exist");
            }
        }catch(IOException e){
            e.getStackTrace();
        }

    }
}
