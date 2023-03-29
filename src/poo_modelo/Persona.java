package poo_modelo;

import java.time.LocalDate;

import javax.swing.JOptionPane;

public class Persona implements Comparable<Persona> {
	// Declaración de atributos privados de una persona.
	private int salario;
	protected String nombre;
	protected String apellidos;
	private int edad;
	protected char sexo;
	protected Cuenta cuentaCorriente = null;

	// Creamos este atributo como static para que vaya variando en función
	// de las diferentes acciones que haremos.
	static boolean descubierta;

	/**
	 * <h1 style=color:red>Constructor</h1>
	 * <hr>
	 * <p>
	 * Constructor de la clase persona con los siguientes:
	 * </p>
	 * 
	 * @param nombre
	 * @param apellidos
	 * @param fechaNacimiento
	 * @param sexo
	 */
	public Persona(String nombre, String apellidos, LocalDate fechaNacimiento, char sexo) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		//this.fechaNacimiento = fechaNacimiento;
		this.sexo = sexo;
	}

	/**
	 * <h1 style=color:red>Constructor</h1>
	 * <hr>
	 * <p>
	 * Constructor sencillo de una persona con valores por defecto.
	 * </p>
	 */
	public Persona() {
		this.nombre = "Jesus";
		this.apellidos = "de Dios Sánchez";
		//this.fechaNacimiento = LocalDate.parse("03-08-1997");
		this.sexo = 'M';
	}
	public Persona(String nombre,int edad) {
		this.nombre =nombre;
		this.edad=edad;
		
	}
	/**
	 * <h1 style=color:blue>Acción</h1>
	 * <hr>
	 * <p>
	 * Devuelve el nombre.
	 * </p>
	 * 
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * <h1 style=color:blue>Acción</h1>
	 * <hr>
	 * <p>
	 * Define el nombre.
	 * </p>
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * <h1 style=color:blue>Acción</h1>
	 * <hr>
	 * <p>
	 * Devuelve los apellidos.
	 * </p>
	 * 
	 * @return apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * <h1 style=color:blue>Acción</h1>
	 * <hr>
	 * <p>
	 * Define los apellidos.
	 * </p>
	 * 
	 * @param apellidos
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * <h1 style=color:blue>Acción</h1>
	 * <hr>
	 * <p>
	 * Devuelve la edad.
	 * </p>
	 * 
	 * @return edad
	 
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	*/
	/**
	 * <h1 style=color:blue>Acción</h1>
	 * <hr>
	 * <p>
	 * Define la edad.
	 * </p>
	 * @param fechaNacimiento 
	 * 
	 * @param edad
	 */
	/*
	 * public void setFechaNacimiento(LocalDate fechaNacimiento) {
	 
		this.fechaNacimiento = fechaNacimiento;
	}
	*/
	/**
	 * <h1 style=color:blue>Acción</h1>
	 * <hr>
	 * <p>
	 * Devuelve el sexo.
	 * </p>
	 * 
	 * @return sexo
	 */
	public char getSexo() {
		return sexo;
	}

	/**
	 * <h1 style=color:blue>Acción</h1>
	 * <p>
	 * Define el sexo.
	 * </p>
	 * 
	 * @param sexo
	 */
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	/**
	 * <h1 style=color:blue>Acción</h1>
	 * <hr>
	 * <p>
	 * Hace que la persona salude.
	 * </p>
	 */
	public void saludar() {
		JOptionPane.showMessageDialog(null, "Hola me llamo" + this.nombre);

	}

	/**
	 * <h1 style=color:red>Constructor</h1>
	 * <hr>
	 * <h2 style=color:green>Objeto Cuenta</h2>
	 * <p>
	 * Constructor que crea una cuenta corriente(Objeto Cuenta) a partir de el
	 * constructor que está en la clase Cuenta con los parámetros que tiene el
	 * constructor base.
	 * </p>
	 * 
	 * @param iban
	 * @param interesMensual
	 * @param numeroCuenta
	 * @param saldo
	 * 
	 */
	public void crearCuentaCorriente(String iban, double interesMensual, int numeroCuenta, double saldo) {
		// Si la cuenta no está creada si te deja abrir la cuenta
		if (cuentaCorriente == null)
			cuentaCorriente = new Cuenta(iban, interesMensual, numeroCuenta, saldo);

	}

	/**
	 * <h1 style=color:blue>Acción</h1>
	 * <hr>
	 * <h2 style=color:green>Objeto Cuenta</h2>
	 * <p>
	 * Método para que la persona saque dinero de su cuenta si cumple todas las
	 * condiciones impuestas.
	 * </p>
	 * 
	 * @param dinero
	 * @return realizado
	 */
	public boolean sacarDinero(double dinero) {
		boolean realizado = false;
		// Si la cuenta no está al descubierto,
		// el saldo es mayor al dinero que se quiere sacar y
		// la cuenta efectivamente está creada te dejará sacar dinero.
		if (!descubierta && cuentaCorriente.getSaldo() >= dinero && !(cuentaCorriente == null)) {
			cuentaCorriente.setSaldo(-dinero);
			realizado = true;

			cuentaCorriente.setSaldo(-dinero);
		}
		return realizado;

	}

	/**
	 * <h1 style=color:blue>Acción</h1>
	 * <hr>
	 * <h2 style=color:green>Objeto Cuenta</h2>
	 * <p>
	 * Método para que la persona ingrese dinero en su cuenta si cumple todas las
	 * condiciones impuestas.
	 * </p>
	 * 
	 * @param dinero
	 * @return realizado
	 */
	public boolean ingresarDinero(double cantidad) {
		boolean realizado = false;
		// Si la cuenta está creada te dejará ingresar dinero.
		if (!(cuentaCorriente == null)) {
			cuentaCorriente.setSaldo(+cantidad);
			realizado = true;
		}
		return realizado;

	}

	/**
	 * <h1 style=color:blue>Acción</h1>
	 * <hr>
	 * <h2 style=color:green>Objeto Cuenta</h2>
	 * <p>
	 * Método para que la persona transfiera dinero de su cuenta a la otra si cumple
	 * todas las condiciones impuestas.
	 * </p>
	 * 
	 * @param c
	 * @param cantidad
	 * @return realizado
	 */
	public boolean hacerTransferenciaA(Persona c, double cantidad) {
		boolean realizado = false;
		// Si la cuenta desde la que vamos a realizar la cuenta
		// no está descubierta o el iban de las dos cuentas
		// las cuales se quiere realizar la operación no coinciden
		// entonces si se podrá realizar la operaciónd e transferencia.

		if (!descubierta && !(c.cuentaCorriente.getIban().equals(cuentaCorriente.getIban()))) {

			cuentaCorriente.setSaldo(-cantidad);
			c.cuentaCorriente.setSaldo(+cantidad);

			realizado = true;
		}
		JOptionPane.showMessageDialog(null, cuentaCorriente.MENSAJE_SALDO + cuentaCorriente.getSaldo());

		return realizado;
	}

	/**
	 * <h1 style=color:blue>Acción</h1>
	 * <hr>
	 * <h2 style=color:green>Objeto Cuenta</h2>
	 * <p>
	 * Método para que la persona pueda cerrar su cuenta si esta existe.
	 * </p>
	 */
	public void cerrarCuenta() {
		// Si la cuenta está creada si te dejará cerrarla.
		if (!(cuentaCorriente == null))
			cuentaCorriente = null;
	}

	public int getEdad() {
		// TODO Auto-generated method stub
		return edad;
	}
	public boolean ismayorDeEdad() {
	boolean mayorEdad=false;
		if(edad>=18 && edad<100) {
		mayorEdad=true;
	}
		return mayorEdad;
	}
	
	@Override
	public String toString() {
		return "Persona [" + (nombre != null ? "nombre=" + nombre + ", " : "")
				+ (apellidos != null ? "apellidos=" + apellidos + ", " : "")
				 + "sexo=" + sexo + ", "
				+ (cuentaCorriente != null ? "cuentaCorriente=" + cuentaCorriente : "") + "]";
	}
	/*
	@Override
	public int compareTo(Persona o) {
	Persona p=(Persona) o;
	int numeroSaliente;
	if (this.salario==p.salario) {
		numeroSaliente=0;
	}
	else if (this.salario<p.salario) {
		numeroSaliente=-1;
	}
	else
		numeroSaliente=1;
		return numeroSaliente;
	}
	
	*/
	
	@Override
	public int compareTo(Persona o) {
		
		return this.getNombre().compareToIgnoreCase(o.nombre);
	}
	
	
	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}


	
	

	
}
