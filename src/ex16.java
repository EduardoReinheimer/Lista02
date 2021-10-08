import java.util.Scanner;

public class ex16 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Digite a primeira nota: ");
		float nota1 = input.nextFloat();
		System.out.print("Digite a segunda nota: ");
		float nota2 = input.nextFloat();
		input.close();

		float media = GetMedia2Notas(nota1, nota2);

		System.out.println(StatusAluno(media));

	}

	private static String StatusAluno(float media) {
		if(media < 3) {
			return "Reprovado";
		} else if (media >= 3 && media < 7) {
			return "Em Exame";
		} else if (media >= 7 && media <= 10) {
			return "Aprovado";
		}
		return "Média inválida";
	}

	private static float GetMedia2Notas(float nota1, float nota2) {
		return (nota1 + nota2) / 2;
	}

}
