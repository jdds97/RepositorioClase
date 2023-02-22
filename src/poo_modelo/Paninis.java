package poo_modelo;

import org.junit.jupiter.params.shadow.com.univocity.parsers.conversions.EnumSelector;

public class Paninis extends Pizza{
    enum Tamaño {
		Almería,Granada
	};
    Tamaño tamañoPizzaPanini;
        public Paninis(Tipo tipo, Tamaño tamaño) {
        super(tipo, tamaño);
        
        super.tamañoPizza=enum tamañoPizzaPanini{
            Almería,Granada
        };
    }

        public void mostrarPaninis() {
            System.out.println("Paninis");
        }

        public Tamaño getTamañoPizzaPanini() {
            return tamañoPizzaPanini;
        }

        public void setTamañoPizzaPanini(Tamaño tamañoPizzaPanini) {
            this.tamañoPizzaPanini = tamañoPizzaPanini;
        }
        
}
