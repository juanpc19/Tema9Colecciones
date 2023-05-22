package ejercicio1;

import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {

		// creo una coleccion tipo Set de tipo TreeSet que guardara Integers y la
		// nombro listaNumeros, no permitira repetidos y los guardara en orden de
		// ordenacion (menor a mayor)
		Set<Integer> listaNumeros = new TreeSet<Integer>();

		int numeroRandom;// guardara un numero aleatorio entre 0 y 99

		// mientras size de listaNumeros sea menor a 20
		while (listaNumeros.size() < 20) {
			// creo un numero random del 0 al 99
			numeroRandom = (int) (Math.random() * 100);
			// lo añado a la listaNumeros
			listaNumeros.add(numeroRandom);
		}

		// muestro listaNumeros por pantalla con bucle for each que recorre y muestra el
		// contenido del elemento en la posicion num
		for (Integer num : listaNumeros) {
			System.out.println(num);
		}

	}

}
