//package com.example.springbootrestfullclient.post;
//
//import com.example.springbootrestfullclient.model.Employee;
//import org.springframework.http.HttpEntity;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.client.RestTemplate;
//
//import java.util.Scanner;
//
//public class Post_postForEntity_Example {
//    static final String URL_CREATE_EMPLOYEE = "http://localhost:8080/api/v1/employeesadd";
//
//    public static void main(String[] args) {
//
//        Scanner scanner= new Scanner(System.in);
//        System.out.print("Hay nhap id ban muon : ");
//        String id = scanner.nextLine();
//        Employee newEmployee = new Employee(id,"nguyen_van_linh", "9-9-2000","nam","nguyenvannam@gmail.com","Bac Ninh");
//
//        RestTemplate restTemplate = new RestTemplate();
//
//        // Dữ liệu đính kèm theo yêu cầu.
//        HttpEntity<Employee> requestBody = new HttpEntity<>(newEmployee);
//
//        // Gửi yêu cầu với phương thức POST.
//        ResponseEntity<Employee> result
//                = restTemplate.postForEntity(URL_CREATE_EMPLOYEE, requestBody, Employee.class);
//
////        ResponseEntity<Employee> result = restTemplate.put(URL_CREATE_EMPLOYEE,requestBody,Employee.class);
//        System.out.println("Status code:" + result.getStatusCode());
//
//        // Code = 200.
//        if (result.getStatusCode() == HttpStatus.OK) {
//            Employee e = result.getBody();
//            System.out.println("(Client Side) Employee Created: "+ e.getId());
//        }
//
//    }
//}
