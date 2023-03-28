package Examen2Modelo;

import javax.swing.JOptionPane;


public class Utils {
	// Creamos un bucle do{}while(Para que la condicion
	// por la que se repita sea que el usuario no ha pulsado en el menu la tecla 4
	public void menuPrincipal(TiendaComic tienda) {
		boolean salir=false;
		do {
		String pregunta = "¿Que accion desea realizar?"+"\n"
		+"1.Dar de alta un comic"+"\n"
		+"2.Listar los comics de un genero"+"\n"
		+"3.Listar los comics cuyo nivel de relevancia esta por encima de la media"+"\n"
		+"4.Salir";
		switch (tryCatchInt(pregunta)) {
		// Si la opcion es 1 dentro del menu de creacion de comic llamamos al metodo de
		// creacion de comic estandar
		// de la tienda y empieza el cuestionario sobre los atributos del comic para
		// settearlos
		case 1:
			darDeAlta(tienda);
			break;
		case 2:
			// Llamamos al metodo que esta implementado en la clase TiendaComic ya que es el
			// que puede buscar en la array que tiene
			// creada de comics los diferentes comics que tiene con el String de genero que
			// hemos pasado o quizas no ï¿½?
			pregunta = "Indica el genero";
			tienda.listaComicsPorGenero(tryCatchString(pregunta));
			break;
		case 3:
			//Llamamos al metodo implementado en la clase padre para que compare entre todos los comics su nivel de relevancia 
			//y este haga la media y saque los mayores a la media
			tienda.getNivelRelevanciaMedioComics();
			break;
		case 4:
			//Mensaje de despedida :)
			JOptionPane.showMessageDialog(null, "¡Hasta pronto!");
			salir=true;
			break;
		default:
			break;
		}
		}while(!salir);
	}

	public void darDeAlta(TiendaComic tienda) {
		
		String pregunta = "¿Que tipo de comic quiere dar de alta?" + "\n" + "1.Estandar" + "\n" + "2.Americano";
		ComicClasico comic;
		// Conforme haya sido la opcion en el try catch se sobreescribe el valor de
		// eleccionInt que hay en el trycatch declarado
		// y a continuacion se decide cual es la accion en el switch.
		switch (tryCatchInt(pregunta)) {
		case 1:
			// A partir de este punto el funcionamiento es muy facil,la eleccionString es la
			// que se sobreescribe para que
			// try catch tenga ese valor de String en el escaner JOption Pane y a su vez lo
			// que de de ese escaner se guardara
			// en la variable estatica eleccionStringTry que la ira cogiendo los diferentes
			// metodos que llamemos que necesiten
			// de ese String para settear su valor.
			comic = new ComicAmericano();
			tienda.setComic(comic);
			preguntas(comic, true);

			break;
		case 2:
			// Si la opcion es 2 dentro del menu de creacion de comic llamamos al metodo de
			// creacion de comic americano
			// de la tienda y empieza el cuestionario sobre los atributos del comic para
			// settearlos
			comic = new ComicEstandar();
			tienda.setComic(comic);
			preguntas(comic, false);
			break;

		default:
			break;
		
		
		}

	}

	public void preguntas(ComicClasico comic, boolean americano) {
		String pregunta = "¿Cual es el titulo?";
		comic.setTitulo(tryCatchString(pregunta));
		pregunta = "¿Cual es el subtitulo?";
		comic.setSubTitulo(tryCatchString(pregunta));
		// En el caso de los int me quiero parar para decir que es el mismo mecanismo
		// pero esta vez el JOptionPane lleva un
		// Integer.parseInt para la respuesta convertirla a entero y como el mecanismo
		// de antes la eleccionString es equiparable
		// en este caso a la variable estatica eleccionStringInt,por lo que tendremos
		// otro trycatch para ello

		//En el caso de los int me quiero parar para decir que es el mismo mecanismo pero esta vez el JOptionPane lleva un
		//Integer.parseInt para la respuesta convertirla a entero y como el mecanismo de antes la eleccionString es equiparable
		//en este caso a la variable estatica eleccionStringInt,por lo que tendremos otro trycatch para ello
		pregunta = "¿Cual es el precio?";
		comic.setPrecio(tryCatchInt(pregunta));
		pregunta = "¿Cual es su genero?";
		comic.setGenero(tryCatchString(pregunta));
		if (!americano) {
			pregunta = "¿Cual es su american ITB?";
			comic.setITQ(tryCatchInt(pregunta));
		}
		// Cuando hemos terminado de crear el comic nos aparecera el mensaje de que ha
		// sido creado satisfactoriamente y aparecera
		// un resumen en pantalla de los diferentes datos que hemos introducido
		JOptionPane.showMessageDialog(null,
				"***************" + "Comic creado satisfactoriamente" + "***************" + "\n" + comic.toString()
						+ "\n" + "********************************************************************");

	}
	/**
	 * Metodo tryCatch para la entrada de datos de int con bucle incorporado
	 */
	public String tryCatchString(String pregunta) {
		String eleccionTryString = null;
		boolean salirTryString = false;
		do {
			try {
				// Escaner de entrada de datos
				eleccionTryString = JOptionPane.showInputDialog(pregunta);

				// Si todo va bien sale del bucle y del metodo
				salirTryString = true;
			} catch (Exception e) {
				// Si todo no va bien vuelve a entrar en el bucle sin salir del metodo
				JOptionPane.showMessageDialog(null, "Palabra mal introducida, vuelve a intentarlo");

			}
		} while (!salirTryString);
		// Devolvemos la entrada de datos como una cadena de texto
		return eleccionTryString;
	}

	/**
	 * Metodo que solicita al usuario un numero entero a traves de una ventana de
	 * dialogo, y que utiliza un bloque try-catch para evitar errores en caso de que
	 * el usuario introduzca un valor que no sea numerico.
	 * 
	 * @param pregunta El mensaje que se muestra al usuario para solicitar el
	 *                 numero.
	 * @return El nÃºmero entero introducido por el usuario.
	 */
	public int tryCatchInt(String pregunta) {

		// Inicializacion de la variable que almacena el numero entero introducido por
		// el usuario.
		int eleccionTryInt = 0;
		// Variable que controla si se ha introducido un numero valido.
		boolean salirTryInt = false;

		// Bucle do-while para solicitar el numero hasta que se introduzca uno valido.
		do {
			try {
				// Escaner de entrada de datos
				eleccionTryInt = Integer.parseInt(JOptionPane.showInputDialog(pregunta));
				if (eleccionTryInt > 5)
					salirTryInt = false;
				// Si todo va bien sale del bucle y del metodo
				salirTryInt = true;
			} catch (Exception e) {
				// Si todo no va bien vuelve a entrar en el bucle sin salir del metodo
				JOptionPane.showMessageDialog(null, "<html>" + "<div style=text-align:left>" + "Numero mal introducido"
						+ "<hr>" + "Vuelve a intentarlo con una de las opciones" + "</div>" + "</html>");

			}
		} while (!salirTryInt);
		// Se devuelve el numero entero introducido por el usuario.
		return eleccionTryInt;
	}

}
