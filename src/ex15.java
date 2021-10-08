import java.util.Scanner;

public class ex15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Digite o preço: R$");
		float preco = input.nextFloat();
		System.out.print("Digite o código de origem: ");
		int codigo = input.nextInt();
		input.close();

		String tipo;
		switch (codigo) {
		case 1:
			tipo = "Sul";
			break;
		case 2:
			tipo = "Norte";
			break;
		case 3:
			tipo = "Leste";
			break;
		case 4:
			tipo = "Oeste";
			break;
		case 5:
		case 6:
			tipo = "Nordeste";
			break;
		case 8:
			tipo = "Centro-Oeste";
			break;
		default:
			tipo = "Importado";
			break;
		}

		System.out.println(String.format("Preço %.2f", preco));
		System.out.println(String.format("Classificaçao: %s", tipo));

	}

}
