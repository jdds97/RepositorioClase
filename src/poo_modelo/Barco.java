package poo_modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public abstract  class Barco {
        protected String matricula;
        protected int eslora;
        protected LocalDate fechaFabricacion;
        protected int potenciaCV;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		protected final int VALOR_FIJO=800;
	
        
        public Barco(String matricula, int eslora, String fechaFabricacion,int potenciaCV) {
            this.matricula = matricula;
            this.eslora = eslora;
            this.fechaFabricacion = LocalDate.parse(fechaFabricacion, formatter);
            this.potenciaCV = potenciaCV;
        }

		/**
		 * @return the matricula
		 */
		public String getMatricula() {
			return matricula;
		}

		/**
		 * @param matricula the matricula to set
		 */
		public void setMatricula(String matricula) {
			this.matricula = matricula;
		}

		/**
		 * @return the eslora
		 */
		public int getEslora() {
			return eslora;
		}

		/**
		 * @param eslora the eslora to set
		 */
		public void setEslora(int eslora) {
			this.eslora = eslora;
		}

		/**
		 * @return the fechaFabricacion
		 */
		public LocalDate getFechaFabricacion() {
			return fechaFabricacion;
		}

		/**
		 * @param fechaFabricacion the fechaFabricacion to set
		 */
		public void setFechaFabricacion(LocalDate fechaFabricacion) {
			this.fechaFabricacion = fechaFabricacion;
		}

		/**
		 * @return the potenciaCV
		 */
		public int getPotenciaCV() {
			return potenciaCV;
		}

		/**
		 * @param potenciaCV the potenciaCV to set
		 */
		public void setPotenciaCV(int potenciaCV) {
			this.potenciaCV = potenciaCV;
		}

		/**
		 * @return the formatter
		 */
		public DateTimeFormatter getFormatter() {
			return formatter;
		}

		/**
		 * @param formatter the formatter to set
		 */
		public void setFormatter(DateTimeFormatter formatter) {
			this.formatter = formatter;
		}

		/**
		 * @return the vALOR_FIJO
		 */
		public int getVALOR_FIJO() {
			return VALOR_FIJO;
		}
    
		public int precioAlquilerBarco() {
			return this.eslora*this.VALOR_FIJO+funcionEspecifica();
		}

		protected abstract int funcionEspecifica();

        

}
