
public class MainSistemaInterno {

	public static void main(String[] args) {
		Gerente g = new Gerente();
		g.setSenha(222);
		
		Administrador adm = new Administrador();
		adm.setSenha(333);
		
		Cliente c = new Cliente();
		c.setSenha(234);
		SistemaInterno si = new SistemaInterno();
		si.autentica(g);
		si.autentica(adm);
		si.autentica(c);
		

	}

}
