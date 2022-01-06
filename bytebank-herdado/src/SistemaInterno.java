
public class SistemaInterno {
	private int senha =222;

	public void autentica(Autenticado fa) {
		boolean autenticado = fa.autentica(senha);
		if(autenticado) {
			System.out.println("tudo ok");
		}else {
			System.out.println("senha inválida");
		}
	}
}
