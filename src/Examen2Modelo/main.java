package Examen2Modelo;

public class main {

	public static void main(String[] args) {
		TiendaComic tienda1=new TiendaComic();
		tienda1.crearComic(); 
		tienda1.comicCreado.setTitulo("Pepito");
		System.out.println(tienda1.comicCreado.getTitulo());
	}

}
