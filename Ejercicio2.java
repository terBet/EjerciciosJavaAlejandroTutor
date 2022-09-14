package ejerciciosRepaso;

import java.util.Scanner;

//3.- Crea un programa en java que pida dos datos por la consola al usuario: nombre e email. Imprime el valor de estás variables por consola.
//


public class Ejercicio2 {

	public Ejercicio2() {
		// TODO Auto-generated constructor stub
	}
	static String nombre;
	static String nombreCompleto;
	public static void main(String[] args) {
		System.out.println("Introduzca el nombre y luego su email");
		Scanner entradaNombre = new Scanner(System.in);
        String nombre = entradaNombre.nextLine();
        
        while (entradaNombre.hasNextLine()) {
			String nombreCompleto = nombre+" "+entradaNombre.nextLine();
			System.out.println(nombreCompleto);
		}
        entradaNombre.close();
        

	}

}
