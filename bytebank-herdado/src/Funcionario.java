
public abstract class Funcionario {

	private String nome;
	private String cpf;
	private double salario;
	
	
	// método sem corpo, você implementa a regra nos filhos que são obrigados a ter
	// o filho somente não puxa esse método caso ela seja tbm abstrata, que ai ela nao pode ser instanciada
	public abstract double getBonificacao();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
}
