import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numero[] = new int[3];
		System.out.print("Digite o primeiro número: ");
		numero[0] = input.nextInt();
		System.out.print("Digite o segundo número: ");
		numero[1] = input.nextInt();
		System.out.print("Digite o terceiro número: ");
		numero[2] = input.nextInt();
		input.close();
		
		SortArrayDesc(numero, 3);
		
		for (int i : numero) {
			System.out.println(i + " ");
		}
		
		

	}

	private static void SortArrayDesc(int arrayNumeros[], int n) {
        int i, j, t = 0;
        for (i = 0; i < n; i++) {
            for (j = 1; j < (n - i); j++) {
                if (arrayNumeros[j - 1] < arrayNumeros[j]) {
                    t = arrayNumeros[j - 1];
                    arrayNumeros[j - 1] = arrayNumeros[j];
                    arrayNumeros[j] = t;
                }
            }
        }
    }

}
