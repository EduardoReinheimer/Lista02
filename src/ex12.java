import java.util.Scanner;

public class ex12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Digite o salário do colaborador: R$");
		float salarioSemReajuste = input.nextFloat();

		input.close();

		int percentualReajuste = GetPercentualReajuste(salarioSemReajuste);

		float valorReajuste = GetReajusteSalario(salarioSemReajuste, percentualReajuste);

		System.out.println(String.format("Salário sem reajuste: R$%.2f", salarioSemReajuste));
		System.out.println(String.format("Percentual de aumento: %s%c", percentualReajuste, '%'));
		System.out.println(String.format("Valor do reajuste: R$%.2f", valorReajuste));
		System.out.println(String.format("Novo salário: R$%.2f", salarioSemReajuste + valorReajuste));
	}

	private static float GetReajusteSalario(float salarioSemReajuste, int percentualReajuste) {
		return (salarioSemReajuste / 100) * percentualReajuste;
	}

	private static int GetPercentualReajuste(float salarioSemReajuste) {
		if (salarioSemReajuste < 280)
			return 20;
		else if (salarioSemReajuste >= 280 && salarioSemReajuste < 700)
			return 15;
		else if (salarioSemReajuste >= 700 && salarioSemReajuste < 1500)
			return 10;
		else if (salarioSemReajuste >= 1500)
			return 5;
		else
			return -1;
	}

}
