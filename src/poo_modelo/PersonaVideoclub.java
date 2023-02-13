package poo_modelo;

public class PersonaVideoclub {
	
		  private String nombre;
		  private int edad;
		  private String direccion;
		  private String telefono;
		  
		  public PersonaVideoclub(String nombre, int edad, String direccion, String telefono) {
		    this.nombre = nombre;
		    this.edad = edad;
		    this.direccion = direccion;
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


