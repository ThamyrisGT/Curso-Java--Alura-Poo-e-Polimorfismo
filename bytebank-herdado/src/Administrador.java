
public class Administrador extends Funcionario implements Autenticado{

	private AutenticacaoUtil autentificador;
	
	@Override
	public double getBonificacao() {
		return 50;
	}

	public Administrador () {
		this.autentificador = new AutenticacaoUtil();
	}
	
	@Override
	public void setSenha(int senha) {
		this.autentificador.setSenha(senha);
		
	}

	@Override
	public boolean autentica(int senha) {
		return this.autentificador.autentica(senha);
	}


}
