
public class TestaMetodo {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.saldo = 100;
		conta.deposita(50);
		System.out.println(conta.saldo);

		boolean conseguiuRetirar = conta.saca(50);
		System.out.println(conta.saldo);
		System.out.println(conseguiuRetirar);

		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);

		if (contaDaMarcela.transfere(3000, conta)) {
			System.out.println("Transferencia com sucesso !");
		} else {
			System.out.println("Saldo insuficiente");
		}
		System.out.println(contaDaMarcela.saldo);

		System.out.println(conta.saldo);
		
		conta.titular="Paulo Silveira";
		System.out.println(conta.titular);
	}
}
