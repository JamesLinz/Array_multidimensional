/*
Programa que gera e imprime uma Matriz M 4X4 com valores aleatórios entre 0 e 9.
*/


package application;

import java.util.Random;

public class Program {

	public static void main(String[] args) {
		Random random = new Random();
		
		int [][] M = new int[4][4];
		
		for(int i = 0; i < M.length; i++) {
			for(int j = 0; j < M[i].length; j++) {
				M[i][j] = random.nextInt(9);
			}
		}
		
		System.out.println("Matriz: ");
		for(int[] linha : M) {
			for(int coluna : linha) {
				System.out.println(coluna + " ");
			}
			System.out.println();
		}
	}
}
