package poo_gestionl;

import javax.swing.JOptionPane;

import poo_modelo.Alquiler;
import poo_modelo.InquilinoEmpresa;
import poo_modelo.Piso;

public class MainAppFotocasa {

	public static void main(String[] args) {
		
		Piso piso1=new Piso(3, 1, 500);
		InquilinoEmpresa jesus=new InquilinoEmpresa("Raul","77851894E");
		Alquiler alquiler1=new Alquiler(jesus, piso1, "2023-04-01", "2023-05-01");
		
		
		Piso piso2=new Piso(3, 1, 500);
		InquilinoEmpresa jesus2=new InquilinoEmpresa("Jesus de Dios S�nchez","77851894E");
		Alquiler alquiler2=new Alquiler(jesus2, piso2, "2023-04-01", "2023-05-01");
		
		System.out.println(alquiler1.getprecioAlquilerPiso());
		System.out.println(alquiler2.getprecioAlquilerPiso());
		System.out.println(alquiler2.getPrecioAlquilerMasCaro1());
		System.out.println(alquiler1.toString());
		JOptionPane.showMessageDialog(null, alquiler1.getprecioAlquilerPiso());
		
	}

}
