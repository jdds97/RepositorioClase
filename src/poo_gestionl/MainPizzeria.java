package poo_gestionl;

import javax.swing.JOptionPane;

import poo_modelo.Pizza;
import poo_modelo.Pizza.Tamaño;
import poo_modelo.Pizza.Tipo;

public class MainPizzeria {



	public static void main(String[] args) {
		Pizza margarita=new Pizza(Tipo.margarita, Tamaño.familiar);
		Pizza cuatroQuesos=new Pizza(Tipo.cuatroQuesos, Tamaño.mediana);
		Pizza funghi=new Pizza(Tipo.funghi, Tamaño.familiar);
		JOptionPane.showMessageDialog(null,margarita.tamañoPizza);
		JOptionPane.showMessageDialog(null,cuatroQuesos.tamañoPizza);
		JOptionPane.showMessageDialog(null,funghi.tamañoPizza);
		JOptionPane.showMessageDialog(null,margarita.tipoPizza);
		JOptionPane.showMessageDialog(null,cuatroQuesos.tipoPizza);
		JOptionPane.showMessageDialog(null,funghi.tipoPizza);
		
	}
	}

}
