package interfaces;

import model.PuntuacionInvalidaException;

public interface IValoracion extends Comparable<IValoracion> {
	/**
	 * Metodo utilizado para saber el comentario de la valoracion
	 * @return String con el comentario
	 */
	public String getComentario();
	
	/**
	 * Metodo utilizado para modificar el comentario de la valoracion
	 * @param comentario, String que se guardara como el nuevo comentario
	 * de la valoracion
	 */
	public void setComentario(String comentario);
	
	/**
	 * Metodo utilizado para saber la puntuacion de la valoracion
	 * @return int Devolvera un numero entre 1, y 5.
	 */
	public int getPuntuacion();
	
	/**
	 * Metodo utilizado para modificar la puntuacion de la valoracion.
	 * 
	 * @param puntuacion, int que se guardara como la nueva puntuacion 
	 * de la valoracion. El parametro debera ser un numero entre 1 y 5 (incluidos ambos).
	 * Si la puntuacion no se encuentra entre 1 y 5, el metodo lanzara 
	 * la excepcion PuntuacionInvalidaException
	 */
	public void setPuntuacion(int puntuacion) throws PuntuacionInvalidaException;
	
	
	/**
	 * Metodo utilizado para saber el usuario que ha realizado la valoracion
	 * @return Usuario  que ha realizado el comentario.
	 */
	public IUsuario getUsuario();
	
	/**
	 * Metodo utilizado para modificar el usuario de la valoracion
	 * @param usuario, Usuario que se guardara como el nuevo usuario que ha realizado
	 *  la valoracion
	 */
	public void setUsuario(IUsuario usuario);
	public abstract int compareTo(IValoracion o);
}
