
public class Gerente extends Funcionario implements Autenticado{
	
	private int senha;
	
	public double getBonificacao() {
		System.out.println("Chamei aqui no gerente");
		return super.getSalario();
	}

	@Override
	public void setSenha(int senha) {
		this.senha = senha;
		
	}

	@Override
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
	
}
