package com.flockit.ejercicio.services;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.flockit.ejercicio.models.ProvinciaResponse;
import com.flockit.ejercicio.utils.APIUtils;
import com.flockit.ejercicio.utils.ProvinciaResponseMapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProvinciaServiceImpl implements ProvinciaService {

    Logger logger = LoggerFactory.getLogger(ProvinciaServiceImpl.class);

    @Autowired
    APIUtils apiUtils;

    @Override
    public ProvinciaResponse processRequest(String provincia) {
        String json = apiUtils.getProvinciaJsonData(provincia);
        return ProvinciaResponseMapper.convert(json);
    }
}
