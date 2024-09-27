package banco;

public class ContaBancaria {
	private int idConta;
	private String agencia;
	private String numeroConta;
	private String tipo;
	private double saldo;
	private double limiteCredito;
	
	public ContaBancaria((int idConta, String agencia, String numeroConta, double saldo, )
		
	public ContaBancaria(int idConta, String agencia, String numeroConta, double saldo) {
		this.idConta = idConta;
		this.agencia = agencia;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}

	public void registraDeposito(double valor) {
		this.saldo += valor;
	}
	
	public boolean registraSaque(double valor) {	
		if (this.saldo <= valor ) {
			this.saldo -= valor;
			return true;
		}
		else {
			return false;
		}
	}
}
