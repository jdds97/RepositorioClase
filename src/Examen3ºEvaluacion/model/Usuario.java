package Examen3ºEvaluacion.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import Examen3ºEvaluacion.interfaces.IFoto;
import Examen3ºEvaluacion.interfaces.IHashtag;
import Examen3ºEvaluacion.interfaces.IUsuario;

public class Usuario implements IUsuario {
	// Declaramos las variables que nos piden retornar en los diferentes metodos de
	// la interfaz inicializando todos los atributos
	private String nombre = "";
	private List<IFoto> listaFotos = new ArrayList<>();
	private List<IUsuario> usuariosSeguidos = new ArrayList<>();

	// Creamos el constructor vacio para despues settear sus atributos si fuera
	// necesario
	public Usuario() {
		// TODO
	}

	@Override
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String getNombre() {
		return nombre;
	}

	@Override
	public void subirFoto(IFoto foto) {
		// Registramos con el metodo .add a la lista declarada arriba de IUsuario de
		// toda la red con el usuario pasado por parametro
		this.listaFotos.add(foto);
	}

	@Override
	public List<IFoto> getFotos() {
		return this.listaFotos;
	}

	@Override
	public void seguirUsuario(IUsuario usuarioSeguido) {
		// Añadimos a lista de usuarios seguidos declarada arriba de IUsuario de
		// los usuarios seguidos el ususario que pasamos por parametro
		this.usuariosSeguidos.add(usuarioSeguido);
	}

	@Override
	public List<IFoto> getFotosFiltradasPorHashtag(IHashtag tag) {
		// Declaramos una nueva lista para guardar los datos que nos pida el metodo y
		// que vamos a devolver con el contenido para mostrar de tipo <IUsuario>
		List<IFoto> fotosFiltradas = new ArrayList<>();
		// Tenemos que recorrer la lista del usuario para obtener el hashtag
		for (IFoto foto : this.listaFotos)
			/// Recorremos la lista de hashtag de la foto que esta iterando con el
			// foto.getHashTag
			for (IHashtag hastag : foto.getHashtag())
				// Si el hashtag que pasamos por parametro es igual (equals) que el de la lista
				// de hashtag de la foto en ese momento ,añadimos la foto a la lista filtrada
				// por Hashtag
				if (hastag.getNombre().equals(tag.getNombre()))
					fotosFiltradas.add(foto);
		// Si no la contiene vuelve a comprobar en todas las fotos de la red
		return fotosFiltradas;
	}

	@Override
	public List<IFoto> getContenidoDeLosUsuariosSeguidos() {
		// Declaramos una nueva lista para guardar los datos que nos pida el metodo y
		// que vamos a devolver con el contenido para mostrar de tipo <IFoto>
		List<IFoto> fotosSeguidos = new ArrayList<>();
		//Buscamos en la lista de usuarios seguidos
		for (IUsuario usuario : this.usuariosSeguidos)
			//Dentro del usuario hay que recorrer sus fotos 
			for (IFoto foto : usuario.getFotos())
				//Vamos añadiendo cada foto de la lista de fotos del usuario iterando a la lista de fotosSeguidos
				fotosSeguidos.add(foto);
		
		return fotosSeguidos;
	}

	/**
	 * @return the listaFotos
	 */
	@Override
	public List<IFoto> getListaFotos() {
		return listaFotos;
	}

	/**
	 * @param listaFotos the listaFotos to set
	 */
	@Override
	public void setListaFotos(List<IFoto> listaFotos) {
		this.listaFotos = listaFotos;
	}

	/**
	 * @return the usuariosSeguidos
	 */
	@Override
	public List<IUsuario> getUsuariosSeguidos() {
		return usuariosSeguidos;
	}

	/**
	 * @param usuariosSeguidos the usuariosSeguidos to set
	 */
	@Override
	public void setUsuariosSeguidos(List<IUsuario> usuariosSeguidos) {
		this.usuariosSeguidos = usuariosSeguidos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		return "Usuario [" + (nombre != null ? "nombre=" + nombre + ", " : "")
				+ (listaFotos != null ? "listaFotos=" + listaFotos + ", " : "")
				+ (usuariosSeguidos != null ? "usuariosSeguidos=" + usuariosSeguidos : "") + "]";
	}
	

}
