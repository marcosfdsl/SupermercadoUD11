package tareaud9;

public class CuentaCorrienteMain {

	public static void main(String[] args) {

		CuentaCorriente cc = new CuentaCorriente();
		cc.imposicion(200);
		cc.reintegro(300);
		System.out.println(cc.getSaldo());

	}

}
