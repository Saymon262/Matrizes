package ExerMatriz1;

import javax.swing.JOptionPane;

public class MatrizNomes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Codigo que contem matriz de nomes
		//Retorna Nomes em colunas Pares
		
		int O = 0, cont = 1;
		
		O = Integer.parseInt(JOptionPane.showInputDialog("Insira a ordem da matriz"));
		
		String Nomes[][] = new String [O][O];
		
		for (int i = 0; i < O; i++) {
			for ( int j = 0; j < O; j++) {
				Nomes[i][j] = JOptionPane.showInputDialog("Insira o "+ cont +"° nome");
				cont++;
			}
		}
		
		String res = "";
		
		for (int L = 0; L < O; L++) {
			for ( int C = 0; C < O; C++) {
		
				if (C%2 == 0) {
					res += "Linha: "+ (L+1) + "\nColuna: "+ (C+1) +"\nNome: "+ Nomes[L][C] +"\n\n";
				}
			}
		}
		
		JOptionPane.showMessageDialog(null, res);
	}
}
