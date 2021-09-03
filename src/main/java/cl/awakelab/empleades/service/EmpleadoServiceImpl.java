package cl.awakelab.empleades.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.awakelab.empleades.entidad.Empleado;
import cl.awakelab.empleades.repos.EmpleadoRepo;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {

	@Autowired
	EmpleadoRepo er;
	
	@Override
	public List<Empleado> readAll() {
		// TODO Auto-generated method stub
		return er.findAll();
	}

	@Override
	public Empleado readOne(int id) {
		// TODO Auto-generated method stub
		return er.findById(id).get();
		
	}

	@Override
	public void update(Empleado e) {
		// TODO Auto-generated method stub
		
		er.save(e);
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		er.deleteById(id);
		
		
	}

	@Override
	public void create(Empleado e) {
		er.save(e);
		
	}

	
}
