package com.example.springmvc;

import com.example.dataspringmvc.Employee;
import com.example.dataspringmvc.User;
import org.springframework.web.bind.annotation.*;

import java.util.Vector;


@RestController
@RequestMapping("api/v1")
public class EmployeeController {

//    @Autowired
//    private EmployeeRepository employeeRepository;

    @GetMapping("employees")
    public Vector<Employee> getAllEmployeess() {
        EmployeeManager ep = new EmployeeManager();
        return ep.getAllEmployeess();
    }
    @PostMapping("employeesadd")
    public Employee AddEmployees( @RequestBody Employee nhanvien){
        EmployeeManager rpp = new EmployeeManager();
        return rpp.AddEmployees(nhanvien);
    }
    @PutMapping("employeesfix")
    public Employee FixEmployees( @RequestBody Employee nhanvien){
        EmployeeManager epp1 = new EmployeeManager();
        return epp1.FixEmployees(nhanvien);
    }
    @DeleteMapping ("employeesdel/{id}")
    public String DelEmployees(@PathVariable(value = "id") String id){
        EmployeeManager epp1 = new EmployeeManager();
        return epp1.DelEmployees(id);
    }
    @GetMapping ("employeespssearch/{id}")
    public Vector<Employee> SearchEmployees(@PathVariable(value = "id") String id){
        EmployeeManager epp1 = new EmployeeManager();
        return epp1.SearchEmployees(id);
    }
    @PostMapping("employeeslogin")
    public boolean Login(@RequestBody User us) {
        EmployeeManager epp = new EmployeeManager();
        return epp.Login(us.getUser(),us.getPass());
    }
}


