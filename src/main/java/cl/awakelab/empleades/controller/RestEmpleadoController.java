package cl.awakelab.empleades.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.awakelab.empleades.entidad.Empleado;
import cl.awakelab.empleades.service.EmpleadoServiceImpl;

@RestController
@RequestMapping(value = "/api")
public class RestEmpleadoController {

	@Autowired
	private EmpleadoServiceImpl es;
	
	@RequestMapping(value = "/empleados", headers = "Accept=application/json")
	public List<Empleado> getEmpleados(){
		return es.readAll();
	}
	
	@RequestMapping(value = "/empleados/{id}", headers =  "Accept=application/json")
	public Empleado getEmpleado(@PathVariable("id") int id) {
		
		return es.readOne(id);
		
	}
}
