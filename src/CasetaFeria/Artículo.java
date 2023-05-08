package CasetaFeria;
public class Art�culo implements Comparable<Art�culo>
{
	private String denominaci�n;
	private String tama�o;
	
	public Art�culo(String denominaci�n, String tama�o) 
	{
		super();
		this.denominaci�n = denominaci�n;
		this.tama�o = tama�o;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((denominaci�n == null) ? 0 : denominaci�n.hashCode());
		result = prime * result + ((tama�o == null) ? 0 : tama�o.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Art�culo other = (Art�culo) obj;
		if (denominaci�n == null) {
			if (other.denominaci�n != null)
				return false;
		} else if (!denominaci�n.equals(other.denominaci�n))
			return false;
		if (tama�o == null) {
			if (other.tama�o != null)
				return false;
		} else if (!tama�o.equals(other.tama�o))
			return false;
		return true;
	}

public int compareTo(Art�culo otro)
{
	int res;
	
	res = this.denominaci�n.compareTo(otro.denominaci�n);
	if(res == 0)
		res = this.tama�o.compareTo(otro.tama�o);
	return res;
}

public String toString()
{
	return this.denominaci�n+" "+this.tama�o;
}

public String getDenominaci�n() {
	return denominaci�n;
}

public void setDenominaci�n(String denominaci�n) {
	this.denominaci�n = denominaci�n;
}

public String getTama�o() {
	return tama�o;
}

public void setTama�o(String tama�o) {
	this.tama�o = tama�o;
}

}
