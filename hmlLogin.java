

public class hmlLogin {
	private DSL dsl;
	
	public void preecheEmail(String email) throws InterruptedException{
		dsl.escreveId("plat-login-email",email);
	}
	public void preencheSenha(String senha) {
		dsl.escreveId("plat-login-senha",senha);
	}
	
	public void entrar () throws InterruptedException {
		dsl.clicId("plat-login-botao-entrar");
	}
}
