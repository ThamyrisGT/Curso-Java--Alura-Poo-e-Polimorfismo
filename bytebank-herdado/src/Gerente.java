
public class Gerente extends FuncionarioAutenticado{
	
	public double getBonificacao() {
		System.out.println("Chamei aqui no gerente");
		return super.getSalario();
	}
	
}
