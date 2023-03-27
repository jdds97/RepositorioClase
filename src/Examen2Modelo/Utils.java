package Examen2Modelo;

import javax.swing.JOptionPane;
import Examen2TrimestreModelo.TiendaComicsMal;

public class Utils {
	//Creamos un bucle do{}while(Para que la condicion
	//por la que se repita sea que el usuario no ha pulsado en el menu la tecla 4
	public void menuPrincipal(String eleccion,TiendaComicsMal tienda) {	
	String pregunta="Que accion desea realizar";
	ComicClasico comic;
	tryCatchInt(eleccion);
	switch (eleccion) {
	case 1:
		crearComic(tienda);
		break;
	case 2:
		tienda.listarPorGenero();
		break;
	case 3:
		tienda.nivelRelevancia():
		break;
	default:
		break;
	}
	tienda.crearComic(comic);
	tienda.setTituloComic();
	tienda.
	
	}
	public setAtributoObjectInt() {
		
	}
	public switch2Opciones(String pregunta,Object object) {
		String pregunta=pregunta
		switch (pregunta) {
		case 1:
			object.
			break;
		case 2:
		default:
			break;
		}
	}
	do {
		
		//Conforme haya sido la opcion en el try catch se sobreescribe el valor de eleccionInt que hay en el trycatch declarado
		//y a continuacion se decide cual es la accion en el switch.
		switch (eleccionInt) {
		
		case 1:
			//Si la opcion es 1 nos vuelve a preguntar y el try catch siguiente hace el mismo mecanismo que el anterior 
			eleccionStringInt = "¿Que tipo de comic quiere dar de alta?" + "\n" + "1.Estandar" + "\n"
					+ "2.Americano";
			tryCatchInt();
			//Volvemos a coger los valores del trycatch que ha sobreescrito 
			switch (eleccionInt) {
			case 1:
				//Si la opcion es 1 dentro del menu de creacion de comic llamamos al metodo de creacion de comic estandar
				//de la tienda y empieza el cuestionario sobre los atributos del comic para settearlos
				tienda1.crearComicEstandar();
				
				//A partir de este punto el funcionamiento es muy facil,la eleccionString es la que se sobreescribe para que 
				//try catch tenga ese valor de String en el escaner JOption Pane y a su vez lo que de de ese escaner se guardara
				//en la variable estatica eleccionStringTry que la ira cogiendo los diferentes metodos que llamemos que necesiten
				//de ese String para settear su valor.
				
				eleccionString = "¿Cual es el titulo?";
				tryCatchString();
				tienda1.getComicCreado().setTitulo(eleccionStringTry);

				eleccionString = "¿Cual es el subtitulo?";
				tryCatchString();
				tienda1.getComicCreado().setSubTitulo(eleccionStringTry);
				
				//En el caso de los int me quiero parar para decir que es el mismo mecanismo pero esta vez el JOptionPane lleva un
				//Integer.parseInt para la respuesta convertirla a entero y como el mecanismo de antes la eleccionString es equiparable
				//en este caso a la variable estatica eleccionStringInt,por lo que tendremos otro trycatch para ello
				eleccionStringInt = "¿Cual es el precio?";
				tryCatchInt();

				tienda1.getComicCreado().setPrecio(eleccionInt);

				eleccionString = "¿Cual es su genero?";
				tryCatchString();
				tienda1.getComicCreado().setGenero(eleccionStringTry);
				//Cuando hemos terminado de crear el comic nos aparecera el mensaje de que ha sido creado satisfactoriamente y aparecera
				//un resumen en pantalla de los diferentes datos que hemos introducido 
				JOptionPane.showMessageDialog(null,
						"***************" + "Comic creado satisfactoriamente" + "***************" + "\n"
								+ tienda1.getComicCreado().toString() + "\n"
								+ "********************************************************************");

				break;

			case 2:
				//Si la opcion es 2 dentro del menu de creacion de comic llamamos al metodo de creacion de comic americano
				//de la tienda y empieza el cuestionario sobre los atributos del comic para settearlos
				tienda1.crearComicAmericano();
				
				//A partir de este punto el funcionamiento es muy facil,la eleccionString es la que se sobreescribe para que 
				//try catch tenga ese valor de String en el escaner JOption Pane y a su vez lo que de de ese escaner se guardara
				//en la variable estatica eleccionStringTry que la ira cogiendo los diferentes metodos que llamemos que necesiten
				//de ese String para settear su valor.
				eleccionString = "¿Cual es el titulo?";
				tryCatchString();
				tienda1.getComicCreado().setTitulo(eleccionStringTry);

				eleccionString = "¿Cual es el subtitulo?";
				tryCatchString();
				tienda1.getComicCreado().setSubTitulo(eleccionStringTry);
				
				//En el caso de los int me quiero parar para decir que es el mismo mecanismo pero esta vez el JOptionPane lleva un
				//Integer.parseInt para la respuesta convertirla a entero y como el mecanismo de antes la eleccionString es equiparable
				//en este caso a la variable estatica eleccionStringInt,por lo que tendremos otro trycatch para ello
				eleccionStringInt = "¿Cual es el precio?";
				tryCatchInt();
				tienda1.getComicCreado().setPrecio(eleccionInt);

				eleccionString = "¿Cual es su genero?";
				tryCatchString();
				tienda1.getComicCreado().setGenero(eleccionStringTry);

				eleccionStringInt = "¿Cual es su American ITQ?";
				tryCatchInt();
				tienda1.getComicCreado().setITQ(eleccionInt);
				
				//Cuando hemos terminado de crear el comic nos aparecera el mensaje de que ha sido creado satisfactoriamente y aparecera
				//un resumen en pantalla de los diferentes datos que hemos introducido 
				JOptionPane.showMessageDialog(null,
						"***************" + "Comic creado satisfactoriamente" + "***************" + "\n"
								+ tienda1.getComicCreado().toString() + "\n"
								+ "********************************************************************");

				break;
			}
			break;

		case 2:
			//Cuando en el menu principal escogemos la opcion2 se vuelve a hacer el mismo mecanismo convirtiendo el String a minuscula
			//y entonces el mecanismo se hara igual que en las anteriores opciones y volvemos a llamar al metodo tryCatch 
			eleccionString = "Indica el genero".toLowerCase();
			tryCatchString();
			
			//Llamamos al metodo que esta implementado en la clase TiendaComic ya que es el que puede buscar en la array que tiene 
			//creada de comics los diferentes comics que tiene con el String de genero que hemos pasado o quizas no ¿?
			tienda1.listaComicsPorGenero(eleccionStringTry);

			break;

		case 3:
			//Llamamos al metodo implementado en la clase padre para que compare entre todos los comics su nivel de relevancia 
			//y este haga la media y saque los mayores a la media
			tienda1.getListaComicMayorALaMedia();
			break;

		case 4:
			//Mensaje de despedida :)
			JOptionPane.showMessageDialog(null, "¡Hasta pronto!");

			break;

		}
		//Setteamos el comicCreado a null para que se puedan crear mas comics con diferentes valores
		tienda1.setComicCreado(null);

	} while (eleccionInt != 4);
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
