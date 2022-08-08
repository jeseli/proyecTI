package mx.com.proyecti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.protecti.entity.Employee;
import mx.com.proyecti.repository.EmployeeRepository;

@Service //indica a Spring que esta lase representa la capa de servicios, expone a la clase para inicializar dependencias
public class EmployeeServicelmpl implements EmployeeService {

	@Autowired //Le indica a Spring que realice la creacion del objeto cuando mejor le convenga
	private EmployeeRepository employeeRepository;
	
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	public Employee getEmployee(Long id) {
		return employeeRepository.findOne(id);
	}

	public Long insertEmployee(Employee employee) {
		return employeeRepository.save(employee).getId();
	}

	public Boolean updateEmployee(Employee employee) {
		Employee emp = this.getEmployee(employee.getId());
		if (emp != null) {
			emp.setFirstName(employee.getFirstName());
			emp.setLastName(employee.getLastName());
			emp.setBirthdate(employee.getBirthdate());
			emp.setSalary(employee.getSalary());
			emp.setEmail(employee.getEmail());
			emp.setPhone(employee.getPhone());
			employeeRepository.save(emp);
			return true;
		}else return false;
	}

	public Boolean deleteEmploye(Long id) {
		employeeRepository.delete(id);
		return true;
	}

}
