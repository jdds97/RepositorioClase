package poo_modelo;
import java.util.Random;
public class Carta2 {
	

	enum Palo {
	    COPAS, ESPADAS, BASTOS, OROS
	}

	enum Valor {
	    UNO, DOS, TRES, CUATRO, CINCO, SEIS, SIETE, SOTA, CABALLO, REY
	}

	
	    private Palo palo;
	    private Valor valor;
	    private static double sumaTotal = 0;
	    private Random random = new Random();

	    public Carta2() {
	       this.palo = Palo.values()[random.nextInt(Palo.values().length)];
	       this.valor = Valor.values()[random.nextInt(Valor.values().length)];
	       this.sumaTotal += valorToDouble(valor);
	    }

	    public String toString() {
	        return valor + " de " + palo;
	    }

	    public double consultarTotal() {
	        return sumaTotal;
	    }

	    private double valorToDouble(Valor valor) {
	        switch (valor) {
	            case UNO:
	            case DOS:
	            case TRES:
	            case CUATRO:
	            case CINCO:
	            case SEIS:
	                return valor.ordinal() + 1;
	            case SIETE:
	                return 0.5;
	            case SOTA:
	                return 0.5;
	            case CABALLO:
	                return 0.5;
	            case REY:
	                return 0.5;
	            default:
	                return 0;
	        }
	    }
	}

	