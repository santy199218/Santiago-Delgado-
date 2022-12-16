import java.util.Scanner;

public class ResultadoPeso extends CalculoIMC {
	static double peso;
	static double estatura;
	private static Scanner lectura;

	public ResultadoPeso() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		lectura = new Scanner(System.in);

		System.out.print("Hola, ingresa tu peso");
		peso = lectura.nextDouble();

		System.out.print("Por favor ingresa tu estatura");
		estatura = lectura.nextDouble();

		System.out.print("El peso es de" + peso + "y la estatura de" + estatura);

		double imc;
		ResultadoPeso calculo = new ResultadoPeso();
		imc = calculo.CalcularIMC(peso, estatura);
		

		if (imc < 16) {
			System.out.print("Delgadez Severa");
		}

		else if (imc > 16 && imc <= 17) {
			System.out.print("Delgadez moderada");
		}

		else if (imc > 17 && imc <= 18.5) {
			System.out.print("Delgadez leve");
		}

		else if (imc > 18.5 && imc <= 25) {
			System.out.print("Peso normal");
		}

		else if (imc > 25 && imc <= 30) {
			System.out.print("Sobrepeso");
		}

		else if (imc > 30 && imc <= 35) {
			System.out.print("Obesidad leve");
		}

		else if (imc > 35 && imc <= 40) {
			System.out.print("Obesidad moderada");
		}

		else {
			System.out.print("Obesidad mórbida");
		}
	}

}
