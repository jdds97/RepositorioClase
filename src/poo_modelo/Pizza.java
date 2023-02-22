package poo_modelo;

import poo_modelo.Reloj;

public class Pizza extends Pizzeria {
	/*
	 * Creación de enums
	 * -Estado de la pizza
	 * -Fecha y hora de cuando fue servida
	 * -Tamaño
	 * -Pizza
	 */

	// La clase debe almacenar información sobre el número total de pizzas que se
	// han pedido y que se han servido. Siempre que se crea una pizza nueva, su
	// estado es “pedida”

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
	 * @return tamañoPizza
	 */
	public Tamaño getTamañoPizza() {
		return tamañoPizza;
	}

	/**
	 * 
	 * @param tamañoPizza
	 */

	public void setTamañoPizza(Tamaño tamañoPizza) {
		this.tamañoPizza = tamañoPizza;
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
	 * Constructor de Pizza con los parámetros de tamaño y tipo
	 */
	public Pizza(Tipo tipo, Tamaño tamaño) {
		this.tamañoPizza = tamaño;
		this.tipoPizza = tipo;
		numeroPizzas++;
		estadoPizzaPedida=true;
		estadoPizzaServida=false;
	}
}