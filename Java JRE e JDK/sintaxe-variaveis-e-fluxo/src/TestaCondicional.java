
public class TestaCondicional {

	public static void main(String[] args) {

		System.out.println("Testando Condicionais!");

		int idade = 17;
		int quantidadePessoas = 3;

		if (idade >= 18) {
			System.out.println("Voc� pode passar!");
		} else {
			if (quantidadePessoas >= 2) {
				System.out.println("Voc� n�o � maior de idade, mas pode passar, pois est� acompanhado.");
			} else {
				System.out.println("Voc� n�o pode passar!");
			}
		}

	}

}
