package poo_modelo;

import java.util.Objects;
import java.util.Random;

import colecciones.Empleado;

public class Carta2 implements Comparable<Carta2> {

	@Override
	public int hashCode() {
		return Objects.hash(palo, valor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carta2 other = (Carta2) obj;
		return palo == other.palo && valor == other.valor;
	}

	/**
	 * <h1 style=color:yellow>Creación de enums</h1>
	 * 
	 * @author Jesús De Dios.R4
	 *
	 */
	enum Palo {
		COPAS, ESPADAS, BASTOS, OROS
	}

	/**
	 * <h1 style=color:yellow>Creación de enums</h1>
	 * 
	 * @author Jesús De Dios.R4
	 *
	 */
	enum Valor {
		UNO, DOS, TRES, CUATRO, CINCO, SEIS, SIETE, SOTA, CABALLO, REY
	}

	/**
	 * *
	 * <h1 style=color:aquamarine>Creación de atributos</h1>
	 */

	private Palo palo;
	private Valor valor;
	private static double sumaTotal = 0;
	private Random random = new Random();

	/**
	 * <h1 style=color:red>Constructor</h1>
	 * <p>
	 * Creamos los valores de palo conforme a los valores ya establecidos en los al
	 * igual lo hacemos con el valor de la carta Y más tarde los valores los sumamos
	 * en la clase Carta2
	 * </p>
	 */
	public Carta2() {
		this.palo = Palo.values()[random.nextInt(Palo.values().length)];
		this.valor = Valor.values()[random.nextInt(Valor.values().length)];
		Carta2.sumaTotal += valorToDouble(valor);
	}

	/**
	 * <h1 style=color:blue>Acción</h1>
	 * <p>
	 * Este constructor sirve para convertir a String los resultados de palo y valor
	 * </p>
	 *
	 */
	public String toString() {
		return valor + " de " + palo;
	}

	/**
	 * <h1 style=color:red>Constructor</h1>
	 * <hr>
	 * <p>
	 * Este constructor sirve para convertir a String los resultados de palo y valor
	 * </p>
	 *
	 */
	public double consultarTotal() {
		return sumaTotal;
	}

	/**
	 * <h1 style=color:purple>Acción</h1>
	 * <hr>
	 * <p>
	 * Este método devuelve el valor segundo sea los enums con una funcion de los
	 * enums de .ordinal que sirve para retornar el valor entero en este caso double
	 * a String los resultados del valor de la carta Si es mas de seis le sumamos 1
	 * a ese valor y si es más retornaría 0,5
	 * </p>
	 *
	 */
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
	@Override
	public int compareTo(Carta2 o) {
		Carta2 p=(Carta2) o;
		int numeroSaliente;
		if (this.valor.values().equals(o.valor.values()) {
			numeroSaliente=0;
		}
		else if (this.palo.values()<o.palo.values()) {
			numeroSaliente=-1;
		}
		else
			numeroSaliente=1;
			return numeroSaliente;
		}
	}

