package Instituto;

public class PruebaAlumno {

	public static void main(String[] args) {
		Alumno a1 = new Alumno("Christopher", "Nolan", 33, 163843, Genero.M);
		Alumno a2 = new Alumno("Christopher", "Nolan", 33, 163843, Genero.M);
		// Alumno a3=Alumno.deTeclado();
		// System.out.println(a1.equals(a2));
		// System.out.println(a1.mayorQue(a2));
		// System.out.println(a3);
		Grupo daw2 = new Grupo("daw2", 33);
		daw2.addAlumno(a1);
		daw2.addAlumno(a2);
		// Alumno a3=new Alumno("Christopher", "Nodasdasan", 33, 163843, Genero.M);
		// daw2.addAlumno(a3);
		// System.out.println(daw2);
		Alumno a;
		while ((a = Alumno.deTeclado()) != null) {
			daw2.addAlumno(a);
		}
		System.out.println("¿Hay repes?" + daw2.hayRepes());
	}

}
