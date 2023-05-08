package Alumnos;

import java.util.TreeMap;

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
		this.creaDatosDePrueba();
		
		System.out.println("Apartado a) Grupo con menos profesores: "+
			this.modelo.grupoMenosProfesores().getNombre());
				
		System.out.println("\nApartado b) alumnos con Formación y Orientación Laboral:");
		for(Alumno alumno:this.modelo.alumnosConAsignatura("Formación y Orientación Laboral"))
			System.out.println(alumno);
		
		System.out.println("\nApartado c) profesor que imparte más asignaturas: "+
		             this.modelo.profesorConMasAsignaturas());
		
		System.out.println("\nApartado d) todas las asignaturas: ");
		for(String asignatura:this.modelo.todasAsignaturas())
		    System.out.println(asignatura);
		
		System.out.print("\nApartado e) grupos de cada profesor: ");
		for(String prof:this.modelo.gruposDeCadaProfesor().keySet())
		{
	        System.out.print("\nProfesor: "+prof+" imparte en");
	        for(Grupo g:this.modelo.gruposDeCadaProfesor().get(prof))
	        	System.out.print(", "+g.getNombre());
		}

	}

	private void creaDatosDePrueba()
	{
		Alumno a00 = new Alumno("Juan Pablo Castellanos Robledo");
		Alumno a01 = new Alumno("Amelia Agustín Tudela");
		Alumno a02 = new Alumno("Germán Saez Vera");
		Alumno a03 = new Alumno("Espiridión Rosselló-Izaguirre");
		Alumno a04 = new Alumno("Carmelita Martorell-Bellido");
		Alumno a05 = new Alumno("Trinidad Abellán Cardona");
		Alumno a06 = new Alumno("Enrique Montaña Milla");
		Alumno a07 = new Alumno("Juan Polo Morillo");
		Alumno a08 = new Alumno("Salomón Amaya");
		Alumno a09 = new Alumno("Lalo Valenciano Padilla");
		Alumno a10 = new Alumno("Alfredo de Ramírez");
		Alumno a11 = new Alumno("Anastasio Campo Salom");
		Alumno a12 = new Alumno("Irene Roig Viña");
		Alumno a13 = new Alumno("Marina Santamaría Amo");
		Alumno a14 = new Alumno("Tania Natividad Velasco Hervia");
		Alumno a15 = new Alumno("Fabiola Ríos-Poza");
		Alumno a16 = new Alumno("Trinidad Navarro Tapia");
		Alumno a17 = new Alumno("Reinaldo Hernandez Lladó");
		Alumno a18 = new Alumno("Teófilo de Sureda");
		Alumno a19 = new Alumno("Nayara Velázquez-Medina");

		Grupo g01 = new Grupo("DAW1");
		Grupo g02 = new Grupo("DAW2");
		Grupo g03 = new Grupo("SMR1");
		Grupo g04 = new Grupo("SMR2");
		Grupo g05 = new Grupo("DAM2");

		g01.anadeAlumno(a00);
		g01.anadeAlumno(a01);
		g01.anadeAlumno(a02);
		g01.anadeAlumno(a03);
		g02.anadeAlumno(a04);
		g02.anadeAlumno(a05);
		g02.anadeAlumno(a06);
		g02.anadeAlumno(a07);
		g02.anadeAlumno(a08);
		g02.anadeAlumno(a09);
		g03.anadeAlumno(a10);
		g03.anadeAlumno(a11);
		g03.anadeAlumno(a12);
		g04.anadeAlumno(a13);
		g04.anadeAlumno(a14);
		g04.anadeAlumno(a15);
		g04.anadeAlumno(a16);
		g05.anadeAlumno(a17);
		g05.anadeAlumno(a18);
		g05.anadeAlumno(a19);

		TreeMap<String , String> m01 = new TreeMap<String,String>();
		TreeMap<String , String> m02 = new TreeMap<String,String>();
		TreeMap<String , String> m03 = new TreeMap<String,String>();
		TreeMap<String , String> m04 = new TreeMap<String,String>();
		TreeMap<String , String> m05 = new TreeMap<String,String>();

		String mdaw100 ="Sistemas informáticos";
		String mdaw101 ="Bases de Datos";
		String mdaw102 ="Programación";
		String mdaw103 ="Lenguajes de marcas";
		String mdaw104 ="Entornos de desarrollo" ;
		String mdaw105 ="Formación y Orientación Laboral";

		String mdaw201 ="Desarrollo web en entorno cliente";
		String mdaw202 ="Desarrollo web en entorno servidor";
		String mdaw203 ="Despliegue de aplicaciones web";
		String mdaw204 ="Diseño de interfaces web";
		String mdaw205 ="Empresa e iniciativa emprendedora";
		String mdaw206 ="Proyecto de desarrollo de aplicaciones web";
		String mdaw207 ="Formación en Centros de Trabajo";

		String mdam201 ="Acceso a datos";
		String mdam202 ="Desarrollo de interfaces";
		String mdam203 ="Programación multimedia y dispositivos móviles";
		String mdam204 ="Programación de servicios y procesos";
		String mdam205 ="Sistemas de gestión empresarial";
		String mdam206 ="Empresa e iniciativa emprendedora";
		String mdam207 ="Proyecto de desarrollo de aplicaciones multiplataforma";
		String mdam208 ="Formación en Centros de Trabajo";

		String msmr101 ="Aplicaciones ofimáticas";
		String msmr102 ="Montaje y mantenimiento de equipos";
		String msmr103 ="Redes locales";
		String msmr104 ="Sistemas operativos monopuesto";
		String msmr105 ="Formación y Orientación Laboral";

		String msmr201 ="Aplicaciones web";
		String msmr202 ="Empresa e iniciativa emprendedora";
		String msmr203 ="Seguridad informática";
		String msmr204 ="Servicios en red";
		String msmr205 ="Sistemas operativos en red";
		String msmr206 ="Formación en Centros de Trabajo";

		String p00 = "Zoraida Font Ramón";
		String p01 = "Ale Arco-Ripoll";
		String p02 = "Olegario Blázquez Baró";
		String p03 = "Luciana Jaén Aguado";
		String p04 = "Nicanor Paz Luque";
		String p05 = "Malena Sanabria Tello";
		String p06 = "Erasmo Ricardo Cal Guzmán";
		String p07 = "Elba Revilla Sotelo";
		String p08 = "Juanita Porta Céspedes";
		String p09 = "Macaria Martín Colom";

		m01.put(mdaw100, p00);
		m01.put(mdaw101, p01);
		m01.put(mdaw102, p02);
		m01.put(mdaw103, p00);
		m01.put(mdaw104, p04);
		m01.put(mdaw105, p01);

		m02.put(mdaw201, p02);
		m02.put(mdaw202, p04);
		m02.put(mdaw203, p08);
		m02.put(mdaw204, p09);
		m02.put(mdaw205, p00);
		m02.put(mdaw206, p04);
		m02.put(mdaw207, p02);

		m03.put(msmr101, p03);
		m03.put(msmr102, p04);
		m03.put(msmr103, p07);
		m03.put(msmr104, p07);
		m03.put(msmr105, p07);

		m04.put(msmr201, p08);
		m04.put(msmr202, p02);
		m04.put(msmr203, p00);
		m04.put(msmr204, p01);
		m04.put(msmr205, p02);
		m04.put(msmr206, p03);

		m05.put(mdam201, p02);
		m05.put(mdam202, p02);
		m05.put(mdam203, p06);
		m05.put(mdam204, p07);
		m05.put(mdam205, p08);
		m05.put(mdam206, p09);
		m05.put(mdam207, p00);
		m05.put(mdam208, p01);

		this.modelo.put(g01, m01);
		this.modelo.put(g02, m02);
		this.modelo.put(g03, m03);
		this.modelo.put(g04, m04);
		this.modelo.put(g05, m05);


	}
}
