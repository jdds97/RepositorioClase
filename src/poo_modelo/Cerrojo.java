package poo_modelo;

public class Cerrojo {
	private  String [] clave = {null,null,null};

	public Cerrojo() {
	}

	public boolean cambiarCombinacion(String[] claveActual, String[] claveCambiar) {

		boolean cambiarCombinacion = false;
		if (compararArray(claveActual, clave) == true) {
			cambiarCombinacion = true;
			clave = claveCambiar;
		} else {
			cambiarCombinacion = false;
		}
		return cambiarCombinacion;

	}

	public boolean compararArray(String[] claveActual, String[] clave2) {
		boolean compararArray = false;
		
		String claveString = "";
		String claveString2 = "";
		for (int i = 0; i < claveActual.length && i < clave2.length; i++) {
			  claveString+=claveActual[i].toString();
			 claveString+=clave2[i].toString();
			}
			if (claveString == claveString2) {
				compararArray = true;
			}

			else {
				compararArray = false;
			}
			return compararArray;
		}

		
	

	public boolean abrirCerrojo(String[] abrir) {
		boolean abrirCerrojo = false;

		if (abrir == clave) {
			abrirCerrojo = true;

		} else {
			abrirCerrojo = false;
		}
		return abrirCerrojo;

	}
}
