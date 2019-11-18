package utilidades;

public class ConversorMoeda {

	public static double IOF = 0.06;

	public static double conversaoDolar(double precoDolar, double valor) {
		return precoDolar * (valor + valor * IOF);

	}

}
