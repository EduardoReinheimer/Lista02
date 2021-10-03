import java.util.Scanner;

public class ex08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Digite a primeira nota: ");
		float nota1 = input.nextFloat();
		System.out.print("Digite a segunda nota: ");
		float nota2 = input.nextFloat();
		input.close();

		float media = GetMedia2Notas(nota1, nota2);

		if (IsAprovado(media))
			System.out.println("Aprovado");
		else
			System.out.println("Reprovado");

	}

	private static boolean IsAprovado(float media) {
		return media >= 7;
	}

	private static float GetMedia2Notas(float nota1, float nota2) {
		return (nota1 + nota2) / 2;
	}

}
