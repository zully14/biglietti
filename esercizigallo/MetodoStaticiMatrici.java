package esercizigallo;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MetodoStaticiMatrici {
	public static int[][] matriceIntRandom(int righe, int colonne, int bound){
	//Costruisce la matrice di int della dimensione specificata in cui le celle contengono valori
	//generati a caso compresi fra -bound e bound.
		int[][] matrice= new int [righe][colonne];
		Random r = new Random();
		for(int i=0;i<matrice.length;i++) {
			for(int j=0;j<matrice[0].length;j++) {
				matrice[i][j]=r.nextInt((bound*2)-bound);
			}
		}
		return matrice;
	}
	public static int sommaValori(int [][]matrice) {
		int somma=0;
		for(int i=0;i<matrice.length;i++) {
			for (int j=0;j<matrice[0].length;j++) {
				somma += matrice[i][j];
			}
			}
		return somma;
	}
	public static String toString(int[][] matrice, String sepColonne, String sepRighe) {
	//Restituisce la stringa che descrive la matrice specificata come argomento in cui
	//i valori nelle righe della matrice sono separati dalla 
	//stringa sepColonne e le righe sono separate dalla stringa sepRighe.
		String s ="";
		for(int i=0;i<matrice.length;i++) {
			s+="[ ";
			for (int j=0;j<matrice[0].length;j++) {
				s+= matrice[i][j] + sepColonne;
			}
				s+=sepRighe;
		}
		return s ;	
	}
	public static int[] diagonale(int[][]matrice) {
		int []d = new int [matrice.length];
			for(int i=0;i<matrice.length;i++) {
				d[i]= matrice[i][1];
			}
		return d;
	}
	public static void main(String[] args) {
		// 19/11 es 2
		Scanner scan = new Scanner(System.in);
		System.out.println("Numero righe. ");
		int nrighe = scan.nextInt();
		System.out.println("Numero colonne. ");
		int ncolonne = scan.nextInt();
		System.out.println("Numero massimo. ");
		int bound = scan.nextInt();
		int [][] matrice = matriceIntRandom(nrighe, ncolonne, bound);
	 System.out.println(Arrays.deepToString(matrice));
	String sepColonne= " ,";
			String sepRighe= " ] ";
	 System.out.println();
	 System.out.println(toString(matrice, sepColonne, sepRighe));
	 int somma = sommaValori(matrice);
	 System.out.println("SOMMA: "+somma);
	}
	
}
