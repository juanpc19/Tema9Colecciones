package ejercicio3;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		// creo una coleccion tipo Set de tipo TreeSet que guardara Strings y la
		// nombro listaNombres, no permitira repetidos y los guardara en orden de
		// ordenacion (alfabeticamente)
		Set<String> listaNombres = new TreeSet<String>();

		String nombre = "";// guardara nombre que guardar en listaNombres, inicializo vacia para uso en
							// bucle

		// creo escaner y lo nombro dogma
		Scanner dogma = new Scanner(System.in);

		// bucle que se ejecutara mientras el nombre introducido no sea igual a "fin"
		while (!nombre.equalsIgnoreCase("fin")) {

			// recojo valor de teclado y lo asigno a nombre con escaner
			nombre = dogma.nextLine();

			// break para evitar que fin se añada a la lista
			if (nombre.equalsIgnoreCase("fin")) {
				break;
			}

			// y si el nombre no esta en la listaNombres
			if (!listaNombres.contains(nombre)) {
				// lo añado a la listaNombres
				listaNombres.add(nombre);
			}
		}

		// muestro listaNombres por pantalla con bucle for each que recorre y muestra el
		// contenido del elemento en la posicion nom
		for (String nom : listaNombres) {
			System.out.println(nom);
		}

		// mensaje para comprobar longitud de la listaNombres
		System.out.println("El tamaño de la coleccion es: " + listaNombres.size());

		// cierro escaner
		dogma.close();

	}

}
