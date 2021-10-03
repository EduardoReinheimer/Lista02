import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		int num1 = input.nextInt();
		System.out.print("Digite o seguno número: ");
		int num2 = input.nextInt();
		input.close();
		
		if(num1 > num2)
			System.out.println(num1);
		else
			System.out.println(num2);
			
	}
}
