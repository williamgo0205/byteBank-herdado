package byteBankHerdado;

// contrato autenticável
  // quem assina esse contrato, precisa implementar
     // Método setSenha
     // Métod Autentica

public abstract interface Autenticavel {
	
	public abstract void setSenha(int senha);
	
	public abstract boolean autentica(int senha);
}
