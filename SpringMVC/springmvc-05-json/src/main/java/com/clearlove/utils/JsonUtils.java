package com.clearlove.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.text.SimpleDateFormat;
import java.util.Map;

/**
 * @author promise
 * @date 2024/2/28 - 22:15
 */
public class JsonUtils {


  public static String getJson(Object object) {
    return getJson(object, "yyyy-MM-dd HH:mm:ss");
  }

  public static String getJson(Object object, String dateFormat) {
    ObjectMapper objectMapper = new ObjectMapper();
    objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormat);
    objectMapper.setDateFormat(simpleDateFormat);

    try {
      return objectMapper.writeValueAsString(object);
    } catch (JsonProcessingException e) {
      e.printStackTrace();
      return null;
    }
  }

}
