import java.util.Scanner;

public class ex13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Digite o valor de sua hora: ");
		float valorHora = input.nextFloat();
		System.out.print("Digite quantas horas sao trabalhadas por mês: ");
		int horasTrabalhadas = input.nextInt();
		input.close();

		float salarioBruto = GetSalarioBruto(valorHora, horasTrabalhadas);
		int percentualImpostoDeRenda = GetImpostoDeRenda(salarioBruto);
		float impostoDeRenda = GetValuePercentual(salarioBruto, percentualImpostoDeRenda);
		float inss = GetValuePercentual(salarioBruto, 10);
		float fgts = GetValuePercentual(salarioBruto, 11);

		float salarioLiquido = salarioBruto - impostoDeRenda - inss;

		System.out.println("===== Folha de pagamento =====");
		System.out.println(String.format("Salário Bruto: R$%.2f", salarioBruto));
		System.out.println(String.format("IR (%s%c): R$%.2f", percentualImpostoDeRenda, '%', impostoDeRenda));
		System.out.println(String.format("INSS (5%c): R$%.2f", '%', inss));
		System.out.println(String.format("FGTS (11%c): R$%.2f", '%', fgts));
		System.out.println(String.format("\nSalário Líquido: R$%.2f", salarioLiquido));
		

	}

	private static int GetImpostoDeRenda(float salarioBruto) {
		if (salarioBruto < 900)
			return 0;
		else if (salarioBruto >= 900 && salarioBruto < 1500)
			return 5;
		else if (salarioBruto >= 1500 && salarioBruto < 2500)
			return 10;
		return 20;
	}

	private static float GetValuePercentual(float valor, int percentual) {
		return (valor / 100) * percentual;
	}

	private static float GetSalarioBruto(float valorHora, int horasTrabalhadas) {
		return valorHora * horasTrabalhadas;
	}

}
