import java.util.Scanner;

public class ex17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		float nota1 = -1;
		float nota2 = -1;

		do {
			System.out.print("Digite a primeira nota: ");
			nota1 = input.nextFloat();

		} while (nota1 > 10 || nota1 < 0);

		do {
			System.out.print("Digite a segunda nota: ");
			nota2 = input.nextFloat();
		} while (nota2 > 10 || nota2 < 0);

		input.close();
		
		float media = (nota1 + nota2) / 2;
		
		char gradeAproveitamento = GetAproveitamento(media);
		
		System.out.println(String.format("Média: %.2f", media));
		System.out.println("Grade de aproveitamento: " + gradeAproveitamento);

	}

	private static char GetAproveitamento(float media) {
		if(media <= 10 && media >=9) {
			return 'A';
		} else if (media < 9 && media >= 7.5f) {
			return 'B';
		} else if (media < 7.5f && media >= 6) {
			return 'C';
		} else if (media < 6 && media >= 4) {
			return 'D';
		}
		return 'E'; 
	}

}
