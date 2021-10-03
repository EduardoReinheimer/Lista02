import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um valor inteiro: ");
		int num = input.nextInt();
		input.close();
		
		if(num > 0)
			System.out.println("Positivo");
		else if(num < 0)
			System.out.println("Negativo");
		else 
			System.out.println("Zero");
		
	}

}
