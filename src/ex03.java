import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um caracter: ");
		char caracter = input.next().charAt(0);
		input.close();
		
		
		if(caracter == 'F' || caracter == 'f')
			System.out.println("F - Feminino");
		else if(caracter == 'M' || caracter == 'm') 
			System.out.println("M - Masculino");
	}

}
