package ejercicio2;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		// creo una coleccion tipo Set de tipo LinkedHashSet que guardara Strings y la
		// nombro listaNombres, no permitira repetidos y guardara los elementos
		// manteniendo el orden de insercion
		Set<String> listaNombres = new LinkedHashSet<String>();

		String nombre = "";// guardara nombre que guardar en listaNombres, inicializo vacia para uso en
							// bucle

		// creo escaner y lo nombro dogma
		Scanner dogma = new Scanner(System.in);

		// bucle que se ejecutara mientras el nombre introducido no sea igual a "fin"
		while (!nombre.equalsIgnoreCase("fin")) {

			// recojo valor de teclado y lo asigno a nombre con escaner
			nombre = dogma.nextLine();

			// compruebo que nombre no es igual a fin para evitar añadir fin como elemento
			// en ultima iteracion
			if (!nombre.equalsIgnoreCase("fin")) {
				listaNombres.add(nombre);
			}
		}

		// muestro listaNombres por pantalla con bucle for each que recorre y muestra el
		// contenido del elemento en la posicion nom
		for (String nom : listaNombres) {
			System.out.println(nom);
		}

		// cierro escaner
		dogma.close();
	}

}
