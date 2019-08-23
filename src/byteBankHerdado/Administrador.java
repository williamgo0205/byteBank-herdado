package byteBankHerdado;

//Administrador � um Funcionario - Administrador herda da classe funcionario, assina o contrato autentic�vel, � um autentic�vel
public class Administrador extends Funcionario implements Autenticavel{

	private AutenticacaoUtil autenticador;

	public double getBonificacao() {
		return 50;
	}	
	
	public Administrador() {
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
