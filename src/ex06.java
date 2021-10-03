import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		int num = input.nextInt();
		input.close();
		
		++num;
		System.out.println(num);
	}

}
