package Taller.interfaces;

/** 
 * Interfaz que reprsenta el comportamiento de un coche
 */
public interface ICoche extends Comparable<ICoche> {
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
	 * Metodo para modificar el color
	 * 
	 * @param color. 
	 */
	public void setColor(String color);
	
	/**
	 * Metodo para obtener el color .
	 * 
	 * @return matricula 
	 */
	public String getColor();
	
	/**
	 * Metodo para modificar si un coche tiene remolque o no.
	 * True sera si el cocge tiene remolque, y false, si no lo tiene.
	 * 
	 * @param tieneRemolque. 
	 */
	public void setTieneRemolque(Boolean tieneRemolque);
	
	/**
	 * Metodo para saber si un coche tiene remolque o no.
	 * True sera si el coche tiene remolque, y false, si no lo tiene.
	 * 
	 * @return boolean. 
	 */
	public Boolean getTieneRemolque();

}
