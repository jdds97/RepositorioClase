package ExamenModelo;

import java.util.Random;

public class Agua extends Bebida {

	private String nombreManantial;
	static Random random = new Random();
	protected static String[]nombresAgua= {"Lanjaron","Fontvella","Solan de Cabras"};
	 
     static int indiceAleatorio = random.nextInt(nombresAgua.length); 
     static String nombreSeleccionado = nombresAgua[indiceAleatorio];
	public Agua(int id, int cantidad, double precioBase, double precioFinal,Marca marca,String[]arrayNombresMarcas,String nombreMarca,String nombreManantial) {
		super(id, cantidad, precioBase, precioFinal,marca,nombresAgua,nombreSeleccionado);
		
		this.nombreManantial=nombreManantial;
	}
	/**
	 * @return the nombreManantial
	 */
	public String getNombreManantial() {
		return nombreManantial;
	}

}
