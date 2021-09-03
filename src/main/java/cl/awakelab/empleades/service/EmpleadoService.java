package cl.awakelab.empleades.service;

import java.util.List;

import cl.awakelab.empleades.entidad.Empleado;

public interface EmpleadoService {

	public List<Empleado> readAll();
	public Empleado readOne(int id);
	public void update(Empleado e);
	public void delete(int id);
	public void create(Empleado e);
	
	
}
