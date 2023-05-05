package Taller.interfaces;

public abstract class Vehiculo {

			/**
			 * @return the matricula
			 */
			public String getMatricula();
			

			/**
			 * @param matricula the matricula to set
			 */
			public void setMatricula(String matricula);

			/**
			 * @return the marca
			 */
			public String getMarca();
			

			/**
			 * @param marca the marca to set
			 */
			public void setMarca(String marca);
			
			/**
			 * @return the color
			 */
			public String getColor();
			
			/**
			 * @param color the color to set
			 */
			public void setColor(String color);
			
			public void setTieneSidecar(Boolean tieneSidecar);
			
			public Boolean getTieneSidecar();
}	

