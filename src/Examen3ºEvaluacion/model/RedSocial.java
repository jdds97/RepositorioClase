package Examen3ºEvaluacion.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import Examen3ºEvaluacion.interfaces.IFoto;
import Examen3ºEvaluacion.interfaces.IHashtag;
import Examen3ºEvaluacion.interfaces.IRedSocial;
import Examen3ºEvaluacion.interfaces.IUsuario;

public class RedSocial implements IRedSocial {
	// Declaramos la lista de todos los usuarios de la red con su respectivo tipo
	private List<IUsuario> usuariosRed = new ArrayList<>();

	// Creamos el constructor vacio para despues settear sus atributos si fuera
	// necesario
	public RedSocial() {
		// TODO
	}

	@Override
	public List<IFoto> getContenidoParaMostrarUsuario(IUsuario usuario) {
		// Declaramos una nueva lista para guardar los datos que nos pida el metodo y
		// que vamos a devolver con el contenido para mostrar de tipo <IFoto>
		List<IFoto> contenido = new ArrayList<>();
		// Añadimos a la anterior lista utilizando el metodo de Usuario ya implementado
		// y como ya hemos implementado el compareTo en Usuario por el numero de
		// etiquetas
		// no hace falta aplicarle ningun desorden
		contenido.addAll(usuario.getContenidoDeLosUsuariosSeguidos());
		// Devolvemos la lista de contenido de los usuarios seguidos del IUsuario pasado
		// por parametro
		return contenido;
	}

	@Override
	public List<IFoto> getFotosFiltradasPorHashtag(IHashtag tag) {
		// Declaramos una nueva lista para guardar los datos que nos pida el metodo y
		// que vamos a devolver con el contenido para filtrar de tipo <IFoto>
		List<IFoto> fotosTag = new ArrayList<>();
		// Tenemos que recorrer la lista de esta red social para obtener el hashtag
		for (IUsuario usuario : this.usuariosRed) 
			//Como el metodo ya lo tenemos hecho en Usuario lo reutilizamos
			// y se va a hacer para todos los usuarios que tengan fotos con 
			//hashtag pasado como parametro 
			fotosTag.addAll(usuario.getFotosFiltradasPorHashtag(tag));
		
		// Si no la contiene vuelve a comprobar en todas las fotos de la red
		return fotosTag;
	}

	@Override
	public void registrarUsuario(IUsuario usuarioNuevo) {
		// Registramos con el metodo .add a la lista declarada arriba de IUsuario de
		// toda la red con el usuario pasado por parametro
		this.usuariosRed.add(usuarioNuevo);
	}

	@Override
	public int hashCode() {
		return Objects.hash(usuariosRed);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RedSocial other = (RedSocial) obj;
		return Objects.equals(usuariosRed, other.usuariosRed);
	}

	/**
	 * @return the usuariosRed
	 */
	@Override
	public List<IUsuario> getUsuariosRed() {
		return usuariosRed;
	}

	/**
	 * @param usuariosRed the usuariosRed to set
	 */
	@Override
	public void setUsuariosRed(List<IUsuario> usuariosRed) {
		this.usuariosRed = usuariosRed;
	}

	@Override
	public String toString() {
		return "RedSocial [" + (usuariosRed != null ? "usuariosRed=" + usuariosRed : "") + "]";
	}

	
	
	
}
