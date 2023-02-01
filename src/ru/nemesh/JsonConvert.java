package ru.nemesh;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.stream.Stream;


public class JsonConvert {
    public static String convertJson(Stream stream) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        try {
            String json = mapper.writeValueAsString(stream);
            return json;
            //          System.out.println("ResultingJSONstring = " + json);
            //System.out.println(json);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String convertString(String jsonString) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();

//        try {
//            Inn inn = new Inn("reg","key");
        String a = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonString);
//            System.out.println(jsonString);
//        }
//        catch (IOException e) {
//            e.printStackTrace();
//        }
        return a;
    }
}

