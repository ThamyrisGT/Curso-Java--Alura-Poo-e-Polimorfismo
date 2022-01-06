package alura.contas.com;

public class CalculadorImpostos {
	
	private double totalImposto;
	
	public void registra (Tributavel t) {
		double valor = t.getValorImposto();
		this.totalImposto+= valor;
	}
	
	public double getTotalImposto() {
		return totalImposto;
	}
}
