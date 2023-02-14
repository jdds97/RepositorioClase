package poo_modelo;

public class PersonaVideoclub extends Cliente  {
	
		  private String nombre;
		  private int edad;
		  private String direccion;
		  private String telefono;
		  
		
		  public PersonaVideoclub(String nombre, int edad, String direccion, String telefono, int idCliente) {
			super(nombre, edad, direccion, telefono, idCliente);
		
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


