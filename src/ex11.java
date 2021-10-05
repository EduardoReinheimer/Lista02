import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		char turno;
		do {	
			System.out.println("M - Matutino\nV - Vespertino\nN -Noturno");
			System.out.print("Digite o turno: ");
			turno = input.next().charAt(0);
			turno = Character.toUpperCase(turno);
		}while(turno != 'M' && turno != 'V' && turno != 'N');
		input.close();
		
		if(turno == 'M')
			System.out.println("Bom dia!");
		else if (turno == 'V')
			System.out.println("Boa Tarde!");
		else if (turno == 'N')
			System.out.println("Boa Noite!");
		else 
			throw new UnsupportedOperationException();

	}

}
