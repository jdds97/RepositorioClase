package poo_modelo;

import java.util.Scanner;

public class Alumno {
	private int nota;
	Scanner entradaNotas= new Scanner(System.in);
	/**
	 * @param nota
	 */
	public Alumno(int nota) {
		
		this.nota = nota;
	}

	/**
	 * @return the nota
	 */
	protected int getNota() {
		return nota;
	}

	/**
	 * @param nota the nota to set
	 */
	protected void setNota(int nota) {
		this.nota = nota;
	}
	public boolean estoyAprobado() {
        boolean aprobado=true;
        if(nota<5)
            aprobado=false;
        return aprobado;
    }
    
    public String notaCualitativa() {
        String calificacion;
        if (nota<5) {
            calificacion="Suspenso";
        } else if (nota>=5 && nota <=6) {
            calificacion="Bien";
        } else if (nota>6 && nota <=8) {
            calificacion="Notable";
        } else if (nota<=10) {
            calificacion="Sobresaliente";
        } else {
            calificacion="Error";
        }
        return calificacion;
    }
    



	public void testNotas(double nota1,double nota2,double nota3){
		
	
	System.out.println("Indica las 3 notas");
	//Declaramos la entrada de notas
	nota1=entradaNotas.nextDouble();
	nota2=entradaNotas.nextDouble();
	nota3=entradaNotas.nextDouble();
	double media = (nota1+nota2+nota3)/3;
	//Ponemos los supuestos
	if(media<=4.9) {
		System.out.println("Tienes un insuficiente");
	}
	else if(media == 5){
		System.out.println("Tienes un suficiente");	
	}
	else if(media>=6 && media<=7.5) {
		System.out.println("Tienes un bien");
	}
	else if(media>=7.6 && media<=8.5) {
		System.out.println("Tienes un notable");
	}
	else if(media>=8.6 && media==10.0){
		System.out.println("Tienes un sobresaliente");
	}
	}
}
