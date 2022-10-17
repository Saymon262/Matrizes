package ExerMatriz1;

import javax.swing.JOptionPane;

public class Produtoiporj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Matriz em que valores da mesma são produtos de i por j

		int matriz[][] = new int [5][5];
		
		String res = "";
		
		for (int i = 1; i < 5; i++) {
			res += "\n";
			for (int j = 1; j < 5; j++) {
				matriz[i][j] = i*j;
				
				res += matriz[i][j] + "  ";
			}
		}
		
		JOptionPane.showMessageDialog(null, res);
	}
}
