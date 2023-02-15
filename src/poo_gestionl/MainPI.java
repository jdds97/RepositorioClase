package poo_gestionl;

import java.util.Random;

import poo_modelo.IFigura;

public class MainPI {

	

	public static void main(String[] args) {
		Random random=new Random();
		double numRandom=random.nextDouble()*10+1;
		IFigura []figuras=new IFigura[(int) numRandom];
		for (int i = 0; i < figuras.length; i++) {
			System.out.println(figuras[i].getArea());
			
		}
	}

}
