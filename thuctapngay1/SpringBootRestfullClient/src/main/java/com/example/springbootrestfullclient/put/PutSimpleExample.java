//package com.example.springbootrestfullclient.put;
//
//import com.example.springbootrestfullclient.model.Employee;
//import org.springframework.http.HttpEntity;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.MediaType;
//import org.springframework.web.client.RestTemplate;
//
//import java.sql.SQLException;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//
//public class PutSimpleExample {
//    static final String URL_UPDATE_EMPLOYEE = "http://localhost:8080/api/v1/employeesfix";
////    static final String URL_EMPLOYEE_PREFIX = "http://localhost:8080/api/v1/employeesfix";
//
//    public static void main(String[] args) {
//        try {
//
//        String id = "19";
//
//        Employee updateInfo = new Employee(id, "nguyen_van_linh", "9-9-2000","nam","nguyenvannam@gmail.com","Bac Ninh");
//
//        HttpHeaders headers = new HttpHeaders();
//        headers.add("Content-Type", MediaType.APPLICATION_JSON_VALUE);
//
//        RestTemplate restTemplate = new RestTemplate();
//
//        // Dữ liệu đính kèm theo yêu cầu.
//        HttpEntity<Employee> requestBody = new HttpEntity<>(updateInfo, headers);
//
//        // Gửi yêu cầu với phương thức PUT.
//        restTemplate.put(URL_UPDATE_EMPLOYEE, requestBody, new Object[] {});
//
////        String resourceUrl = URL_EMPLOYEE_PREFIX ;
////
////        Employee e = restTemplate.getForObject(resourceUrl, Employee.class);
////
////        if (e != null) {
////            System.out.println("(Client side) Employee after update: ");
////            System.out.println("Employee: " + e.getId() + " - " + e.getFullname());
////        }
//        } catch (Exception ex) {
//            Logger.getLogger(PutSimpleExample.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//
//}
