
public class Gerente extends Funcionario implements Autenticado{
	
	private AutenticacaoUtil autentificador;
	
	public double getBonificacao() {
		System.out.println("Chamei aqui no gerente");
		return super.getSalario();
	}

	public Gerente () {
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
