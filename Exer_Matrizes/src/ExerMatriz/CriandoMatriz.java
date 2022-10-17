package ExerMatriz1;

import javax.swing.JOptionPane;

public class CriandoMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Codigo para criar matriz
		//Ordem e valores a gosto
		
		int Ordem = 0;
		String res = "";
		
		Ordem = Integer.parseInt(JOptionPane.showInputDialog("Insira a ordem da matriz"));
		int matriz[][] = new int [Ordem][Ordem];
		
		for (int L = 0; L < Ordem; L++) {
			res += "\n";
			for ( int C = 0; C < Ordem; C++) {
				matriz[L][C] =  Integer.parseInt(JOptionPane.showInputDialog("Insira o valor desejado"));
				res += matriz[L][C] + " ";
			}
		}
		JOptionPane.showMessageDialog(null,"matriz: " + res);
	}
}
