package Entornos;

import java.util.Random;

import javax.swing.JOptionPane;

public class AleatorioImpar {

	public AleatorioImpar() {
	}

	public static void main(String[] args) {
		int test1Min = 5;
		   int test1Max = 20;
		   int expectedResult1 = aleatorioImpar(test1Min, test1Max);
		   JOptionPane.showMessageDialog(null, "Resultado de prueba 1: " + expectedResult1);

		   int test2Min = -5;
		   int test2Max = 20;
		   int resultado2 = aleatorioImpar(test2Min, test2Max);
		   JOptionPane.showMessageDialog(null, "Resultado de prueba 2: " +resultado2);

		   int testCase3Min = 5;
		   int testCase3Max = 0;
		   int resultado3 = aleatorioImpar(testCase3Min, testCase3Max);
		   JOptionPane.showMessageDialog(null, "Resultado de prueba 3: " + resultado3);

		   int testCase4Min = 15;
		   int testCase4Max = 20;
		   int resultado4 = aleatorioImpar(testCase4Min, testCase4Max);
		   JOptionPane.showMessageDialog(null, "Resultado de prueba 4: " + resultado4);
		

		aleatorioImpar(8,9);
	}

	public static int aleatorioImpar(int min, int max) {
		if (min >= 0 && max > 0 && min < max - 10) {
			Random rand = new Random();
			int resultado = rand.nextInt((max - min) + 1) + min;
			if (resultado % 2 != 0) {
				return resultado;
			} else {
				return resultado + 1;
			}
		} else {
			return -1;
		}
	}

}
