package cl.awakelab.empleades.entidad;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Empleado {

	@Id
	@Column(name = "employee_id")
	private int id;
	
	@Column(name="first_name")
	private String nombre;
	
	@Column(name="last_name")
	private String apellido;
	
	@Column
	private String email;
	
	@Column(name="phone")
	private String tel;
	

	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="manager_id")
	private Empleado jefe;
	
	@Column(name="job_title")
	private String cargo;
	
	public Empleado() {
		super();
	}

	public Empleado(int id, String nombre, String apellido, String email, String tel, Date fechaContratacion,
			Empleado jefe, String cargo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.tel = tel;
		
		this.jefe = jefe;
		this.cargo = cargo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public Empleado getJefe() {
		return jefe;
	}

	public void setJefe(Empleado jefe) {
		this.jefe = jefe;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	
	
	
}
