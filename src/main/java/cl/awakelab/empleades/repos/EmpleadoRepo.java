package cl.awakelab.empleades.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.awakelab.empleades.entidad.Empleado;

@Repository
public interface EmpleadoRepo extends JpaRepository<Empleado, Integer> {

	

}
