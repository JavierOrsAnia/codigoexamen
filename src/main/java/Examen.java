
/**
 *
 * @author DAW2
 */
public class Examen {
	private String nombre;
	private String asignatura;
	private String evaluacion;

	public Examen(String nombre, String asignatura, String evaluacion) {
		this.nombre = nombre;
		this.asignatura = asignatura;
		this.evaluacion = evaluacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	public String getEvaluacion() {
		return evaluacion;
	}

	public void setEvaluacion(String evaluacion) {
		this.evaluacion = evaluacion;
	}

	@Override
	public String toString() {
		return "Alumno{" + "nombre=" + nombre + ", asignatura=" + asignatura + ", evaluacion=" + evaluacion + '}';
	}
}