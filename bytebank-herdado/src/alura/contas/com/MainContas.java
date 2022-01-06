package alura.contas.com;

public class MainContas {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(111, 111);
//		ContaPoupanca cp = new ContaPoupanca(222, 222);
//		
		cc.deposita(100);
		
		SeguroDeVida sv = new SeguroDeVida();
		
		CalculadorImpostos ci = new CalculadorImpostos();
		ci.registra(sv);
		ci.registra(cc);
		
		System.out.println(ci.getTotalImposto());
		
		
//		cp.deposita(200);
//		
//		cc.transfere(10, cp);
//		
//		System.out.println("AQUI!!");
//		System.out.println("CC " + cc.getSaldo());
//		System.out.println("CP " + cp.getSaldo());
	}

}
