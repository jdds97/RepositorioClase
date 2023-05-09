package Examen3ºEvaluacion.tests;

import Examen3ºEvaluacion.interfaces.IFoto;
import Examen3ºEvaluacion.interfaces.IHashtag;
import Examen3ºEvaluacion.interfaces.IUsuario;
import Examen3ºEvaluacion.model.Foto;
import Examen3ºEvaluacion.model.Hashtag;
import Examen3ºEvaluacion.model.RedSocial;
import Examen3ºEvaluacion.model.Usuario;

public class Main {

	public static void main(String[] args) {
		RedSocial instagram = new RedSocial();

		// Usuario1
		IUsuario pedro = new Usuario();
		pedro.setNombre("Pedro");
		instagram.registrarUsuario(pedro);
		

		// Usuario2
		IUsuario antonio = new Usuario();
		pedro.setNombre("Pedro");
		instagram.registrarUsuario(antonio);

		// Foto 1
		IFoto foto1 = new Foto();
		foto1.setPath("playita.jpg");

		// Foto 1 Hashtags
		IHashtag tag1 = new Hashtag();
		tag1.setNombre("#PedroVibes");
		IHashtag tag2 = new Hashtag();
		tag2.setNombre("#Veraneo");

		// Foto 2
		IFoto foto2 = new Foto();
		foto2.setPath("playita.jpg");
		
		// Foto 2 Hashtags
		IHashtag tag22 = new Hashtag();
		tag22.setNombre("#AntonioVibes");
		
	
		
		// Foto 3
		IFoto foto3 = new Foto();
		foto3.setPath("piscina.jpg");

		// Foto 3 Hashtags
		IHashtag tagfoto3 = new Hashtag();
		tagfoto3.setNombre("#Piscina Vibes");
		IHashtag tagfoto3y2 = new Hashtag();
		tagfoto3y2.setNombre("#Veraneo");

		// Añadido de hashtags Fotos 1,2 y 3
		foto1.addHashtag(tag1);
		foto1.addHashtag(tag2);
		foto2.addHashtag(tag22);
		foto3.addHashtag(tagfoto3);
		foto3.addHashtag(tagfoto3y2);
		
		//Subida de fotos
		pedro.subirFoto(foto1);
		pedro.subirFoto(foto2);
		pedro.subirFoto(foto3);
		antonio.subirFoto(foto1);
		antonio.subirFoto(foto2);
		antonio.subirFoto(foto3);
		// Seguir usuario 1
		pedro.seguirUsuario(antonio);
		// Seguir usuario 2
		antonio.seguirUsuario(pedro);
		
		System.out.println(instagram.getContenidoParaMostrarUsuario(antonio));
		System.out.println(instagram.getContenidoParaMostrarUsuario(pedro));
		System.out.println(instagram.getFotosFiltradasPorHashtag(tagfoto3y2));
		System.out.println(pedro.getFotosFiltradasPorHashtag(tagfoto3y2));
		System.out.println(antonio.getContenidoDeLosUsuariosSeguidos());
		
	}

}
