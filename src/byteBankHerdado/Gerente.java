package byteBankHerdado;

// Gerente é um Funcionario - Gerente herda da classe funcionario, assina o contrato autenticável, é um autenticável
public class Gerente extends Funcionario implements Autenticavel{
	
	private AutenticacaoUtil autenticador;

	public double getBonificacao() {
		System.out.println("Chamando o método de bonificação do GERENTE");
		return getSalario();
	}	
	
	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);	
	}

	@Override
	public boolean autentica(int senha) {		
		return this.autenticador.autentica(senha);
	}		
	
}
