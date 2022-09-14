package ejerciciosRepaso;
//5.- Crea un programa que pida un número por consola entre el 1 y el 50. Si el número está fuera de este rango imprimir "El número no es válido" y seguir pidiendo números hasta que el número esté en ese rango. Si el número es válido crea la lógica para verificar si dicho número es par o impar. Si es par imprimir por consola "Número par" y, si es impar, "Número impar".
//La lógica para averiguar si el número es par o impar debe de estar fuera del archivo que contiene el método main en una carpeta llamada "utils" y en una clase llamada EjercicioCinco Además esta lógica debe estar ejecutada a través de un método.
//
//6.- Crea un array de 5 elementos cuyos valores sean nombres de personas. Imprime los elementos 
//del array a través de un bucle for
//
//7.- Repite el ejercicio anterior pero realiza la iteración e impresión de los elementos del array a través de un bucel for mejorado.

import java.util.Scanner;

public class Ejercicio4 extends Ejercicio5parOImpar {


	public static void main(String[] args) {
		int valor;
		Scanner entrada = new Scanner(System.in);
        
        
		 
	        	System.out.println("Introduzca un numero del 1 al 50");
	    		
	            valor = entrada.nextInt();
	       
	        	while (valor < 1 || valor > 50) {
	        		System.out.println("El numero no es valido");
		    		
		            valor = entrada.nextInt();
	        	}
			
        entrada.close();
        esParOImpar(valor);
	}

}
