package com.selenium.A2_javaInterviewEx.SerializableDeSerializable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;



public class DeserializationEmployee {
        public static void main(String[] args) {
            String filename = "employee.ser";
            Employee emp = null;

            try (FileInputStream fileIn = new FileInputStream(filename);
                 ObjectInputStream in = new ObjectInputStream(fileIn)) {

                // Reading the byte stream and converting back to an Object
                emp = (Employee) in.readObject();
                System.out.println("Object deserialized successfully.");

                // Displaying the recovered object state
                System.out.println(emp);

            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }


