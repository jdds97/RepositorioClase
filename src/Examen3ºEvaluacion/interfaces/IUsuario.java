package Examen3ºEvaluacion.interfaces;

import java.util.List;

/**
 * Interfaz utilizada para representar el comportamiento de un usuario de la red
 * 
 * @author Raul SG
 *
 */
public interface IUsuario {

	/**
	 * Metodo que devuelve el nombre del usuario.
	 * 
	 * @return String. Cadena que contiene el nombre
	 */
	void setNombre(String nombre);

	/**
	 * Metodo utilizado para modificar el nombre.
	 * 
	 * @param nombre. El nombre pasado por parametro sera el nuevo nombre
	 * 
	 *                nombre nunca va a ser null, por lo que no hay que preocuparse
	 *                de si un usuario tiene un nombre igual a null.
	 */
	String getNombre();

	/**
	 * Cada usuario va a tener un registro de su contenido, es decir de las fotos
	 * que ha subido. El siguiente metodo es utilizado para subir una nueva foto
	 * como contenido del usuario.
	 * 
	 * @param foto. Foto que se va a a�adir al registro de contenido subido por el
	 *              usuario.
	 * 
	 *              foto no va a ser nunca igual a null.
	 */
	void subirFoto(IFoto foto);

	/**
	 * Metodo que devuleve la lista de todas las fotos subidas por el usuario.
	 * 
	 * @return List<IFoto>. Lista de las fotos del usuario.
	 */
	List<IFoto> getFotos();

	/**
	 * Cuando un usuario quiere seguir a otro, se utilizara el siguiente metodo, el
	 * cual se encargara de a�adir el usuarioSeguido al listado de usuarios
	 * seguidos.
	 * 
	 * @param usuarioSeguido. Usuario que se desea seguir.
	 * 
	 *                        usuarioSeguido nunca sera igual a null, ni tampoco
	 *                        sera un usuario que ya estamos siguiendo, por lo que
	 *                        no es necesario controlar estos casos.
	 */
	void seguirUsuario(IUsuario usuarioSeguido);

	/**
	 * Metodo que devuelve un listado de las fotos subidas por el usuario, que
	 * contienen el hastag pasado por parametros. Es decir, de todas las fotos
	 * subidas por el usuario, estamos filtrando por el hashtag
	 * 
	 * @param tag. Hashtag por el que deseamos filtrar.
	 * 
	 * @return List<IFoto>. Listado de las fotos del usuario que tienen el tag
	 *         pasado como parametro, en su listado de hashtags.
	 * 
	 *         tag nunca a ser null, por lo que no es necesario controlar dicho
	 *         caso.
	 */
	List<IFoto> getFotosFiltradasPorHashtag(IHashtag tag);

	/**
	 * Metodo que devuelve todas las fotos que han subido los usuarios a los que
	 * seguimos. Es decir, con este metodo obtenemos todas las fotos de los usuarios
	 * a los que estamos siguiendo en la red.
	 * 
	 * @return List<IFoto>. Lista de fotos, que contiene las fotos de los usuarios a
	 *         los que seguimos.
	 */
	List<IFoto> getContenidoDeLosUsuariosSeguidos();

	/**
	 * Metodo que devuelve todas las fotos que ha subido el usuario
	 * 
	 * @return List<IFoto>. Lista de fotos, que contiene las fotos del usuario.
	 */

	public List<IFoto> getListaFotos();

	/*
	 * Metodo utilizado para modificar la lista entera de fotos del usuario
	 * 
	 * @param listaFotos List<IFoto> Listado nuevo de fotos
	 */

	public void setListaFotos(List<IFoto> listaFotos);

	/**
	 * Metodo que devuelve la lista entera de usuarios que sigue el usuario
	 * 
	 * @return List<IUsuario>. Lista de fotos, que contiene las fotos del usuario.
	 */
	public List<IUsuario> getUsuariosSeguidos();

	/*
	 * Metodo utilizado para modificar la lista entera de IUsuario de usuarios
	 * seguidos
	 * 
	 * @param usuariosSeguidos List<IUsuario>. Listado nuevo de usuarios seguidos.
	 */
	public void setUsuariosSeguidos(List<IUsuario> usuariosSeguidos);

}
