package poo_gestionl;

import java.util.Random;

import javax.swing.JOptionPane;

import poo_modelo.Circulo;
import poo_modelo.Cuadrado;
import poo_modelo.IFigura;
import poo_modelo.Rectangulo;
import poo_modelo.Triangulo;

public class MainFigura {

	

	public static void main(String[] args) {
		
		Random random=new Random();
		double numRandom=random.nextDouble()*10+1;
		IFigura []figuras=new IFigura[(int) numRandom];
		for (int i = 0; i < figuras.length; i++) {
			  int tipoFigura = random.nextInt(4);
			  
		        

		        switch (tipoFigura) {
		            case 0:
		                figuras[i] = new Cuadrado(50);
		                break;
		            case 1:
		                figuras[i] = new Rectangulo(10,2);
		                break;
		            case 2:
		                figuras[i] = new Triangulo(10,2);
		                break;
		            case 3:
		                figuras[i] = new Circulo(20);
		                break;
		            default:
		                
		                break;
		
			
		}
		        
		        JOptionPane.showMessageDialog(null,figuras[i].getNombreFigura()+" "+i+"\n"+figuras[i].getArea());
		}
		
	}
}
	


