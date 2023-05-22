package ejercicio4;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {

		// creo una coleccion tipo Map de tipo TreeSet que guardara Integers y Integers
		// y la nombro numeros, guardara pares de clave/valor y los guardara en orden de
		// ordenacion (menor a mayor)
		Map<Integer, Integer> numeros = new TreeMap<>();

		// creo una coleccion tipo Map de tipo TreeSet que guardara Integers y Integersy
		// la nombro estrellas, guardara pares de clave/valor y los guardara en orden de
		// ordenacion (menor a mayor)
		Map<Integer, Integer> estrellas = new TreeMap<>();

		int numeroIntroducido = 0;// guardara el numero introducido

		String decision = "";// guardara decision de usuario

		// creo escaner y lo nombro dogma
		Scanner dogma = new Scanner(System.in);

		// comunico al usuario que guarde 5 valores en numeros y 2 valores en estrellas
		System.out.println("Introduzca 5 numeros y 2 estrellas.");

		// bucle que se ejecuta mientras decision sea diferente a no
		while (!decision.equalsIgnoreCase("No")) {
			// pregunto al usuario si desea añadir otro numero
			System.out.println("Desea añadir otro numero?");
			decision = dogma.nextLine();

			// en caso positivo
			if (decision.equalsIgnoreCase("Si")) {
				// solicito nuevo valor
				System.out.println("Introduzca el valor del numero.");
				// lo recojo y asgino con escaner a numeroIntroducido
				numeroIntroducido = dogma.nextInt();
				dogma.nextLine();

				// y lo guardo en numeros
				numeros.put(numeroIntroducido, 1);
			}

			// pregunto al usuario si desea añadir otra estrella
			System.out.println("Desea añadir otra estrella?");
			decision = dogma.nextLine();
			// en caso positivo
			if (decision.equalsIgnoreCase("Si")) {
				// solicito nuevo valor
				System.out.println("Introduzca el valor de la estrella.");
				// lo recojo y asgino con escaner a numeroIntroducido
				numeroIntroducido = dogma.nextInt();
				dogma.nextLine();
				// y lo guardo en estrellas
				estrellas.put(numeroIntroducido, 1);
			}

		}

		// reinicio valor a decision para usarla de nuevo
		decision = "";

		// muetro valores actuales de numeros y estrellas
		System.out.println("Numeros" + numeros);
		System.out.println();
		System.out.println("Estrellas" + estrellas);
		System.out.println();

		// bucle que se ejecuta mientras decision sea diferente a no
		while (!decision.equalsIgnoreCase("No")) {
			// pregunto al usuario si desea añadir otro numero
			System.out.println("Desea añadir otro numero?");
			decision = dogma.nextLine();

			// en caso positivo
			if (decision.equalsIgnoreCase("Si")) {
				// solicito nuevo valor
				System.out.println("Introduzca el valor del numero.");
				// lo recojo y asgino con escaner a numeroIntroducido
				numeroIntroducido = dogma.nextInt();
				dogma.nextLine();

				// compruebo si numeroIntroducido ya se encuentra en la coleccion numeros
				if (numeros.containsKey(numeroIntroducido)) {
					// de ser asi lo reemplazo por si mismo y reemplazo su valor por su valor +1
					// haciendo uso de su getter
					numeros.replace(numeroIntroducido, numeros.get(numeroIntroducido),
							numeros.get(numeroIntroducido) + 1);

					// de no encontrarse en la coleccion
				} else {
					// lo guardo en numeros
					numeros.put(numeroIntroducido, 1);
				}
			}
			// pregunto al usuario si desea añadir otra estrella
			System.out.println("Desea añadir otra estrella?");
			decision = dogma.nextLine();

			// en caso positivo
			if (decision.equalsIgnoreCase("Si")) {
				// solicito nuevo valor
				System.out.println("Introduzca el valor de la estrella.");
				// lo recojo y asgino con escaner a numeroIntroducido
				numeroIntroducido = dogma.nextInt();
				dogma.nextLine();

				// compruebo si numeroIntroducido ya se encuentra en la coleccion estrellas
				if (estrellas.containsKey(numeroIntroducido)) {
					// de ser asi lo reemplazo por si mismo y reemplazo su valor por su valor +1
					// haciendo uso de su getter
					estrellas.replace(numeroIntroducido, estrellas.get(numeroIntroducido),
							estrellas.get(numeroIntroducido) + 1);

					// de no encontrarse en la coleccion
				} else {
					// lo guardo en estrellas
					estrellas.put(numeroIntroducido, 1);
				}
			}
		}
		// muetro valores actuales de numeros y estrellas
		System.out.println("Numeros" + numeros);
		System.out.println();
		System.out.println("Estrellas" + estrellas);
		System.out.println();

		// cierro escaner
		dogma.close();
	}

}
