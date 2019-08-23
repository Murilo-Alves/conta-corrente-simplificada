
public class ContaCorrenteSimplificada {

	String nomeDoCorrentista;
	String agencia;
	String nroConta;
	double saldo;
	boolean especial;
	PessoaFisica[] pessoas = new PessoaFisica[2];
	int qtxMax = 2;
	int qtAtual = 0;

	double sacar(double valor) {

		if (valor > this.saldo && this.especial == false) {
			System.out.println("Saldo insuficiente");

		} else {
			if (valor > this.saldo && this.especial == true) {
				System.out.println("Seu saldo e insificiente mas vc tem mais 5000 money para gastar");
				this.saldo = this.saldo + 5000;
			}

			this.saldo = this.saldo - valor;

		}
		return this.saldo;
	}

	double depositar(double valor) {
		this.saldo = this.saldo + valor;
		return this.saldo;
	}

	void exibeSaldo() {
		System.out.println("Saldo: " + this.saldo);
	}

	void adicionarPessoa(PessoaFisica p) {
		if (qtAtual < qtxMax) {
			this.pessoas[qtAtual] = p;
			qtAtual++;

		}

	}

	void imprimirDadosCorrentista() {

		for (int i = 0; i < qtxMax; i++) {

			if (this.pessoas[0] != null) {
				System.out.println("==============Correntista ============");
				System.out.println("NOme :" + this.pessoas[i].nome);
				System.out.println("CPF :" + this.pessoas[i].cpf);
				System.out.println("RG :" + this.pessoas[i].rg);
				System.out.println("OrgaoExpedidor :" + this.pessoas[i].orgaoExpedidor);
				System.out.println("DataNascimento :" + this.pessoas[i].dataNascimento);
				System.out.println("Profissao :" + this.pessoas[i].profissao);
				System.out.println("=======================================");
			}

		}

	}

}
