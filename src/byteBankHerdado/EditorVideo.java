package byteBankHerdado;

// Gerente � um funcionario
public class EditorVideo extends Funcionario{

	public double getBonificacao() {
		System.out.println("Chamando o m�todo de bonifica��o do EDITOR DE V�DEO");
		return 150;
	} 
}
