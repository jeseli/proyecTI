package mx.com.proyecti.service;

import java.util.List;
import mx.com.protecti.entity.Employee;

public interface EmployeeService {
	
	List<Employee> getAllEmployees();
	Employee getEmployee(Long id);
	Long insertEmployee(Employee employee);
	Boolean updateEmployee(Employee employee);
	Boolean deleteEmploye(Long id);
}
