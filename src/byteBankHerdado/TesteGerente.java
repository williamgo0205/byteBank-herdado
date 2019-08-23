package byteBankHerdado;

public class TesteGerente {

	public static void main(String[] args) {
		
		Autenticavel referencia = new Cliente();
		
		Gerente g1 = new Gerente();
		
		g1.setNome("Marco");
		g1.setCpf("235.556.778-01");
		g1.setSalario(5000.0);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		
		g1.setSenha(222);
		boolean autenticou = g1.autentica(222);
		System.out.println(autenticou);
		
		System.out.println(g1.getBonificacao());

	}

}
