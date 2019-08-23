
public class Principal {
	public static void main(String[] args) {
		ContaCorrenteSimplificada c1 = new ContaCorrenteSimplificada();

		c1.agencia = "123";
		c1.nroConta = "789-2";
		c1.nomeDoCorrentista = "Kamila";
		c1.saldo = 10.00;
		c1.especial = true;

		double saldoDaKamila;
		saldoDaKamila = c1.sacar(1000.0);
		System.out.println("SALDO DA KAMILA pela VARIÁVEL: " + saldoDaKamila);

		ContaCorrenteSimplificada c2 = new ContaCorrenteSimplificada();
		c2.nomeDoCorrentista = "Victor";
		c2.nroConta = "556-8";
		c2.saldo = 350000.00;
		c2.especial = true;

		double saldoDoVictor;
		saldoDoVictor = c2.depositar(250);
		System.out.println("SALDO DO VICTOR pela VARIÁVEL: " + saldoDoVictor);
		c1.exibeSaldo();
		c2.exibeSaldo();

	}
}
