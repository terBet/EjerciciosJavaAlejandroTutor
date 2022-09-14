package ejerciciosRepaso;
import java.util.Scanner;

//1.- Decalara e inicializa dos variables. Uno de tipo cadena de texto para un nombre y otra
//de tipo entero para una edad. 
//Crea una salida por consola con el texto "Los datos del empleado son " concatenado con el valor de dichas variables
//
//2.- Crea una etructura condicional que evalúe si una edad introducida por consola es mayor o igual a 18, si es así, imprimir por la consola: "Eres  mayor de edad" caso contrario imprimir "eres menor de edad".
//

public class Ejercicio1y2 {
	
	static String nombre = "Alejandro";
	static int edadA= 30;

	public String toString() {
		return "Los datos del empleado son: Nombre: " + nombre + ". Edad: " + edadA; 
	}

	public static void main(String[] args) {
		System.out.println("Los datos del empleado son: Nombre: " + nombre + ". Edad: " + edadA);
		System.out.println("Introduzca una edad y la evalúo");
		Scanner entrada = new Scanner(System.in);
        int edad = entrada.nextInt();
        if (edad>18) {
			System.out.println("Es mayor de edad");
		} else
			System.out.println("Es menor de edad");
		entrada.close();
	}

}
