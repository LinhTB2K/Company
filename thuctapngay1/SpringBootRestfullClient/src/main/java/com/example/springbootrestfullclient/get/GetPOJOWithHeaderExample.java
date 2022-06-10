package com.example.springbootrestfullclient.get;

import java.util.Arrays;

import com.example.springbootrestfullclient.model.Employee;
import org.apache.logging.log4j.LogManager;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class GetPOJOWithHeaderExample {
    private static final org.apache.logging.log4j.Logger
            LOGGER = LogManager.getLogger(com.example.springbootrestfullclient.get.GetPOJOWithHeaderExample.class);

    static final String URL_EMPLOYEES = "http://localhost:8080/api/v1/employees";

    public static void main(String[] args) {
try{
        // HttpHeaders
        HttpHeaders headers = new HttpHeaders();

        headers.setAccept(Arrays.asList(new MediaType[]{MediaType.APPLICATION_JSON}));
        // Yêu cầu trả về định dạng XML
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("my_other_key", "my_other_value");

        // HttpEntity<Employee[]>: To get result as Employee[].
        HttpEntity<Employee[]> entity = new HttpEntity<Employee[]>(headers);

        // RestTemplate
        RestTemplate restTemplate = new RestTemplate();

        // Gửi yêu cầu với phương thức GET, và các thông tin Headers.
        ResponseEntity<Employee[]> response = restTemplate.exchange(URL_EMPLOYEES, //
                HttpMethod.GET, entity, Employee[].class);

        HttpStatus statusCode = response.getStatusCode();
        System.out.println("Response Satus Code: " + statusCode);

        // Status Code: 200
        if (statusCode == HttpStatus.OK) {
            // Response Body Data
            Employee[] list = response.getBody();

            if (list != null) {
                for (Employee e : list) {
                    System.out.println("Employee: " + e.getFullname() + " - " + e.getAddress()+ " - " + e.getBirthday()+ " - " + e.getEmail()+ " - " + e.getGender()+ " - " + e.getId() );
                }
            }
        }
    }
catch (Exception e){
    LOGGER.info("This is an INFO log messenge!");
    LOGGER.debug("This is an DEBUG messenge!");
    LOGGER.error("This is an ERROR messenge!");
}
}
}