package ExerMatriz1;

import javax.swing.JOptionPane;

public class NotasDosAlunos{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Programa para cadastrar notas dos alunos
		
		int A = 0, P = 0;
		A = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de alunos"));
		P = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de Provas"));
		
		int Notas [][] = new int [A][P];
		
		String res = "";
		
		for (int i = 0; i < A; i++) {
			res += "\nAluno" + (i+1) + ": " ;
			for ( int j = 0; j < P; j++) {
				Notas [i][j] = Integer.parseInt(JOptionPane.showInputDialog("Insira a "+ (j+1) +"° nota do "+ (i+1) +"° aluno"));
				res += Notas[i][j] + " ";
			}
		}
		JOptionPane.showMessageDialog(null,"NOTAS: " + res);
	}
}
