package poo_modelo;

import poo_modelo.Reloj;

public class Pizza extends Pizzeria {
	/*
	 * CreaciÃ³n de enums
	 * -Estado de la pizza
	 * -Fecha y hora de cuando fue servida
	 * -TamaÃ±o
	 * -Pizza
	 */

	// La clase debe almacenar informaciÃ³n sobre el nÃºmero total de pizzas que se
	// han pedido y que se han servido. Siempre que se crea una pizza nueva, su
	// estado es â€œpedidaâ€�

	private static int numeroPizzas = 0;

	public static int getNumeroPizzas() {
		return numeroPizzas;
	}

	private boolean estadoPizzaPedida;
	private boolean estadoPizzaServida;
	public boolean isEstadoPizzaPedida() {
		return estadoPizzaPedida;
	}

	public boolean isEstadoPizzaServida() {
		return estadoPizzaServida;
	}

	private Reloj fechaHoraServida;
	private Reloj fechaHoraPedido;

	public Reloj getFechaHoraPedido() {
		return fechaHoraPedido;
	}

	public void setFechaHoraPedido(Reloj fechaHoraPedido) {
		this.fechaHoraPedido = fechaHoraPedido;
	}

	public Reloj getFechaHoraServida() {
		return fechaHoraServida;
	}

	public void setFechaHoraServida(Reloj fechaHoraServida) {
		this.fechaHoraServida = fechaHoraServida;
	}

	enum Tamaño {
		mediana, familiar
	};

	Tamaño tamañoPizza;

	enum Tipo {
		margarita, cuatroQuesos, funghi
	};

	Tipo tipoPizza;

	/**
	 * 
	 * @return tamaÃ±oPizza
	 */
	public TamaÃ±o getTamaÃ±oPizza() {
		return tamaÃ±oPizza;
	}

	/**
	 * 
	 * @param tamaÃ±oPizza
	 */

	public void setTamaÃ±oPizza(TamaÃ±o tamaÃ±oPizza) {
		this.tamaÃ±oPizza = tamaÃ±oPizza;
	}

	/**
	 * 
	 * @return tipoPizza
	 */
	public Tipo getTipoPizza() {
		return tipoPizza;
	}

	/**
	 * 
	 * @param tipoPizza
	 */
	public void setTipoPizza(Tipo tipoPizza) {
		this.tipoPizza = tipoPizza;
	}

	/*
	 * 
	 * @return estadoPizza
	 */
	public boolean isEstadoPizza() {
		return estadoPizza;
	}

	/*
	 * @param estadoPizza
	 */
	public void setEstadoPizza(boolean estadoPizza) {
		this.estadoPizza = estadoPizza;
	}

	/*
	 * Constructor de Pizza con los parÃ¡metros de tamaÃ±o y tipo
	 */
	public Pizza(Tipo tipo, TamaÃ±o tamaÃ±o) {
		this.tamaÃ±oPizza = tamaÃ±o;
		this.tipoPizza = tipo;
		numeroPizzas++;
		estadoPizzaPedida=true;
		estadoPizzaServida=false;
	}
}