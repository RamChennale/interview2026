package com.selenium.A3_apiInterviewEx;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectMapper_Serilization_De {

    private  final static ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    /** Serialize a POJO -> JSON string (used as the request body). */
    public static String toJson(Object pojo) {
        try {
            return OBJECT_MAPPER.writeValueAsString(pojo);
        } catch (Exception e) {
            throw new RuntimeException("Failed to serialize object to JSON", e);
        }
    }

    /** Deserialize a JSON string -> POJO (used to read the response body). */
    public static <T> T fromJson(String json, Class<T> clazz) {
        try {
            return OBJECT_MAPPER.readValue(json, clazz);
        } catch (Exception e) {
            throw new RuntimeException("Failed to deserialize JSON to object", e);
        }
    }
}
