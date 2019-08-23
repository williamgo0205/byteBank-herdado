package byteBankHerdado;

public class ControleBonificacao {
	
	double soma = 0;
	
	public void registra(Funcionario f) {
		double boni = f.getBonificacao();
		this.soma = this.soma + boni;
	}	
	
	public double getSoma() {
		return soma;
	}	

}
