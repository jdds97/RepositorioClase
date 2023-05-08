package CasetaFeria;
public class Consumici�n
{
	private Art�culo art�culo;
	private int cantidad;

	public Consumici�n(Art�culo art�culo, int cantidad)
	{
		this.art�culo = art�culo;
		this.cantidad = cantidad;
	}

	public Art�culo getArt�culo() {
		return art�culo;
	}

	public void setArt�culo(Art�culo art�culo) {
		this.art�culo = art�culo;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "    " + art�culo + "\t" + cantidad ;
	}




}
