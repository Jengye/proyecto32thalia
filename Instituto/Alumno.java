package Instituto;

import java.util.Objects;
import java.util.Scanner;

public class Alumno {
	private static Scanner entrada = new Scanner(System.in);
	private String nombre;
	private String apellidos;
	private int edad;
	private int NIA;
	private Genero genero;

	public Alumno(String nombre, String apellidos, int edad, int nIA, Genero genero) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		NIA = nIA;
		this.genero = genero;
	}

	@Override
	public int hashCode() {
		return Objects.hash(NIA);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		return NIA == other.NIA;
	}

	public boolean mayorQue(Alumno alumno) {
		if (this.edad == alumno.edad) {
			return true;
		}
		return false;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getNIA() {
		return NIA;
	}

	public void setNIA(int nIA) {
		NIA = nIA;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", NIA=" + NIA + ", genero="
				+ genero + "]";
	}

	public static Alumno deTeclado() {
		String nombre, apellidos;
		int edad, NIA;
		Genero genero;
		System.out.println("Dame el NIA:");
		NIA = entrada.nextInt();
		entrada.nextLine();
		if (NIA == 0)
			return null;
		System.out.println("Dime tu nombre:");
		nombre = entrada.nextLine();
		System.out.println("Dime tu apellidos:");
		apellidos = entrada.nextLine();
		System.out.println("Dime tu edad:");
		edad = entrada.nextInt();
		entrada.nextLine();
		System.out.println("Dime tu género(M,F):");
		String letra = entrada.nextLine().toUpperCase().charAt(0) + "";
		genero = Genero.valueOf(letra);
		return new Alumno(nombre, apellidos, edad, NIA, genero);
	}

}
