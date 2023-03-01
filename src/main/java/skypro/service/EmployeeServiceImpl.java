package skypro.service;

import skypro.DAO.EmployeeDAO;
import skypro.entity.Employee;
import skypro.exception.EmployeeException;

import javax.transaction.Transactional;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeDAO employeeDAO;

    public EmployeeServiceImpl(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @Override
    @Transactional
    public List<Employee> getEmployee() {
        return employeeDAO.getEmployee();

    }

    @Override
    @Transactional
    public Employee getEmployeeById(int id) {
        Employee employee = employeeDAO.getEmployeeById(id);

        if (employee == null) {
            throw new EmployeeException("Person with id = " + id + " doesn't exist");
        }

        return employee;
    }

    @Override
    @Transactional
    public void addEmployee(Employee employee) {
        employeeDAO.addEmployee(employee);
    }

    @Override
    @Transactional
    public void updateEmployee(Employee employee) {
        employeeDAO.updateEmployee(employee);
    }

    @Override
    @Transactional
    public void deleteEmployee(int id) {
        employeeDAO.deleteEmployee(id);

        Employee employee = employeeDAO.getEmployeeById(id);

        if (employee == null) {
            throw new EmployeeException("Person with id = " + id + " doesn't exist");
        }

    }
}
