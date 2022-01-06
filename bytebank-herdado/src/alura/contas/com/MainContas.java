package alura.contas.com;

public class MainContas {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(111, 111);
		ContaPoupanca cp = new ContaPoupanca(222, 222);
		
		cc.deposita(100);
		cp.deposita(200);
		
		cc.transfere(10, cp);
		
		System.out.println("AQUI!!");
		System.out.println("CC " + cc.getSaldo());
		System.out.println("CP " + cp.getSaldo());
	}

}
