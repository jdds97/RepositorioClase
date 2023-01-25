/**
 * 
 */
package POO;

/**
 * @author Jesús De Dios.R4
 *
 */
public class Cuenta {
	private boolean descubierta; //Es derivado
	private String iban;
	private double interesMensual;
	private int numeroCuenta;
	/**
	 * @param descubierta
	 * @param iban
	 * @param interesMensual
	 * @param numeroCuenta
	 * @param saldo
	 */
	public Cuenta(boolean descubierta, String iban, double interesMensual, int numeroCuenta, double saldo) {
		
		this.descubierta = descubierta;
		this.iban = iban;
		this.interesMensual = interesMensual;
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
	}
	private double saldo;

	/**
	 * 
	 */
	/**
	 * @return the descubierta
	 */
	public boolean isDescubierta() {
		return descubierta;
	}

	/**
	 * @param descubierta the descubierta to set
	 */
	public void setDescubierta(boolean descubierta) {
		this.descubierta = descubierta;
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
		
		return false;
	}
	public void ingresar(double dinero) {
	}
	public boolean retirar(double dinero) {
		return false;
	}
	@Override
	public String toString() {
		return "Cuenta [" + (iban != null ? "iban=" + iban + ", " : "") + "numeroCuenta=" + numeroCuenta + ", saldo="
				+ saldo + ", descubierta=" + descubierta + ", interesMensual=" + interesMensual + "]";
	}

}
