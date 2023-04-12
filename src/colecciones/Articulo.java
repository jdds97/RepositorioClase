package colecciones;

import java.util.Objects;

public class Articulo {
	private int codigo;
	private String descripcion;
	private double precioVenta;
	private int stock;

	/**
	 * @param codigo
	 * @param descripcion
	 * @param precioVenta2
	 */
	public Articulo(int codigo, String descripcion, double precioVenta) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precioVenta = precioVenta;
	}
	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @return the precioVenta
	 */
	public double getPrecioVenta() {
		return precioVenta;
	}

	/**
	 * @param precioVenta the precioVenta to set
	 */
	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}

	/**
	 * @return the stock
	 */
	public int getStock() {
		return stock;
	}

	/**
	 * @param stock the stock to set
	 */
	public void setStock(int stock) {
		this.stock = stock;
	}

	public void añadirStock() {
		this.stock++;
	}

	public void bajadaStock() {
		this.stock--;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Articulo other = (Articulo) obj;
		return Objects.equals(codigo, other.codigo);
	}

	@Override
	public String toString() {
		return "Articulo [codigo=" + codigo + ", " + (descripcion != null ? "descripcion=" + descripcion + ", " : "")
				+ "precioVenta=" + precioVenta + ", stock=" + stock + "]";
	}
	
}
