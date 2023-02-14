package poo_modelo;

public class PersonaVideoclub   {
	
		  private String nombre;
		  private int edad;
		  private String direccion;
		  private String telefono;
		  
		
		  

		/**
		 * @param nombre
		 * @param edad
		 * @param direccion
		 * @param telefono
		 */
		public PersonaVideoclub(String nombre, int edad, String direccion, String telefono) {
			
			this.nombre = nombre;
			this.edad = edad;
			this.direccion = direccion;
			this.telefono = telefono;
		}

		/**
		 * @param nombre the nombre to set
		 */
		protected void setNombre(String nombre) {
			this.nombre = nombre;
		}

		/**
		 * @param edad the edad to set
		 */
		protected void setEdad(int edad) {
			this.edad = edad;
		}

		/**
		 * @param direccion the direccion to set
		 */
		protected void setDireccion(String direccion) {
			this.direccion = direccion;
		}

		/**
		 * @param telefono the telefono to set
		 */
		protected void setTelefono(String telefono) {
			this.telefono = telefono;
		}

		public String getNombre() {
		    return nombre;
		  }
		  
		  public int getEdad() {
		    return edad;
		  }
		  
		  public String getDireccion() {
		    return direccion;
		  }
		  
		  public String getTelefono() {
		    return telefono;
		  }
		}


