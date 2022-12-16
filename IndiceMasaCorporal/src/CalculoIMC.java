
public class CalculoIMC {
		
	public double CalcularIMC(double peso, double estatura) {
		double imc;
		imc = peso / Math.pow(estatura, 2);
		return imc;
	}


}
