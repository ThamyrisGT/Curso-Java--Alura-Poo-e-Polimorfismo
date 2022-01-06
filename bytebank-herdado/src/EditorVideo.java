
public class EditorVideo extends Funcionario{

	@Override
	public double getBonificacao() {
		System.out.println("entrei aqui no editor");
		return super.getBonificacao() + 100;
	}
	

	
	
	
}
