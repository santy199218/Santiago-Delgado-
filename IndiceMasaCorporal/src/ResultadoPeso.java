import java.util.Scanner;

public class ResultadoPeso extends CalculoIMC {
	
	private static Scanner lectura;

	
	public static void main(String[] args) {
		double peso= 0.0;
		double estatura=0.0;
		double imc;
		
		lectura = new Scanner(System.in);

		System.out.print("Hola, ingresa tu peso");
		peso = lectura.nextDouble();

		System.out.print("Por favor ingresa tu estatura");
		estatura = lectura.nextDouble();

			
		CalculoIMC calculo = new CalculoIMC();
		imc = calculo.CalcularIMC(peso, estatura);
		
		System.out.print("El IMC es:"+imc+"\n");
		

		if (imc < 16) {
			System.out.print("DELGADEZ SEVERA");
		}

		else if (imc > 16 && imc <= 17) {
			System.out.print("DELGADEZ MODERADA");
		}

		else if (imc > 17 && imc <= 18.5) {
			System.out.print("DELGADEZ LEVE");
		}

		else if (imc > 18.5 && imc <= 25) {
			System.out.print("PESO NORMAL");
		}

		else if (imc > 25 && imc <= 30) {
			System.out.print("SOBREPESO");
		}

		else if (imc > 30 && imc <= 35) {
			System.out.print("OBESIDAD LEVE");
		}

		else if (imc > 35 && imc <= 40) {
			System.out.print("OBESIDAD MODERADA");
		}

		else {
			System.out.print("OBESIDAD MORBIDA");
		}
	}

		}

