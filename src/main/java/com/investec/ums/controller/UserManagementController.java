package com.investec.ums.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.tutorialspoint.entity.Employee;
import com.tutorialspoint.service.EmployeeService;
@RestController
@RequestMapping(path = "/emp")
public class UserManagementController {
   @Autowired
   EmployeeService employeeService;
   @GetMapping("/employees")
   public List<Employee> getAllEmployees(){
      return null;
   }
   @GetMapping("/employee/{id}")
   public Employee getEmployee(@PathVariable("id") int id) {
      return null;;
   }
   @DeleteMapping("/employee/{id}")
   public void deleteEmployee(@PathVariable("id") int id) {
   }
   @PostMapping("/employee")
   public void addEmployee(@RequestBody Employee employee) {
   }
   @PutMapping("/employee")
   public void updateEmployee(@RequestBody Employee employee) {
   }	
}