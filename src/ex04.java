import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um ano com 4 dígitos: ");
		int ano = input.nextInt();
		input.close();
		
		if(IsBissexto(ano))
			System.out.println("É bissexto");
		else 
			System.out.println("Não é bissexto");
	}

	private static boolean IsBissexto(int ano) {
		return ano % 4 == 0 && !(ano % 100 == 0) ;
	}

}
