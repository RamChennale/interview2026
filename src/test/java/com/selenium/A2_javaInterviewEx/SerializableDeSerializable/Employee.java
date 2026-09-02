package com.selenium.A2_javaInterviewEx.SerializableDeSerializable;
import java.io.Serializable;


public class Employee implements Serializable{

        // Version control ID
        private static final long serialVersionUID = 1L;

        public String name;
        public int id;
        public transient String password;// This field will be skipped during serialization

        public Employee(String name, int id, String password) {
            this.name = name;
            this.id = id;
            this.password = password;
        }

        @Override
        public String toString() {
            return "Employee [Name=" + name + ", ID=" + id + ", Password=" + password + "]";
        }
    }

