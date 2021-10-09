import java.util.Iterator;
import java.util.Scanner;

public class ex18 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double[] ladosTriangulo = new double[3];

		for (int index = 0; index < ladosTriangulo.length; index++) {
			System.out.print(String.format("Digite o lado %s do triângulo: ", index + 1));
			ladosTriangulo[index] = input.nextDouble();
		}
		input.close();

		String tipoTriangulo = GetTipoTriangulo(ladosTriangulo);
		System.out.println(tipoTriangulo);

	}

	private static String GetTipoTriangulo(double[] ladosTriangulo) {
		int count = 0;
		int countAux;
		for (int i = 0; i < ladosTriangulo.length; i++) {
			countAux = 0;
			for (int j = 0; j < ladosTriangulo.length; j++) {
				if (ladosTriangulo[i] == ladosTriangulo[j]) {
					countAux++;
				}
			}
			count = countAux > count ? countAux : count;
		}
		switch (count) {
		case 1:
			return "Triângulo Escaleno";
		case 2:
			return "Triângulo Isósceles";
		case 3:
			return "Triângulo Equilátero";
		default:
			return "";

		}
	}

}
