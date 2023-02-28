package skypro.controller;

import org.springframework.web.bind.annotation.*;
import skypro.empl.Employee;
import skypro.service.EmployeeService;
import skypro.service.EmployeeServiceImpl;

import java.util.List;

@RestController
@RequestMapping("skypro")
public class RestControllerNew {

    private EmployeeService employeeService;

    public RestControllerNew(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public List<Employee> getPersons() {
        return employeeService.getEmployee();
    }

    @GetMapping("/employee/{id}")
    public Employee getPersonById(@PathVariable int id) {
        return employeeService.getEmployeeById(id);
    }

    @PostMapping("/employee")
    public Employee addPerson(@RequestBody Employee employee) {

        employeeService.addEmployee(employee);
        return employee;

    }

    @PutMapping("/employee")
    public Employee updatePerson(@RequestBody Employee employee) {

        employeeService.updateEmployee(employee);
        return employee;

    }

    @DeleteMapping("/employees/{id}")
    public String deletePerson(@PathVariable int id) {

        employeeService.deleteEmployee(id);
        return "Person with id = " + id + " was deleted";

    }
}