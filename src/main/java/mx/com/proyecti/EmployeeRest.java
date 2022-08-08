package mx.com.proyecti;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //spring boot
@EnableAutoConfiguration
//Indica a la plataforma que esta clase representa el punto de inicio de mi aplicacion, inplementada conS pring Boot

public class EmployeeRest {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeRest.class, args);

	}

}
