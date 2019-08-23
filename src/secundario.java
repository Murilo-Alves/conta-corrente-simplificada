
public class secundario {

	public static void main(String[] args) {
		ContaCorrenteSimplificada c1 = new ContaCorrenteSimplificada();

		c1.agencia = "123";
		c1.nroConta = "1115-2";
		c1.nomeDoCorrentista = "Thiago Magno";
		c1.saldo = -2000;
		c1.especial = true;

		
		PessoaFisica pessoa = new PessoaFisica();
		pessoa.nome = "Joao da Silva Sauro";
		pessoa.dataNascimento = "29/02/1996";
		pessoa.cpf = "85732-22";
		pessoa.profissao = "Traficante";
		pessoa.orgaoExpedidor = "SSP/GO";

		ContaCorrenteSimplificada c3 = new ContaCorrenteSimplificada();
		c3.agencia = "123";
		c3.nomeDoCorrentista = "";
		c3.nroConta = "22-3";
		c3.saldo = 50000.00;
		c3.especial = false;
		c3.adicionarPessoa(pessoa);
		c3.imprimirDadosCorrentista();

	}

}
