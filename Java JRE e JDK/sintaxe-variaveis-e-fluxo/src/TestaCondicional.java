
public class TestaCondicional {

	public static void main(String[] args) {

		System.out.println("Testando Condicionais!");

		int idade = 17;
		int quantidadePessoas = 3;

		if (idade >= 18) {
			System.out.println("Você pode passar!");
		} else {
			if (quantidadePessoas >= 2) {
				System.out.println("Você não é maior de idade, mas pode passar, pois está acompanhado.");
			} else {
				System.out.println("Você não pode passar!");
			}
		}

	}

}
