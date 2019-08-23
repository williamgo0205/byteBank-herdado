package byteBankHerdado;

public class TesteFuncionario {
	
	public static void main(String[] args) {
		
		Gerente nico = new Gerente();
		
		nico.setNome("Nico Steppat");
		nico.setCpf("123123123-57");
		nico.setSalario(2500.00);
		
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
		
		//nico.salario = 300.0;
		
	}
}
