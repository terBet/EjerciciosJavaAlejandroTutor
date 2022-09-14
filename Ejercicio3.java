package ejerciciosRepaso;
//4.- Crea un programa en java que pida introducir un número por consola. El programa pedirá siempre un número mientras que éste no sea el 5 y cuando así sea imprimir "Fin del programa"
//terminando asi dicho programa
//

import java.util.Scanner;

public class Ejercicio3 {

	public Ejercicio3() {
		
	}
	
	
	public static void main(String[] args) {
		int valor;
		
		Scanner entrada = new Scanner(System.in);
        do {
        	System.out.println("Introduzca enteros");
    		
            valor = entrada.nextInt();
        }
        	while (valor != 5);
			
        entrada.close();
        System.out.println("Fin del programa");
		}
}
