package ejercicio5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// creo una coleccion tipo Map de tipo HashMap que guardara String y Double
		// y la nombro listaProductos, guardara pares de clave/valor y los guardara esin
		// mantener un orden especifico
		Map<String, Double> listaProductos = new HashMap<>();

		double precio = 0;// guardara valor de precio
		String nombreProducto = "";// guardara valor de nombre para el producto
		int seleccionUsuario = 5;// guardara seleccion del usuario

		// creo escaner y lo nombro dogma
		Scanner dogma = new Scanner(System.in);

		// bloque de instrucciones de bucle do while
		do {
			// llamo a funcion menu
			CrudEj5.menu();

			// recojo valor para seleccionUsuario con escaner
			seleccionUsuario = dogma.nextInt();
			dogma.nextLine();

			// evaluo seleccionUsuario
			switch (seleccionUsuario) {

			// en caso que seleccionUsuario sea 1
			case 1 -> {
				// solicito y recojo valores para nombreProducto y para precio
				System.out.println("Introduzca nombre del producto: ");
				nombreProducto = dogma.nextLine();

				System.out.println("Introduzca precio del producto: ");
				precio = dogma.nextDouble();

				// si los valores para nombreProducto y para precio son validos
				if (!nombreProducto.equals(null) && !nombreProducto.isEmpty() && precio >= 0.1)
					// los añado a la coleccion con put
					listaProductos.put(nombreProducto, precio);
			}
			// en caso que seleccionUsuario sea 2
			case 2 -> {
				// solicito y recojo valore para nombreProducto
				System.out.println("Introduzca nombre del producto: ");
				nombreProducto = dogma.nextLine();
				// si el valor para nombreProducto es valido
				if (!nombreProducto.equals(null) && !nombreProducto.isEmpty()) {
					// los borro de la coleccion con remove
					listaProductos.remove(nombreProducto);
				}
			}
			// en caso que seleccionUsuario sea 3
			case 3 -> {
				// imprimo los elementos de la coleccion por pantalla
				System.out.println(listaProductos);
			}
			// en caso que seleccionUsuario sea 0
			case 0 -> {
				// cierro el programa y lo comunico al usuario con mensaje por pantalla
				System.out.println("Cerrando programa.");
			}
			// en caso que seleccionUsuario sea un valor no especificado en case
			default -> {
				// comunico el error con un mensaje por pantalla
				System.err.println("Ha introducido una opcion no valida, seleccione una opcion disponible.");
			}
			}

			// el bucle se ejecutara mientras seleccionUsuario sea diferente a 0
		} while (seleccionUsuario != 0);

		// cierro escaner
		dogma.close();
	}
}
