/**
 * 
 */
package poo;

import javax.swing.JOptionPane;

/**
 * @author JesÃºs De Dios.R4
 *
 */
public class Cuenta {
	// Es derivado
	public final static boolean descubierta=false;
	public final static String mensajeSaldo="Tu saldo es de ";
	private String iban;
	private int numeroCuenta;
	private double saldo;
	private double interesMensual;
	

	/**
	 * @param descubierta
	 * @param iban
	 * @param interesMensual
	 * @param numeroCuenta
	 * @param saldo
	 */
	public Cuenta(String iban, double interesMensual, int numeroCuenta, double saldo) {

		this.iban = iban;
		this.interesMensual = interesMensual;
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
		return interesMensual;
	}

	/**
	 * @param interesMensual the interesMensual to set
	 */
	public void setInteresMensual(double interesMensual) {
		this.interesMensual = interesMensual;
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
		
		return beneficios;
	}

	public boolean hacerTransferenciaA(Cuenta c, double cantidad) {
		boolean realizado = true;
		do {
			setSaldo(-cantidad);
			c.setSaldo(+cantidad);
			
		} while (!(c.iban.equals(this.iban)));
		if (descubierta) {
			JOptionPane.showMessageDialog(null, "Actualmente "+this.numeroCuenta+"tiene una deuda actual de" + saldo
					+ ",no puede hacer ningún tipo de ingreso o transferencia hasta que la abone");
			realizado = false;
		}
		JOptionPane.showMessageDialog(null, mensajeSaldo+getSaldo());

		return realizado;
	}

	public void ingresar(double dinero) {
		setSaldo(+dinero);
	JOptionPane.showMessageDialog(null, mensajeSaldo+getSaldo());
	}

	public boolean retirar(double dinero) {
		setSaldo(-dinero);
		boolean realizado = true;
		if (descubierta) {
			JOptionPane.showMessageDialog(null, "Actualmente tiene una deuda actual de " + saldo
					+ ",no puede hacer ningún tipo de ingreso o transferencia hasta que la abone");
			realizado = false;
		}
		JOptionPane.showMessageDialog(null, mensajeSaldo+getSaldo());
		return realizado;
	}

	@Override
	public String toString() {
		return "Cuenta [" + (iban != null ? "iban=" + iban + ", " : "") + "numeroCuenta=" + numeroCuenta + ", saldo="
				+ saldo + ", descubierta=" + descubierta + ", interesMensual=" + interesMensual + "]";
	}

}
