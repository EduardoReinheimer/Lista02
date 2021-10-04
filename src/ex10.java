import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] numeros = new int[3];

		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Digite um número: ");
			numeros[i] = input.nextInt();
		}
		input.close();

		SortArrayAsc(numeros, 3);

		for (int numero : numeros) {
			System.out.print(numero + "\n");
		}

	}

	private static void SortArrayAsc(int arrayNumeros[], int n) {
		int i, j, t = 0;
		for (i = 0; i < n; i++) {
			for (j = 0; j < (n - 1); j++) {
				if (arrayNumeros[j] > arrayNumeros[j + 1]) {
					t = arrayNumeros[j];
					arrayNumeros[j] = arrayNumeros[j + 1];
					arrayNumeros[j + 1] = t;
				}
			}
		}
	}

}
