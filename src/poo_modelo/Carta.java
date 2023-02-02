package poo_modelo;

import java.util.Random;

public class Carta {
	private Palo palo;
	private enum valor{UNO,DOS,TRES,CUATRO,CINCO,SEIS,SIETE,SOTA,CABALLO,REY};
	private double sumaTotal;
	Random random=new Random();



		  Carta(int valor, String palo) {
		    this.valor = valor;
		    this.palo = palo;
		  }
		}
