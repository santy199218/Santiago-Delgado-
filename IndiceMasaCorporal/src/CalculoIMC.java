
public class CalculoIMC {
	/*
	 * Este programa cálcula el Índice de Masa Corporal del individuo, la fórmula es
	 * peso/estatura al cuadrado, donde el peso está en kilogramos y estatura en
	 * metro
	 */

	/*
	 * < 16 Delgadez severa,[25-30) Sobrepeso,[16-17) Delgadez moderada,[30-35)
	 * Obesidad leve, [17-18.5) Delgadez leve, [35-40) Obesidad moderada, [18.5-25)
	 * Peso normal, >=40 Obesidad mórbida
	 */
	static double peso;
	static double estatura;

	

	public CalculoIMC() {
		// TODO Auto-generated constructor stub
	}



	public double CalcularIMC(double imc) {
		imc = peso / Math.pow(estatura, 2);
		return imc;
	}
}
