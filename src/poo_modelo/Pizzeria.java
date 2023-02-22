package poo_modelo;

import javax.swing.JOptionPane;

import poo_modelo.Pizza.Tamaño;
import poo_modelo.Pizza.Tipo;
import poo_modelo.Paninis;
public abstract class Pizzeria {
		

	
		/* Metodo de servir pizzas y paninis*/
		public void servirPizza(Pizza pizza) {
			if (pizza.isEstadoPizzaServida()==true) {
				JOptionPane.showMessageDialog(null, "La pizza está lista");
			} else {
				JOptionPane.showMessageDialog(null, "La pizza está en proceso");
			}
		}		
		
	}

}
