package byteBankHerdado;

// contrato autentic�vel
  // quem assina esse contrato, precisa implementar
     // M�todo setSenha
     // M�tod Autentica

public abstract interface Autenticavel {
	
	public abstract void setSenha(int senha);
	
	public abstract boolean autentica(int senha);
}
