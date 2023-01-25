/**
 * 
 */
package POO;

import javax.swing.JOptionPane;

/**
 * @author Jesús De Dios.R4
 *
 */
public class Piratagochi {
	static String necesidad ="nada";
	private String nombre;
	private int energia;// Siempre será un valor entre 1 y 10
	private boolean estaHambriento;
	private int nivelFelicidad;// Siempre será un valor entre 1 y 10

	/**
	 * 
	 */
	public Piratagochi() {
		this.nombre = "Jesus";
		this.energia = 5;
		this.estaHambriento = true;
		this.nivelFelicidad = 5;
	}

	public Piratagochi(String nombre) {
		this.nombre = nombre;
		this.nombre = "Jesus";
		this.energia = 5;
		this.estaHambriento = true;
		this.nivelFelicidad = 5;
	}

	public void menu() {
		boolean finalizado = false;
		do {

			String eleccion = JOptionPane.showInputDialog("Que quieres hacer con Wally\n" + "1.Dormir\n" + "2.Jugar\n"
					+ "3.Comer\n" + "4.Mirar necesidades\n" + "5.Salir\n");
			switch (eleccion) {
			case "1":
				dormir(energia);
				break;
			case "2":
				jugar(energia);
				break;
			case "3":
				comer();
				break;
			case "4":
				getNecesidades();
				break;
			case "5":
				JOptionPane.showMessageDialog(null, "Hasta pronto");
				finalizado=true;
				break;
			default:
				JOptionPane.showMessageDialog(null, "Respuesta incorrecta");
				finalizado = true;
				break;
			}
		} while (!finalizado);
	}

	/**
	 * @param nombre
	 * @param energia
	 * @param estaHambriento
	 * @param nivelFelicidad
	 */
	public Piratagochi(String nombre, int energia, boolean estaHambriento, int nivelFelicidad) {

		this.nombre = nombre;
		this.energia = energia;
		this.estaHambriento = estaHambriento;
		this.nivelFelicidad = nivelFelicidad;
	}

	public void comer() {
		this.estaHambriento = estaHambriento;
		this.nivelFelicidad = nivelFelicidad;
		if (estaHambriento = true)
			estaHambriento = false;

		if (estaHambriento = false)
			nivelFelicidad--;
		necesidad = "dormir";
	}

	public void dormir(int horasDurmiendo) {
		this.energia = energia;
		this.nivelFelicidad = nivelFelicidad;
		
		for (int i = 0; i < horasDurmiendo; i++) {
			energia++;
			if (horasDurmiendo > 10 && horasDurmiendo < 24)
				nivelFelicidad--;
		}

		necesidad = "jugar";
	}

	public void jugar(int horasJugando) {
		this.nivelFelicidad = nivelFelicidad;
		if (estaHambriento = false && horasJugando <= 10) {
			horasJugando = nivelFelicidad;
			energia -= horasJugando;
			estaHambriento = true;
		}
		if (estaHambriento = true) {
			nivelFelicidad -= horasJugando;
			energia -= horasJugando;
		}
		necesidad = "dormir";
	}

	public void getNecesidades() {
		this.nombre=nombre;
		JOptionPane.showMessageDialog(null, "¡"+nombre+" quiere " + necesidad + "!");

	}

}
