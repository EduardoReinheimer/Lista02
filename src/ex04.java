import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um ano com 4 d�gitos: ");
		int ano = input.nextInt();
		input.close();
		
		if(IsBissexto(ano))
			System.out.println("� bissexto");
		else 
			System.out.println("N�o � bissexto");
	}

	private static boolean IsBissexto(int ano) {
		return ano % 4 == 0 && !(ano % 100 == 0) ;
	}

}
