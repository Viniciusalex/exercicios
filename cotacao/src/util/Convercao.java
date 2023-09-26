package util;

public class Convercao {
	public static double IOF = 0.06;
	
	public static double valorDaConversao(double valorDolar, double quantidadeDesejada) {
		return valorDolar * quantidadeDesejada *(1+IOF);
	}
}
