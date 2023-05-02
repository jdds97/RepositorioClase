package testsAmazon;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import interfaces.IProducto;
import interfaces.IValoracion;
import model.Producto;
import model.Valoracion;

class ProductoTest {
	static IProducto producto1;
	static IProducto producto2;
	static IProducto producto3;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		//Producto1
				producto1=new Producto();
				producto1.setPrecio(100);
				producto1.setNombre("Colonia");
				
				//Valoracion1
				IValoracion valoracion1=new Valoracion();
				valoracion1.setComentario("Bueno");
				valoracion1.setPuntuacion(1);
				
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
				producto2=new Producto();
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
				producto3=new Producto();
				producto3.setPrecio(11);
				producto3.setNombre("Toalla");
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testProducto1() {
		assertEquals(producto1.getValoracionMedia(), 3);
	}

	@Test
	void testProducto2() {
		assertEquals(producto2.getValoracionMedia(), 4);
	}
	
	@Test
	void testProducto3() {
		assertEquals(producto3.getValoracionMedia(), 0);
	}
}
