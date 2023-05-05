package Taller.interfaces;

/** 
 * Interfaz que reprsenta el comportamiento de una moto
 */
public interface IMoto extends Comparable<IMoto>{
	
	/**
	 * Metodo para modificar la matricula
	 * 
	 * @param matricula. 
	 */
	public void setMatricula(String matricula);
	
	/**
	 * Metodo para obtener la matricula .
	 * 
	 * @return matricula 
	 */
	public String getMatricula();
	
	/**
	 * Metodo para modificar la marca
	 * 
	 * @param marca. 
	 */
	public void  setMarca(String marca);
	
	/**
	 * Metodo para obtener la marca.
	 * 
	 * @return marca
	 */
	public String getMarca();
	
	/**
	 * Metodo para modificar si una moto tiene sidecar o no.
	 * True sera si la moto tiene sidecar, y false, si no lo tiene.
	 * 
	 * @param tieneSidecar. 
	 */
	/**
	 * @return the color
	 */
	public String getColor() ;
	

	/**
	 * @param color the color to set
	 */
	public void setColor(String color);
	
	
	public void setTieneSidecar(Boolean tieneSidecar);
	
	/**
	 * Metodo para saber si una moto tiene sidecar o no.
	 * True sera si la moto tiene sidecar, y false, si no lo tiene.
	 * 
	 * @return boolean. 
	 */
	public Boolean getTieneSidecar();

}
