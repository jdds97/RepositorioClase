package colecciones;

import Examen2Modelo.Utils;

public class Ejercicio5 {
	/**
	 * Crea el programa GESTISIMAL (GESTIón SIMplificada de Almacén) para llevar el
	 * control de los artículos de un almacén. De cada artículo se debe saber el
	 * código, la descripción, el precio de venta y el stock (número de unidades).
	 * El menú del programa debe tener, las siguientes opciones: 1. Listado 2. Alta
	 * 3. Baja 4. Modificación 5. Entrada de mercancía 6. Salida de mercancía 7.
	 * Salir La entrada y salida de mercancía supone respectivamente el incremento y
	 * decremento de stock de un determinado artículo. Hay que controlar que no se
	 * pueda sacar más mercancía de la que hay en el almacén. Habría que crear la
	 * clase Producto con los atributos que dice el enunciado. Por otro lado estaría
	 * la clase Almacen, que tendría una lista de Artículos, y tendría una seríe de
	 * método para gestionar cada una de las operaciones que se muestran en el menú.
	 * En la clase principal del proyecto habría una instancia del almacen, y un
	 * menú que iria llamando a los distintos métodos de la clase almacen
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Utils Almacen = new Utils();
		Almacen almacen1 = new Almacen();

		boolean salir = false;
		do {

			String pregunta = "¿Que quiere hacer?\n" + "1.Listado\n" + "2.Alta\n" + "3.Baja\n" + "4.Modificacion\n"
					+ "5.Entrada de mercancía\n" + "6.Salida de mercancía \n" + "7.Salir\n";
			String preguntaClave = "Dime la clave del producto";
			String preguntaDescripcion = "Dime la descripcion";
			String preguntaPrecioVenta = "¿Cuál es el precio?";
			switch (Almacen.tryCatchInt(pregunta)) {
			case 1:
				System.out.println(almacen1.getProductos().values().toString());
				break;
			case 2:
				Articulo aniadido = new Articulo(Almacen.tryCatchInt(preguntaClave),
						Almacen.tryCatchString(preguntaDescripcion), Almacen.tryCatchInt(preguntaPrecioVenta));
				almacen1.addProductos(aniadido);
				break;
			case 3:
				almacen1.eliminarProductos(Almacen.tryCatchInt(preguntaClave));
				break;
			case 4:
				do {
					Articulo modificado = almacen1.getProductos().get(Almacen.tryCatchInt(preguntaClave));
					String preguntaModificado = "¿Qué quieres modificar?\n" + "1.Codigo\n" + "2.Descripcion\n"
							+ "3.Precio Venta\n" + "4.Stock\n" + "5.Salir\n";
					switch (Almacen.tryCatchInt(preguntaModificado)) {
					case 1:
						String preguntaCodigo = "Dime el codigo";
						modificado.setCodigo(Almacen.tryCatchInt(preguntaCodigo));
						break;
					case 2:
						String preguntaDescripcion1 = "Dime la descripcion";
						modificado.setDescripcion(Almacen.tryCatchString(preguntaDescripcion1));
						break;
					case 3:
						String preguntaPrecioVenta1 = "Dime el codigo";
						modificado.setPrecioVenta(Almacen.tryCatchInt(preguntaPrecioVenta1));
						break;
					case 4:
						String preguntaStock = "Dime el stock";
						modificado.setStock(Almacen.tryCatchInt(preguntaStock));
						break;
					case 5:
						salir = true;
					default:
						break;
					}
					break;
				} while (!salir);
			case 5:
				Articulo inflado = almacen1.getProductos().get(Almacen.tryCatchInt(preguntaClave));
				almacen1.entradaMercancia(inflado);
				break;
			case 6:
				Articulo desInflado = almacen1.getProductos().get(Almacen.tryCatchInt(preguntaClave));
				almacen1.salidaMercancia(desInflado);
				break;
			case 7:
				salir = true;
				break;
			default:
				break;
			}
		} while (!salir);

	}
}