package poo_gestionl;
import javax.swing.JOptionPane;

import poo_modelo.Alquiler;
import poo_modelo.Cliente;
import poo_modelo.Veleros;
import poo_modelo.BarcoDeLujo;
public class MainPuerto {


	public static void main(String[] args) {

	Cliente cliente=new Cliente("Jesus", 23, "Avenida de la Palmera", "692638767");
	Veleros velero=new Veleros("6194JXH", 20, "2023-03-10", 400, 20);
	BarcoDeportivo lancha =new BarcoDeportivo("7263CYL", 10, "2023-02-15", 700);
	BarcoDeLujo yate=new BarcoDeLujo("2271DJF", 100, "2023-02-28", 1200, 10);
	Alquiler alquiler =new Alquiler(cliente, "2022-08-01", "2022-08-10", lancha);
	
	JOptionPane.showMessageDialog(null, alquiler.getFechaInicioAlquiler());
	JOptionPane.showMessageDialog(null, "La potencia de la lancha es de "+lancha.getPotenciaCV());
	JOptionPane.showMessageDialog(null, "Los mástiles que tiene el velero son "+velero.getMastilesVeleros());
	JOptionPane.showMessageDialog(null, "Potencia en CV="+yate.getPotenciaCV()+"\n"+"Numero de camarotes"+yate.getNumeroCamarotes());
	JOptionPane.showMessageDialog(null, "El precio de alquiler es de "+yate.precioAlquilerBarco()+" Euros ");
	
	
	}

}
