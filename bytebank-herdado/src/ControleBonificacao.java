
public class ControleBonificacao {
	private double soma;

	public void registra(Funcionario f) {
		double bonificacao = f.getBonificacao();
		this.soma = bonificacao + this.soma;
	}

	public double getSoma() {
		return soma;
	}

}