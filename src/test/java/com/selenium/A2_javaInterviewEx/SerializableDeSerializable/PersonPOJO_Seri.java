package com.selenium.A2_javaInterviewEx.SerializableDeSerializable;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PersonPOJO_Seri {

    public static void main(String[] args) throws JsonProcessingException {
        PersonPOJO personPOJO = new PersonPOJO();
        personPOJO.setName("Ram");
        personPOJO.setId(11);


        ObjectMapper objectMapper = new ObjectMapper();
        String jsonString  = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(personPOJO);
        System.out.println("PersonPOJO data in  JSON string : "+jsonString);
































    }

}
