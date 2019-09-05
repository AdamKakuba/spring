package com.kakuba.videoapp;


import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@Service
public class VideoCasetteSorter {

    public String[] sortDataFromApi(){

        String[] dataFromApi = getDataFromApi();
        Arrays.sort(dataFromApi);
        return  dataFromApi;

    }





    public String[] getDataFromApi(){
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String[]> exchange = restTemplate.exchange("http://localhost:9090/casettes",
                HttpMethod.GET, HttpEntity.EMPTY,String[].class);

        return exchange.getBody();

    }

}
