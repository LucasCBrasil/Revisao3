package recursao;

import java.util.Arrays;

public class MetodosRecursivos {

	public int calcularSomaArray(int[] array){
		int result = 0;
		// TODO ESCREVA AQUI O CÓDIGO (USANDO RECURSAO) PARA CALCULAR A SOMA
		// DOS EMENTOS DE UM ARRAY
		return result;
	}
	public long calcularFatorial(int n) {
		long result = 1;
		if(n == 0) {
			return result;
		}
		return n * calcularFatorial(n - 1);
	}

	public int calcularFibonacci(int n) {
		int result = 1;
		if(n == 1 || n == 2) {
		}
		else {
			result = calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
		}
		return result;
	}

	public int countNotNull(Object[] array) {
		int result = 0;
		if(array.length == 1) {
			if(array[0] == null) {
				result++;
			}
			return result;
		}
		result += countNotNull(Arrays.copyOfRange(array, 1, array.length));
		return result;
	}

	public long potenciaDe2(int expoente) {
		int result = 1;
		if(expoente == 0) {
		}
		else{
			result = (int) (2 * potenciaDe2(expoente - 1));
		}
		
		return result;
	}

	public double progressaoAritmetica(double termoInicial, double razao, int n) {
		double result = 0;
		if(n == 1) {
			result = termoInicial;
		}
		else {
			result = razao + progressaoAritmetica(termoInicial, razao, n - 1);
		}
		return result;
	}

	public double progressaoGeometrica(double termoInicial, double razao, int n) {
		double result = 1;
		if(n == 1) {
			result = termoInicial;
		}
		else {
			result = razao * progressaoGeometrica(termoInicial, razao, n - 1);
		}
		return result;
	}
	
	
}
