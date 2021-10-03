import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Digite uma letra: ");
		char letra = input.next().charAt(0);
		input.close();

		if (IsVogal(letra))
			System.out.println("É Vogal");
		else
			System.out.println("Não é Vogal");
	}

	private static boolean IsVogal(char letra) {
		char letraToUpper = Character.toUpperCase(letra);
		return 		letraToUpper == 'A' 
				|| 	letraToUpper == 'E' 
				|| 	letraToUpper == 'I' 
				|| 	letraToUpper == 'O'
				|| 	letraToUpper == 'U';
	}

}
