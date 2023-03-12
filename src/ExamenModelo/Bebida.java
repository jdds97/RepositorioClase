package ExamenModelo;

public abstract class Bebida {
	public final double IVA = 0.21;
	protected int id;
	protected int cantidad;
	protected double precioBase;
	protected double precioFinal = precioBase + (precioBase * IVA);
	protected Marca marca;

	public Bebida(int id, int cantidad, double precioBase, double precioFinal, Marca marca) {
		this.id = id;
		this.cantidad = cantidad;
		this.precioBase = precioBase;
		this.precioFinal = precioFinal;
		this.marca = marca;
	}
	public double getPrecioFinalMarca(Marca marca) {
		return precioFinal;
		
	}
	public int getId() {
		return id;
	}
	public int getCantidad() {
		return cantidad;
	}
	public double getPrecioBase() {
		return precioBase;
	}
	public double getPrecioFinal() {
		return precioFinal;
	}
	public Marca getMarca() {
		return marca;
	}
}