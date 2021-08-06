package com.flockit.ejercicio.utils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.flockit.ejercicio.models.responses.ProvinciaResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProvinciaResponseMapper {

    static Logger logger = LoggerFactory.getLogger(ProvinciaResponseMapper.class);

    public static ProvinciaResponse convert(String json) {
        
        String lat = "";
        String lon = "";

        try {
            ObjectMapper mapper = new ObjectMapper();
            JsonNode node = mapper.readTree(json);
            lat = node.at("/provincias/0/centroide/lat").asText();
            lon = node.at("/provincias/0/centroide/lon").asText();
        } catch (Exception e) {
            logger.error("API response error", e);
        }

        return new ProvinciaResponse(lat, lon);
    }
    
}
