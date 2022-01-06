
public class TesteReferencias {

	public static void main(String[] args) {
		// também posso criar uma variavel de um tipo mais genérico

		Gerente g1 = new Gerente();
		g1.setSalario(2000);
		
		
		EditorVideo ev = new EditorVideo();
		ev.setSalario(1500);
		Design d = new Design();
		d.setSalario(1200);

		ControleBonificacao cb = new ControleBonificacao();
		cb.registra(g1);
		cb.registra(ev);
		cb.registra(d);

	}

}
