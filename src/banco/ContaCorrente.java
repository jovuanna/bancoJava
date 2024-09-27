package banco;

public class ContaCorrente {

	public static void main(String[] args) {
		ContaBancaria conta1;
		conta1 = new ContaBancaria();
		
		conta1.idConta = ;
		}
	
	public static void status(ContaBancaria conta1) {
		System.out.println("ID da conta: " + conta1.idConta);
		System.out.println("Agencia da conta: " + conta1.agencia);
		System.out.println("Numero da conta: " + conta1.numeroConta);
		System.out.println("Tipo da conta: " + conta1.tipo);
		System.out.println("Saldo da conta: " + conta1.saldo);
		System.out.println("Limite de crédito: " + conta1.limiteCredito);
	}

}
