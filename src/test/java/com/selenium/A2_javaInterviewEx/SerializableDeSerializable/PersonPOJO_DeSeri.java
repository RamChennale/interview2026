package com.selenium.A2_javaInterviewEx.SerializableDeSerializable;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PersonPOJO_DeSeri {

    public static void main(String[] args) throws JsonProcessingException {

        String StringResponse = "{\n" +
                "  \"id\" : 11,\n" +
                "  \"name\" : \"Ram\"\n" +
                "}";

        ObjectMapper objectMapper = new ObjectMapper();
        PersonPOJO personPOJO = objectMapper.readValue(StringResponse, PersonPOJO.class);
        String jsonString  = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(personPOJO);
        System.out.println(personPOJO.getId());
        System.out.println(personPOJO.getName());
































    }

}
