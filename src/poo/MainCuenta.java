package poo;

public class MainCuenta {
	
	public static void main(String[] args) {
		Cuenta jesus=new Cuenta( "74", 0.15,1123456789, 500);
		Cuenta alberto=new Cuenta("74", 0.15,1123456789, 0);
		jesus.hacerTransferenciaA(alberto, 400);
		
		System.out.println(jesus.getSaldo());
	}

	

}
