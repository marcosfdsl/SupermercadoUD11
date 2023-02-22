package tareaud9;

public class CuentaCorriente {

	private String saldo;

	public CuentaCorriente() {
		this.saldo = "0";
	}

	public String getSaldo() {
		return saldo;
	}

	public void imposicion(int x) {
		int saldoInt = Integer.parseInt(saldo);
		saldoInt += x;
		saldo = String.valueOf(saldoInt);
	}

	public void reintegro(int x) {
		int saldoInt = Integer.parseInt(saldo);
		saldoInt -= x;
		saldo = String.valueOf(saldoInt);
	}

}
