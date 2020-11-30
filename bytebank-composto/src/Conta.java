
public class Conta {

	 private double saldo;
	int conta;
	int agencia;
	Cliente titular;
	// criou uma conta, criou um cliente ;)
	// Cliente titular = new Cliente();

	void deposita(double valor) {
		this.saldo = this.saldo + valor;

	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;

		} else {
			return false;

		}
	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;

			destino.deposita(valor);
			return true;

		}
		return false;

	}
	
	public double getSaldo() {
		return this.saldo;
	}

}
