package com.example.springbootrestfullclient.put;

import com.example.springbootrestfullclient.control.Log4j2;
import com.example.springbootrestfullclient.model.Employee;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import java.util.Scanner;
import java.util.logging.Level;

public class PutWithExchangeExample {
     private static final Logger
            LOGGER = LogManager.getLogger(com.example.springbootrestfullclient.put.PutWithExchangeExample.class);


    static final String URL_UPDATE_EMPLOYEE = "http://localhost:8080/api/v1/employeesfix";
    public static void main(String[] args) {

        try {

            Scanner scan = new Scanner(System.in);
            System.out.println("Vui long nhap id : ");
            String id = scan.nextLine();

            Employee updateInfo = new Employee(id, "nguyen_van_linh", "9-9-2000", "nam", "nguyenvannam@gmail.com", "Thai Binh");

            HttpHeaders headers = new HttpHeaders();
            headers.add("Content-Type", MediaType.APPLICATION_JSON_VALUE);

            RestTemplate restTemplate = new RestTemplate();

            // Dữ liệu đính kèm theo yêu cầu.
            HttpEntity<Employee> requestBody = new HttpEntity<>(updateInfo, headers);

            // Gửi yêu cầu với phương thức PUT.
            restTemplate.exchange(URL_UPDATE_EMPLOYEE, HttpMethod.PUT, requestBody, Employee.class);
        } catch (Exception ex) {
//            Logger.getLogger(PutWithExchangeExample.class.getName()).log(Level.SEVERE, null, ex);
//        }
            LOGGER.info("This is an INFO level log message!");
            LOGGER.error("This is an INFO level log message!");
        }
    }
}
