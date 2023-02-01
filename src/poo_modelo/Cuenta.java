/**
 * 
 */
package poo_modelo;

import javax.swing.JOptionPane;

/**
 * @author Jesús De Dios.R4
 *
 */
public class Cuenta {
	// Es derivado
	public final static boolean DESCUBIERTA=false;
	public final  String	MENSAJE_SALDO="Tu saldo es de ";
	private String iban;
	private int numeroCuenta;
	private double saldo;
	private double INTERES_MENSUAL;
	

	/**
	 * @param descubierta
	 * @param iban
	 * @param INTERES_MENSUAL
	 * @param numeroCuenta
	 * @param saldo
	 */
	public Cuenta(String iban, final double INTERES_MENSUAL, int numeroCuenta, double saldo) {

		this.iban = iban;
		this.INTERES_MENSUAL = INTERES_MENSUAL;
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
	}


	/**
	 * @return the iban
	 */
	public String getIban() {
		return iban;
	}

	/**
	 * @param iban the iban to set
	 */
	public void setIban(String iban) {
		this.iban = iban;
	}

	/**
	 * @return the interesMensual
	 */
	public double getInteresMensual() {
		return INTERES_MENSUAL;
	}

	/**
	 * @param interesMensual the interesMensual to set
	 */
	public void setInteresMensual(double interesMensual) {
		this.INTERES_MENSUAL = interesMensual;
	}

	/**
	 * @return the numeroCuenta
	 */
	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	/**
	 * @param numeroCuenta the numeroCuenta to set
	 */
	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	/**
	 * @return the saldo
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double beneficiosFuturos(int numMeses) {
		double beneficios = 0;
		if (!(numMeses==0) || !DESCUBIERTA) {
			beneficios=numMeses*INTERES_MENSUAL;
		}
		return beneficios;
	}

	public boolean hacerTransferenciaA(Cuenta c, double cantidad) {
		boolean realizado = false;
		if(!DESCUBIERTA && !(c.iban.equals(iban))) {
		
			saldo-=cantidad;
			c.saldo+=cantidad;
			
			realizado = true;
		}
		JOptionPane.showMessageDialog(null, MENSAJE_SALDO+getSaldo());

		return realizado;
	}

	public void ingresar(double dinero) {
		this.saldo+=dinero;
	JOptionPane.showMessageDialog(null, MENSAJE_SALDO+getSaldo());
	}

	public boolean retirar(double dinero) {
		boolean realizado = false;
		if (!DESCUBIERTA && saldo>=dinero) {
			this.saldo-=dinero;
			realizado =true ;
		}
		JOptionPane.showMessageDialog(null, MENSAJE_SALDO+getSaldo());
		return realizado;
	}

	@Override
	public String toString() {
		return "Cuenta [" + (iban != null ? "iban=" + iban + ", " : "") + "numeroCuenta=" + numeroCuenta + ", saldo="
				+ saldo + ", descubierta=" + DESCUBIERTA + ", interesMensual=" + INTERES_MENSUAL + "]";
	}

}
