package byteBankHerdado;

// Designer é um funcionario
public class Designer extends Funcionario{

	public double getBonificacao() {
		System.out.println("Chamando o método de bonificação do DESIGNER");
		return 200.0;
	} 
	
}
