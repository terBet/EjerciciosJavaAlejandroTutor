package ejerciciosRepaso;

import java.util.Arrays;

//7.- Repite el ejercicio anterior pero realiza la iteración e impresión de los elementos del array a través de un bucel for mejorado.


public class Ejercicio7 {

	static String [] personas= {"Ana", "Alma", "Zoilo", "Emma", "Sandra"};

	public static void main(String[] args) {
		Arrays.stream(personas).forEach(System.out::println);

	}

}
