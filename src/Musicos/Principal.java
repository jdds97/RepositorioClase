package Musicos;

import java.util.TreeSet;

public class Principal
{
	private Modelo modelo;
	
	public static void main(String[] args)
	{
		new Principal();
	}

	public Principal()
	{
		this.modelo = new Modelo();

		this.añadeDatosDePrueba();
		
		//correcto: se añade una canción a un disco existente en un grupo existente
		System.out.print("Apartado anadeCancionADiscoDeGrupo (debe salir true) sale: ");
		System.out.println(this.modelo.anadeCancionADiscoDeGrupo(
				new Grupo("4FD2"), 
				new Disco("Ten"),
				new Cancion(4.29F,"Taste the Pain")));
		
		// incorrecto: 
		// el grupo tiene ese disco pero la cancion ya estaba
		System.out.print("Apartado anadeCancionADiscoDeGrupo (debe salir false) sale: ");
		System.out.println(this.modelo.anadeCancionADiscoDeGrupo(
				new Grupo("4FD2"), 
				new Disco("Ten"),
				new Cancion(4.29F,"Taste the Pain")));
		
		// incorrecto:
		// no existe el grupo
		System.out.print("Apartado anadeCancionADiscoDeGrupo (debe salir false) sale: ");
		System.out.println(this.modelo.anadeCancionADiscoDeGrupo(
				new Grupo("xxxx"), 
				new Disco("Ten"),
				new Cancion(4.29F,"Taste the Pain")));
		
		// incorrecto:
		// el grupo no tiene ese disco
		System.out.print("Apartado anadeCancionADiscoDeGrupo (debe salir false) sale: ");
		System.out.println(this.modelo.anadeCancionADiscoDeGrupo(
				new Grupo("4FD2"), 
				new Disco("Communique"),
				new Cancion(4.29F,"Taste the Pain")));

		// músicos que participaron en canción
		System.out.println("Apartado musicosEnCancion debe salir:");
		System.out.println(this.modelo.musicosEnCancion(
				new Cancion(4.29F,"Taste the Pain")));
		
		
		// cancionesDeMusico
		System.out.print("Apartado cancionesDeMusico debe salir: ");
		System.out.println(this.modelo.cancionesDeMusico(new Musico("Brett Saunders",34)).size());
		
		// discosParticipaCadaMusico
		System.out.println("Apartado discosParticipaCadaMusico debe salir: ");
		System.out.println(this.modelo.discosParticipaCadaMusico());
		
		// listadoTitulosDiscosPorDuracion
		System.out.println("Apartado listadoTitulosDiscosPorDuracion debe salir: ");
		System.out.println(this.modelo.listadoTitulosDiscosPorDuracion());
		
		}

	private void añadeDatosDePrueba()
	{
		Grupo g00=new Grupo("Millennial");
		Grupo g01=new Grupo("Outbreak");
		Grupo g02=new Grupo("Rebel Boys");
		Grupo g03=new Grupo("Energy Revolution");
		Grupo g04=new Grupo("4FD2");
		Grupo g05=new Grupo("Crazy Girls");
		Grupo g06=new Grupo("Radio Motel");
		Grupo g07=new Grupo("Apolo 5");
		
		Cancion c00=new Cancion(3.37F,"Scar Tissue");
		Cancion c01=new Cancion(3.22F,"Higher Ground");
		Cancion c02=new Cancion(4.15F,"Otherside");
		Cancion c03=new Cancion(3.43F,"Knock Me Down");
		Cancion c04=new Cancion(3.51F,"Easily");
		Cancion c05=new Cancion(3.52F,"Fight Like A Brave");
		Cancion c06=new Cancion(3.26F,"Road Trippin");
		Cancion c07=new Cancion(4.29F,"Taste the Pain");
		Cancion c08=new Cancion(4.27F,"Under the Bridge");
		Cancion c09=new Cancion(3.59F,"Around the World");
		Cancion c10=new Cancion(4.42F,"Behind the Sun");
		Cancion c11=new Cancion(5.05F,"Warped");
		Cancion c12=new Cancion(3.07F,"Backwoods");
		Cancion c13=new Cancion(4.45F,"Give It Away");
		Cancion c14=new Cancion(3.46F,"This Velvet Glove");
		Cancion c15=new Cancion(3.36F,"Suck My Kiss");
		Cancion c16=new Cancion(2.02F,"Fire");
		Cancion c17=new Cancion(4.03F,"My friends");
		Cancion c18=new Cancion(2.34F,"Subterranean Homesick Blues");
		Cancion c19=new Cancion(4.44F,"Aeroplane");
		Cancion c20=new Cancion(3.24F,"Higher Ground");
		Cancion c21=new Cancion(5.03F,"Good Time Boys");
		Cancion c22=new Cancion(3.53F,"Fight Like a Brave");
		Cancion c23=new Cancion(3.09F,"Me and My Friends");
		Cancion c24=new Cancion(4.41F,"Behind the Sun");
		Cancion c25=new Cancion(3.39F,"True Men Do not Kill Coyotes");
		Cancion c26=new Cancion(3.44F,"Knock Me Down");
		Cancion c27=new Cancion(4.07F,"If You Want Me to Stay");
		Cancion c28=new Cancion(5.03F,"Hollywood");
		Cancion c29=new Cancion(3.02F,"Africa");
		Cancion c30=new Cancion(4.28F,"Taste the Pain");
		Cancion c31=new Cancion(1.22F,"Interview");
		Cancion c32=new Cancion(5.09F,"Suck My Kiss");
		Cancion c33=new Cancion(4.06F,"Scar Tissue");
		Cancion c34=new Cancion(5.19F,"Give it Away");
		Cancion c35=new Cancion(5.23F,"Soul to Squeeze");
		Cancion c36=new Cancion(2.54F,"I Like Dirt");
		Cancion c37=new Cancion(5.27F,"If you Have to Ask");
		Cancion c38=new Cancion(5.24F,"My Lonely Man");
		Cancion c39=new Cancion(5.20F,"Blood Sugar Sex Magic");
		Cancion c40=new Cancion(5.18F,"Parallel Universe");
		Cancion c41=new Cancion(4.34F,"Under the Bridge");
		Cancion c42=new Cancion(2.58F,"Me and my Friends");
		Cancion c43=new Cancion(7.53F,"The Power of Equality");
		Cancion c44=new Cancion(4.27F,"Around the World");
		Cancion c45=new Cancion(8.15F,"Crowd Control");
		Cancion c46=new Cancion(3.28F,"Scar Tissue");
		Cancion c47=new Cancion(4.07F,"Suck My Kiss");
		Cancion c48=new Cancion(5.53F,"If You Have to Ask");
		Cancion c49=new Cancion(4.28F,"OtherSide");
		Cancion c50=new Cancion(1.35F,"Skinny Sweaty Man");
		Cancion c51=new Cancion(1.40F,"Your Pussy is Glued to a Building on Fire");
		Cancion c52=new Cancion(4.13F,"I Could Have Lied");
		Cancion c53=new Cancion(4.10F,"Easily");
		Cancion c54=new Cancion(5.15F,"Californication");
		Cancion c55=new Cancion(2.08F,"Right on Time");
		Cancion c56=new Cancion(4.41F,"Under the Bridge");
		Cancion c57=new Cancion(3.04F,"Me And My Friends");
		Cancion c58=new Cancion(2.55F,"Encore");
		Cancion c59=new Cancion(4.38F,"Soul to Squeeze");
		Cancion c60=new Cancion(4.37F,"Power of the Equality");

		Disco d00=new Disco("The Dark Side Of The Moon");
		Disco d01=new Disco("Come away with me");
		Disco d02=new Disco("Wish You Were Here");
		Disco d03=new Disco("Unlimited Love");
		Disco d04=new Disco("Unplugged");
		Disco d05=new Disco("Nevermind");
		Disco d06=new Disco("X&Y");
		Disco d07=new Disco("Brothers in Arms");
		Disco d08=new Disco("Greatest Hits");
		Disco d09=new Disco("A rush of blood to the head");
		Disco d10=new Disco("Love Over Gold");
		Disco d11=new Disco("Ten");
		Disco d12=new Disco("Atom Heart Mother ");
		Disco d13=new Disco("Greatest Hits II");
		Disco d14=new Disco("Money For Nothing");
		Disco d15=new Disco("Hotel California");
		Disco d16=new Disco("Harvest");
		Disco d17=new Disco("Graceland");
		Disco d18=new Disco("Never More");
		Disco d19=new Disco("Moving Pictures");

	
		d00.add(c00);
		d00.add(c01);
		d00.add(c02);
		d00.add(c03);
		d00.add(c04);
		d01.add(c05);
		d01.add(c06);
		d01.add(c07);
		d01.add(c08);
		d01.add(c09);
		d02.add(c10);
		d02.add(c11);
		d02.add(c12);
		d02.add(c13);
		d02.add(c14);
		d03.add(c15);
		d03.add(c16);
		d03.add(c17);
		d04.add(c18);
		d04.add(c19);
		d04.add(c20);
		d04.add(c21);
		d04.add(c22);
		d04.add(c23);
		d05.add(c24);
		d05.add(c25);
		d05.add(c26);
		d05.add(c27);
		d06.add(c28);
		d06.add(c29);
		d06.add(c30);
		d06.add(c31);
		d06.add(c32);
		d07.add(c33);
		d07.add(c34);
		d07.add(c35);
		d07.add(c36);
		d07.add(c37);
		d08.add(c38);
		d08.add(c39);
		d08.add(c40);
		d08.add(c41);
		d08.add(c42);
		d08.add(c43);
		d09.add(c44);
		d09.add(c45);
		d09.add(c46);
		d09.add(c47);
		d10.add(c48);
		d10.add(c49);
		d10.add(c50);
		d10.add(c51);
		d10.add(c52);
		d11.add(c53);
		d11.add(c54);
		d11.add(c55);
		d11.add(c56);
		d11.add(c57);
		d12.add(c58);
		d12.add(c59);
		d12.add(c60);
		d12.add(c01);
		d12.add(c02);
		d13.add(c03);
		d13.add(c04);
		d13.add(c05);
		d14.add(c06);
		d14.add(c07);
		d14.add(c08);
		d14.add(c09);
		d14.add(c10);
		d14.add(c11);
		d15.add(c12);
		d15.add(c13);
		d15.add(c14);
		d15.add(c15);
		d16.add(c16);
		d16.add(c17);
		d16.add(c18);
		d16.add(c19);
		d16.add(c20);
		d17.add(c21);
		d17.add(c22);
		d17.add(c23);
		d17.add(c24);
		d17.add(c25);
		d18.add(c26);
		d18.add(c27);
		d18.add(c28);
		d18.add(c29);
		d18.add(c30);
		d18.add(c31);
		d19.add(c32);
		d19.add(c33);
		d19.add(c34);
		d19.add(c35);
		
		Musico m00=new Musico("Erin Cooke",27);
		Musico m01=new Musico("Danni Ellis",44);
		Musico m02=new Musico("Haiden King",36);
		Musico m03=new Musico("Brynn Johnston",25);
		Musico m04=new Musico("Taylor Collins",38);
		Musico m05=new Musico("Frankie Hart",49);
		Musico m06=new Musico("Jody Bradley",21);
		Musico m07=new Musico("Glen Pearson",33);
		Musico m08=new Musico("Noel Moss",22);
		Musico m09=new Musico("Brett Saunders",34);
		Musico m10=new Musico("Leslie Young",45);
		Musico m11=new Musico("Mason Roberts",23);
		Musico m12=new Musico("Charlie Armstrong",46);
		Musico m13=new Musico("Angel Dean",37);
		Musico m14=new Musico("Rowan Andrews",24);
		Musico m15=new Musico("Ashley Lawson",45);
		Musico m16=new Musico("Terry Hamilton",38);
		Musico m17=new Musico("Kai Palmer",26);
		Musico m18=new Musico("Noel Burton",33);
		Musico m19=new Musico("Charlie Lewis",42);
		Musico m20=new Musico("Cameron Duncan",21);
		Musico m21=new Musico("Charlie Perry",35);
		Musico m22=new Musico("Jaden Spencer",27);
		Musico m23=new Musico("Gabby Brooks",25);
		Musico m24=new Musico("Jaden Jordan",34);
		Musico m25=new Musico("Rudy Scott",43);
		Musico m26=new Musico("Gabby Williamson",32);
		Musico m27=new Musico("Justice Hill",28);
		Musico m28=new Musico("Silver Thomas",22);
		Musico m29=new Musico("Justice Young",31);

		g00.anadeMusico(m07);
		g00.anadeMusico(m17);
		g00.anadeMusico(m24);
		g00.anadeMusico(m22);
		g00.anadeMusico(m29);
		g00.anadeMusico(m25);
		g00.anadeMusico(m08);
		g00.anadeMusico(m04);
		g00.anadeMusico(m12);
		g00.anadeMusico(m10);
		g01.anadeMusico(m04);
		g01.anadeMusico(m18);
		g01.anadeMusico(m20);
		g01.anadeMusico(m06);
		g01.anadeMusico(m06);
		g01.anadeMusico(m27);
		g01.anadeMusico(m03);
		g01.anadeMusico(m05);
		g01.anadeMusico(m00);
		g01.anadeMusico(m02);
		g02.anadeMusico(m09);
		g02.anadeMusico(m17);
		g02.anadeMusico(m08);
		g02.anadeMusico(m00);
		g02.anadeMusico(m16);
		g02.anadeMusico(m24);
		g02.anadeMusico(m06);
		g02.anadeMusico(m21);
		g02.anadeMusico(m28);
		g02.anadeMusico(m07);
		g03.anadeMusico(m01);
		g03.anadeMusico(m01);
		g03.anadeMusico(m16);
		g03.anadeMusico(m22);
		g03.anadeMusico(m15);
		g03.anadeMusico(m00);
		g03.anadeMusico(m08);
		g03.anadeMusico(m06);
		g03.anadeMusico(m20);
		g03.anadeMusico(m08);
		g04.anadeMusico(m05);
		g04.anadeMusico(m12);
		g04.anadeMusico(m18);
		g04.anadeMusico(m13);
		g04.anadeMusico(m29);
		g04.anadeMusico(m18);
		g04.anadeMusico(m05);
		g04.anadeMusico(m07);
		g04.anadeMusico(m05);
		g04.anadeMusico(m20);
		g05.anadeMusico(m09);
		g05.anadeMusico(m23);
		g05.anadeMusico(m06);
		g05.anadeMusico(m11);
		g05.anadeMusico(m03);
		g05.anadeMusico(m29);
		g05.anadeMusico(m17);
		g05.anadeMusico(m05);
		g05.anadeMusico(m16);
		g05.anadeMusico(m13);
		g06.anadeMusico(m23);
		g06.anadeMusico(m09);
		g06.anadeMusico(m21);
		g06.anadeMusico(m26);
		g06.anadeMusico(m22);
		g06.anadeMusico(m13);
		g06.anadeMusico(m13);
		g06.anadeMusico(m29);
		g06.anadeMusico(m09);
		g06.anadeMusico(m02);
		g07.anadeMusico(m18);
		g07.anadeMusico(m15);
		g07.anadeMusico(m04);
		g07.anadeMusico(m24);
		g07.anadeMusico(m19);
		g07.anadeMusico(m07);
		g07.anadeMusico(m14);
		g07.anadeMusico(m05);
		g07.anadeMusico(m25);
		g07.anadeMusico(m10);

		
		this.modelo.put(g00, new TreeSet<Disco>());
		this.modelo.put(g01, new TreeSet<Disco>());
		this.modelo.put(g02, new TreeSet<Disco>());
		this.modelo.put(g03, new TreeSet<Disco>());
		this.modelo.put(g04, new TreeSet<Disco>());
		this.modelo.put(g05, new TreeSet<Disco>());
		this.modelo.put(g06, new TreeSet<Disco>());
		this.modelo.put(g07, new TreeSet<Disco>());

		this.modelo.get(g00).add(d00);
		this.modelo.get(g01).add(d01);
		this.modelo.get(g02).add(d02);
		this.modelo.get(g03).add(d03);
		this.modelo.get(g04).add(d04);
		this.modelo.get(g05).add(d05);
		this.modelo.get(g06).add(d06);
		this.modelo.get(g07).add(d07);
		this.modelo.get(g01).add(d08);
		this.modelo.get(g02).add(d09);
		this.modelo.get(g03).add(d10);
		this.modelo.get(g04).add(d11);
		this.modelo.get(g05).add(d12);
		this.modelo.get(g01).add(d13);
		this.modelo.get(g02).add(d14);
		this.modelo.get(g03).add(d15);
		this.modelo.get(g02).add(d16);
		this.modelo.get(g03).add(d17);
		this.modelo.get(g04).add(d18);
		this.modelo.get(g05).add(d19);	
	}
}
