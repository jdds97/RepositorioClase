package interfaces;

public interface IUsuario extends Comparable<IUsuario> {
	
	/**
	 * Metodo utilizado para saber el nombre del usuario. El nombre es el
	 * dato indificativo del usuario, es decir dos usuarios son el mismo
	 * si tienen el mismo nombre.
	 * 
	 * @return String con el nombre del usuario
	 */
	public String getNombre();
	
	
	/**
	 * Metodo utilizado para modificar el nombre del usuario
	 * @param name, String que se guardara como el nuevo nombre
	 * del usuario
	 */
	public void setNombre(String nombre);

}
