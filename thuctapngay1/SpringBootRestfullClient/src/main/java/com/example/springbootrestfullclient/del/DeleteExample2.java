package com.example.springbootrestfullclient.del;

import com.example.springbootrestfullclient.model.Employee;
import org.apache.logging.log4j.LogManager;
import org.springframework.web.client.RestTemplate;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class    DeleteExample2 {
    private static final org.apache.logging.log4j.Logger
            LOGGER = LogManager.getLogger(com.example.springbootrestfullclient.del.DeleteExample2.class);

    public static void main(String[] args) {
        try {

            RestTemplate restTemplate = new RestTemplate();

            // URL với biến URI (URI variable)
            String resourceUrl = "http://localhost:8080/api/v1/employeesdel/{id}";

//        Object[] uriValues = new Object[] { "19" };

            Scanner scaner = new Scanner(System.in);
            System.out.print("Nhap id can xoa : ");
            String id = scaner.nextLine();
            Object[] uriValues = new Object[]{id};

            // Gửi yêu cầu với phương thức DELETE.
            restTemplate.put(resourceUrl, uriValues);
        }
        catch (Exception e){
            LOGGER.info("This is an INFO log messenge!");
            LOGGER.debug("This is an DEBUG messenge!");
            LOGGER.error("This is an ERROR messenge!");
    }}
}
