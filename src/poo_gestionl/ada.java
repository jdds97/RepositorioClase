package poo_gestionl;

import interfaces.IProducto;
import interfaces.ITienda;
import interfaces.IUsuario;
import interfaces.IValoracion;
import model.Producto;
import model.PuntuacionInvalidaException;
import model.Tienda;
import model.Usuario;
import model.Valoracion;

public class ada {
	static ITienda amazon;
	
	public static void main(String[] args) throws PuntuacionInvalidaException {
		amazon=new Tienda();
		IProducto producto1=new Producto();
		producto1.setPrecio(100);
		producto1.setNombre("Colonia");
		
		//Valoracion1
		IValoracion valoracion1=new Valoracion();
		valoracion1.setComentario("Bueno");
		valoracion1.setPuntuacion(3);
		
		//Valoracion2
		IValoracion valoracion2=new Valoracion();
		valoracion2.setComentario("Bueno");
		valoracion2.setPuntuacion(4);
		
		//Valoracion3
		IValoracion valoracion3=new Valoracion();
		valoracion3.setComentario("Bueno");
		valoracion3.setPuntuacion(4);
		
		producto1.addValoracion(valoracion1);
		producto1.addValoracion(valoracion2);
		producto1.addValoracion(valoracion3);
		
		//Producto2
		IProducto producto2=new Producto();
		producto2.setPrecio(10);
		producto2.setNombre("Polo");
		
		//Valoracion4
		IValoracion valoracion4=new Valoracion();
		valoracion4.setComentario("Bueno");
		valoracion4.setPuntuacion(3);
		
		//Valoracion5
		IValoracion valoracion5=new Valoracion();
		valoracion5.setComentario("Bueno");
		valoracion5.setPuntuacion(5);
		
		producto2.addValoracion(valoracion4);
		producto2.addValoracion(valoracion5);
		
		//Producto3
		IProducto producto3=new Producto();
		producto3.setPrecio(11);
		producto3.setNombre("Toalla");
		
		amazon.addProducto(producto1);
		amazon.addProducto(producto2);
		amazon.addProducto(producto3);
		System.out.println(amazon.getProductoMejorValoracion());
		System.out.println(amazon.getProductosOrdenadosPorPrecio());
		
		IUsuario usuario1=new Usuario();
		usuario1.setNombre("pepito");
		System.out.println(usuario1.getNombre());
	}
}
