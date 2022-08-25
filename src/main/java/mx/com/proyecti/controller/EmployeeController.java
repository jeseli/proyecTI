package mx.com.proyecti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;
import mx.com.proyecti.entity.Employee;
import mx.com.proyecti.service.EmployeeService;
//Pertenece al modulo Spring MVC
@RestController//Le indica a String que esta clase representa la capa controladora. 
//				Expone las operaciones de mi servicio web de tipo REST

@RequestMapping("api") //Define la ruta raiz de mi endpoint
						//htttp://localhost;8090/api
@CrossOrigin(origins = "*", methods= {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE}) 
public class EmployeeController {
	
	//generar un objeto de tipo interface
	//Pertenece Spring Core
	@Autowired
	private EmployeeService employeeService;
		
		@GetMapping("/employees") //http get -- http://locahost:8090/api/employees
		List <Employee> getAllEmployees(){
			return employeeService.getAllEmployees();
		}
		@PostMapping("/employees")
		Long insertEmployee(@RequestBody Employee employee){
			return employeeService.insertEmployee(employee);
		}
		
		//http:/localhost:8090/employees/2
		@GetMapping("/employees/{id}")//HTTP GET
		Employee getEmployee(@PathVariable Long id) { //@PathVariable relaciona el valor de entrada del metodo con el valor definido en getMApping{id}
			return employeeService.getEmployee(id);
		}
		@PutMapping("/employees")// HTTP PUT
		Boolean updateEmployee(@RequestBody Employee employee) {
			return employeeService.updateEmployee(employee);
		}
		@DeleteMapping("/employees/{id}")//HTTP DELETE
		Boolean deleteEmployee(@PathVariable Long id) {
			return employeeService.deleteEmploye(id);
		}
}
