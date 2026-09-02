package com.selenium.A2_javaInterviewEx.SerializableDeSerializable;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class SerializationEmployee {
        public static void main(String[] args) {
            Employee emp = new Employee("John Doe", 101, "Secret123");
            String filename = "employee.ser";

            try (FileOutputStream fileOut = new FileOutputStream(filename);
                 ObjectOutputStream out = new ObjectOutputStream(fileOut)) {

                // Writing the object state to a byte stream
                out.writeObject(emp);
                System.out.println("Object serialized and saved to " + filename);
                System.out.println("Object serialized and saved to " + filename.getBytes());

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

