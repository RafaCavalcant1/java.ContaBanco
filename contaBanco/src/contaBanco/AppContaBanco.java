package contaBanco;

public class AppContaBanco {

	public static void main(String[] args) {
		
		ContaBanco conta = new ContaBanco(1,'C', "RAFA");
		conta.abrirConta();
		conta.getSaldo();
		conta.depositar(200);
		conta.sacar(50);
		conta.fecharConta();
		conta.sacar(200);
		
		System.out.println(conta.getSaldo());
		System.out.println(conta.fecharConta());
	}

}
