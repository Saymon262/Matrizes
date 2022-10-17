package ExerMatriz1;

import javax.swing.JOptionPane;

public class SomaDeMatrizes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Programa para somar duas matrizes

		int A [][] = new int [2][2];
		int B [][] = new int [2][2];
		
		for (int i = 0; i < 2; i++) {
			for ( int j = 0; j < 2; j++) {
				A[i][j] =  Integer.parseInt(JOptionPane.showInputDialog("Insira o valor desejado em A"));
			}
		}
		
		for (int i = 0; i < 2; i++) {
			for ( int j = 0; j < 2; j++) {
				B[i][j] =  Integer.parseInt(JOptionPane.showInputDialog("Insira o valor desejado em B"));
			}
		}
		
		String res = "";
		for (int i = 0; i < 2; i++) {
			for ( int j = 0; j < 2; j++) {
				A[i][j] += B[i][j];
				res += A[i][j] + "\n";
			}
		}
		
		 System.out.println(res);
		
	}
}
