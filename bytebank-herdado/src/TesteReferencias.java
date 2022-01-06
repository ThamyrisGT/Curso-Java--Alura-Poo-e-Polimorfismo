
public class TesteReferencias {

	public static void main(String[] args) {
		// também posso criar uma variavel de um tipo mais genérico

		Gerente g1 = new Gerente();
		g1.setSalario(2000);
		
		Funcionario f1 = new Funcionario();
		f1.setSalario(1000);
		
		EditorVideo ev = new EditorVideo();
		ev.setSalario(1500);

		ControleBonificacao cb = new ControleBonificacao();
		cb.registra(g1);
		cb.registra(f1);
		cb.registra(ev);

	}

}
