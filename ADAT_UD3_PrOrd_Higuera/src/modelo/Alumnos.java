package modelo;

import java.util.HashSet;
import java.util.Set;

public class Alumnos implements java.io.Serializable {

	private Integer id;
	private String dni;
	private String apellidoNombre;
	private String direccion;
	private String poblacion;
	private String telefono;
	private Set notases = new HashSet(0);

	public Alumnos() {
	}

	public Alumnos(String dni) {
		this.dni = dni;
	}

	public Alumnos(String dni, String apellidoNombre, String direccion, String poblacion, String telefono,
			Set notases) {
		this.dni = dni;
		this.apellidoNombre = apellidoNombre;
		this.direccion = direccion;
		this.poblacion = poblacion;
		this.telefono = telefono;
		this.notases = notases;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDni() {
		return this.dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getApellidoNombre() {
		return this.apellidoNombre;
	}

	public void setApellidoNombre(String apellidoNombre) {
		this.apellidoNombre = apellidoNombre;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getPoblacion() {
		return this.poblacion;
	}

	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Set getNotases() {
		return this.notases;
	}

	public void setNotases(Set notases) {
		this.notases = notases;
	}

}
