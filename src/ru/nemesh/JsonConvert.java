package ru.nemesh;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.stream.Stream;


public class JsonConvert {
    public static String convertJson(Stream a) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.writeValueAsString(a);
            //читаем а
            //сравниваем а и поля в классе ResultInn
            //если тру то это поле отправяем сюда:
            //ResultInn.setНАИМПОЛНЮЛ();
            //сравниваем а и поля в классе ResultInn
            //если тру то это поле отправяем сюда:
            //ResultInn.setАдресПолн();

            String result;
     //     return result = ResultInn.setНАИМПОЛНЮЛ() || ResultInn.setАдресПолн();
            //          System.out.println("ResultingJSONstring = " + json);    //
            //System.out.println(json);                                         //
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }
}

//    public static String convertString(String jsonString) throws JsonProcessingException {
//        ObjectMapper mapper = new ObjectMapper();

//        try {                                                   //
//            Inn inn = new Inn("reg","key");                     //
//        String a = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonString);
//            System.out.println(jsonString);                      //
//        }                                                         //
//        catch (IOException e) {                                    //
//            e.printStackTrace();                                   //
//        }                                                          //
//        return a;
//    }
//}

