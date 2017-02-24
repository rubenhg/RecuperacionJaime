package modelo;

public class Notas implements java.io.Serializable {

	private Integer idauto;
	private Alumnos alumnos;
	private Asignaturas asignaturas;
	private Integer nota;

	public Notas() {
	}

	public Notas(Alumnos alumnos, Asignaturas asignaturas) {
		this.alumnos = alumnos;
		this.asignaturas = asignaturas;
	}

	public Notas(Alumnos alumnos, Asignaturas asignaturas, Integer nota) {
		this.alumnos = alumnos;
		this.asignaturas = asignaturas;
		this.nota = nota;
	}

	public Integer getIdauto() {
		return this.idauto;
	}

	public void setIdauto(Integer idauto) {
		this.idauto = idauto;
	}

	public Alumnos getAlumnos() {
		return this.alumnos;
	}

	public void setAlumnos(Alumnos alumnos) {
		this.alumnos = alumnos;
	}

	public Asignaturas getAsignaturas() {
		return this.asignaturas;
	}

	public void setAsignaturas(Asignaturas asignaturas) {
		this.asignaturas = asignaturas;
	}

	public Integer getNota() {
		return this.nota;
	}

	public void setNota(Integer nota) {
		this.nota = nota;
	}

}
