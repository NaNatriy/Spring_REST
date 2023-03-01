package skypro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import skypro.entity.Employee;
import skypro.service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("/skypro")
public class RestControllerNew {

    private EmployeeService personService;

    public RestControllerNew(EmployeeService personService) {
        this.personService = personService;
    }

    @GetMapping("/persons")
    public List<Employee> getPersons() {
        return personService.getEmployee();
    }

//    private EmployeeService employeeService;
//    public RestControllerNew(EmployeeService employeeService) {
//        this.employeeService = employeeService;
//    }
//
//    @GetMapping("/employees")
//    public List<Employee> getEmployees() {
//        return employeeService.getEmployee();
//    }
//
//    @GetMapping("/employee/{id}")
//    public Employee getEmployeeById(@PathVariable int id) {
//        return employeeService.getEmployeeById(id);
//    }
//
//    @PostMapping("/employee")
//    public Employee addEmployee(@RequestBody Employee employee) {
//
//        employeeService.addEmployee(employee);
//        return employee;
//
//    }
//
//    @PutMapping("/employee")
//    public Employee updateEmployee(@RequestBody Employee employee) {
//
//        employeeService.updateEmployee(employee);
//        return employee;
//
//    }
//
//    @DeleteMapping("/employee/{id}")
//    public String deleteEmployee(@PathVariable int id) {
//        employeeService.deleteEmployee(id);
//        return "Employee with id = " + id + " was deleted";
//    }
}