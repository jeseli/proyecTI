package mx.com.proyecti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import mx.com.protecti.entity.Employee;
import mx.com.proyecti.service.EmployeeService;
//Pertenece al modulo Spring MVC
@RestController//Le indica a String que esta clase representa la capa controladora. 
//				Expone las operaciones de mi servicio web de tipo REST

@RequestMapping("api") //Define la ruta raiz de mi endpoint
						//htttp://localhost;8090/api
public class EmployeeController {
	
	//generar un objeto de tipo interface
	//Pertenece Spring Core
	@Autowired
	private EmployeeService employeeService;
		
		@GetMapping("/employees") //http get -- http://locahost:8090/api/employees
		List <Employee> getAllEmployees(){
			return employeeService.getAllEmployees();
		}
}
