package com.nnapolit.pricechartingjava.model.product;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ProductMapper {

    public Map<String, String> convertJsonToHashMap(String jsonFile) {

        ObjectMapper mapper = new ObjectMapper();
        Map<String, String> mapObject = new HashMap<>();
        try {
            mapObject = mapper.readValue(jsonFile,
                    new TypeReference<Map<String, Object>>() {
                    });

            return mapObject;

        } catch (JsonGenerationException e) {
//            e.printStackTrace();
        } catch (JsonMappingException e) {
//            e.printStackTrace();
        } catch (IOException e) {
//            e.printStackTrace();
        }

        return mapObject;
    }

}

