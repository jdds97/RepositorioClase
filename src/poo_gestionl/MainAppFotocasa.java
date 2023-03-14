package poo_gestionl;

import poo_modelo.Alquiler;
import poo_modelo.InquilinoEmpresa;
import poo_modelo.Piso;

public class MainAppFotocasa {

	public static void main(String[] args) {
		
		Piso piso1=new Piso(3, 1, 500);
		InquilinoEmpresa jesus=new InquilinoEmpresa("Jesus de Dios Sánchez","77851894E");
		Alquiler alquiler1=new Alquiler(jesus, piso1, "2023-04-01", "2023-05-01");
		
		
		System.out.println(alquiler1.getprecioAlquilerPiso());
		System.out.println(alquiler1.toString());
	}

}
