package eserciziprof;

import prog.io.ConsoleInputManager;

public class Matrice {
	public static int[][] subMatrice(int x, int y,int[][]a){
		int [][]sub= new int[a.length-1][a.length-1];
		int cont=0;
		int cont2=0;
		for(int i=0;i<a.length;i++) {
			if (i!=x)
			{
				cont2=0;
				for (int j=0;j<a.length;j++) {
					if(j!=y) {
						sub[cont][cont2]=a[i][j];
						cont2++;
					}
				}
				cont++;
			}
		}
  	return sub;
	}

	public  int deter(int x, int[][] a) {
		int det = 0;
		if (a.length == 2) {
			det = a[0][0] * a[1][1] - a[0][1] * a[1][0];
		}
		for (int i = 0; i < a.length; i++) {
			int[][] tmp = Matrice.subMatrice(x, i, a);
			det += Math.pow(-1, x + i) * a[x][i] * this.deter(x, tmp);
		}
		return det;
	}

	public static int[][] per(int[][] a, int[][] b) {
		int[][] m = new int[a.length][b[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b[0].length; j++) {
				for (int x = 0; x < a[0].length; x++) {
					m[i][j] += a[i][x] * b[x][j];
				}
			}
		}
		return m;
	}

	public static String stampaMatrice(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		return " ";
	}
	public static String stampaMatrice(char[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		
	}
	return " ";
	}
	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		System.out.println("Inserisci opzione: 2.PRODOTTO 1.DETERMINANTE");
		int r = in.readInt();
		if(r==1) { int z;
			System.out.println("NUMERI MATRICE");
			int f = in.readInt("Numero righe");
			int c = in.readInt("Numero colonne: ");
			int[][] matrice = new int[f][c];
			for (int k = 0; k < matrice.length; k++) {
				System.out.print("Numeri della fila " + k);
				for (int j = 0; j < matrice[0].length; j++) {
					z = in.readInt();
					matrice[k][j] = z;}}
				int x= in.readInt("Inserire fila da eliminare");
				int y= in.readInt("Inserire colonna da eliminare");
				int det[][]= subMatrice(x,y,matrice);
				stampaMatrice(det);
				}
		else {
		System.out.println("NUMERI 1 MATRICE");
		int f1 = in.readInt("Numero righe");
		int c1 = in.readInt("Numero colonne: ");
		System.out.println("NUMERI 2 MATRICE");
		int f2 = in.readInt("Numero righe: ");
		int c2 = in.readInt("Numero colonne: ");
		while (f1 != c1) {
			System.out.println("Le righe della matrice1 devono essere uguali alle colonne della matrice2 ");
			f1 = in.readInt("Inserire righe 1 matrice: ");
			c1 = in.readInt("Inserire colonne: ");
			f2 = in.readInt("Inserire righe 2 matrice: ");
			c2 = in.readInt("Inserire colonne: ");
		}

		int[][] matrice1 = new int[f1][c1];
		int[][] matrice2 = new int[f2][c2];

		int x, y;
		System.out.println("NUMERI 1 MATRICE");
		for (int i = 0; i < matrice1.length; i++) {
			System.out.print("Numeri della fila " + i);
			for (int j = 0; j < matrice1[0].length; j++) {
				x = in.readInt();
				matrice1[i][j] = x;
			}
		}
		System.out.println("NUMERI 2 MATRICE");
		for (int i = 0; i < matrice2.length; i++) {
			System.out.print("Numeri della fila " + i);
			for (int j = 0; j < matrice2[0].length; j++) {
				y = in.readInt();
				matrice2[i][j] = y;
			}
		}
		int[][] m = per(matrice1, matrice2);
		System.out.println("MATRICE 1");
		stampaMatrice(matrice1);
		System.out.println("MATRICE 2");
		stampaMatrice(matrice2);
		System.out.println("NUMERI MATRICE PRODOTTO");
		stampaMatrice(m);
	}
}}
