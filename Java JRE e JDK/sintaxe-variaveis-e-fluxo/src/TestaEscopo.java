
public class TestaEscopo {

	public static void main(String[] args) {

		System.out.println("Testando Condicionais!");

		int idade = 17;
		int quantidadePessoas = 3;
		//boolean acompanhado = quantidadePessoas >= 2;

		boolean acompanhado;
		
		if (quantidadePessoas >= 2) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}

		if (idade >= 18 && acompanhado) {
			System.out.println("Seja bem-vindo!");
		} else {
			System.out.println("Voc� n�o pode passar!");
		}

	}

}
