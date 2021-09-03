package cl.awakelab.empleades.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cl.awakelab.empleades.entidad.Empleado;
import cl.awakelab.empleades.service.EmpleadoServiceImpl;

@Controller
public class EmpleadoController {

	@Autowired
	private EmpleadoServiceImpl es;
	
	@RequestMapping(value="/listar", method = RequestMethod.GET)
	public ModelAndView listar() {
		
		List<Empleado> lista = es.readAll();
		ModelAndView mv = new ModelAndView("listar");
		mv.addObject("lista", lista);
		
		return mv;
	}
	
	
	@RequestMapping(value="/editar/{id}", method=RequestMethod.GET)
	public ModelAndView editar(@PathVariable("id") int id) {
		ModelAndView mv = new ModelAndView("editar");
		
		Empleado e = es.readOne(id);
		
		 mv.addObject("e", e);
		
		 return mv;
	}
	
	@RequestMapping(value="/editar", method = RequestMethod.POST)
	public ModelAndView editar(Empleado e) {
		
		Empleado e_origen = es.readOne(e.getId());
		
		e.setJefe(e_origen.getJefe());
		
		es.update(e);
		
		
		return new ModelAndView("redirect:/listar");
	}
	
	
}
