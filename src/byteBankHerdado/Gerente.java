package byteBankHerdado;

// Gerente � um Funcionario - Gerente herda da classe funcionario, assina o contrato autentic�vel, � um autentic�vel
public class Gerente extends Funcionario implements Autenticavel{
	
	private AutenticacaoUtil autenticador;

	public double getBonificacao() {
		System.out.println("Chamando o m�todo de bonifica��o do GERENTE");
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
