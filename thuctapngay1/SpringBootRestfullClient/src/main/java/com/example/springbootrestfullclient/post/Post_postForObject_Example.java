package com.example.springbootrestfullclient.post;

import com.example.springbootrestfullclient.model.Employee;
import org.apache.logging.log4j.LogManager;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import java.util.Scanner;

public class Post_postForObject_Example {
    private static final org.apache.logging.log4j.Logger
            LOGGER = LogManager.getLogger(com.example.springbootrestfullclient.post.Post_postForObject_Example.class);
    static final String URL_CREATE_EMPLOYEE = "http://localhost:8080/api/v1/employeesadd";

    public static void main(String[] args) {
try{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hay nhap id ban muon : ");
        String id = scanner.nextLine();
//        String id = "16";

        Employee newEmployee = new Employee(id,"nguyen_van_linh", "9-9-2000","nam","nguyenvannam@gmail.com","Bac Ninh");
        HttpHeaders headers = new HttpHeaders();
        headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
        headers.setContentType(MediaType.APPLICATION_JSON);

        RestTemplate restTemplate = new RestTemplate();

        // Dữ liệu đính kèm theo yêu cầu.
        HttpEntity<Employee> requestBody = new HttpEntity<>(newEmployee, headers);

        // Gửi yêu cầu với phương thức POST.
        Employee e = restTemplate.postForObject(URL_CREATE_EMPLOYEE, requestBody, Employee.class);

        if (e != null && e.getId() != null) {

            System.out.println("Employee created: " + e.getId());
        } else {
            System.out.println("Something error!");
        }
}
catch (Exception e){
    LOGGER.info("This is an INFO log messenge!");
    LOGGER.debug("This is an DEBUG messenge!");
    LOGGER.error("This is an ERROR messenge!");
}
}
}
