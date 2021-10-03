import java.text.DecimalFormat;
import java.util.Scanner;

public class ex09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Digite a altura: ");
		float altura = input.nextFloat();
		System.out.print("Digite o peso: ");
		float peso = input.nextFloat();

		char sexo;
		do {
			System.out.println("M - Masculino\nF - Feminino");
			System.out.print("Digite o caracter correspondente ao Sexo: ");
			sexo = input.next().charAt(0);
		} while (sexo != 'F' && sexo != 'M');

		input.close();

		float pesoIdeal = GetPesoIdeal(altura, peso, sexo);

		System.out.println(String.format("Altura: %.2fM\nPeso: %.2fKg\nSexo: %s", altura, peso, sexo));
		System.out.println(String.format("Peso Ideal: %.2fKg", pesoIdeal));
		System.out.println(String.format("%s peso ideal", GetMessagePesoIdeal(peso, pesoIdeal)));

	}

	private static String GetMessagePesoIdeal(float peso, float pesoIdeal) {
		if(peso > pesoIdeal)
			return "Acima do";
		else if (peso < pesoIdeal)
			return "Abaixo do";
		return "No";
	}

	private static float GetPesoIdeal(float altura, float peso, char sexo) {
		DecimalFormat format = new DecimalFormat("#.00");
		if (sexo == 'F')
			return Float.valueOf(format.format((62.1f * altura) - 44.7f));
		else if (sexo == 'M')
			return Float.valueOf(format.format((72.7f * altura) - 58));
		throw new UnsupportedOperationException();
	}

}
