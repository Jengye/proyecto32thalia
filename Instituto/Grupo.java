package Instituto;

import java.util.Arrays;

public class Grupo {
	private String nombre;
	private Alumno[] grupo;

	public Grupo(String nombre, int tamaño) {
		this.nombre = nombre;
		this.grupo = new Alumno[tamaño];
	}

	public boolean addAlumno(Alumno a) {
		for (int i = 0; i < grupo.length; i++) {
			if (grupo[i] == null) {
				grupo[i] = a;
				return true;
			} // if es null añade a ese campo el alumno a.
		} // for recorre el array de tipo alumno llamado grupo.
		return false;
	}// addAlumno

	public boolean hayRepes() {
		for (int i = 0; i < grupo.length; i++) {
			if (grupo[i] == null)
				continue;// continue significa pasa al siguiente
			for (int j = i + 1; j < grupo.length; j++) {
				if (grupo[i] == null)
					continue;
				if (grupo[j].equals(grupo[i]))
					return true;
			}
		}
		return false;
	}

	public String toString() {
		return nombre + ":" + Arrays.toString(grupo);
	}
}
