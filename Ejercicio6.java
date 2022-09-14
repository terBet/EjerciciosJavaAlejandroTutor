package ejerciciosRepaso;


//6.- Crea un array de 5 elementos cuyos valores sean nombres de personas. Imprime los elementos 
//del array a través de un bucle for
//


public class Ejercicio6 {
	static String [] personas= {"Ana", "Alma", "Zoilo", "Emma", "Sandra"};


	public static void main(String[] args) {
		for (int i = 0;i<personas.length; i++) {
			String personita = personas[i];
			System.out.println(personita);
			
		}
	}

}
