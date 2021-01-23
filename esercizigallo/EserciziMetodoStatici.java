package esercizigallo;

import java.util.Random;
import java.util.Scanner;

public class EserciziMetodoStatici {
//Restituisce un array di interi di dimensione dimArray in cui ogni posizione contiene un valore compreso fra 0 e valoreMax.
public static int [] arrayIntRandom(int dimArray,int valMax) {
	int [] array = new int [dimArray];
	Random r = new Random();
	for (int i=0; i<array.length;i++) {
		array[i]= r.nextInt(valMax);
	}
	return array;
}
public static int[] reverse(int[] a)
//Preso in ingresso un array a, restituisce un array che contiene gli stessi valori di a disposti in ordine inverso.
{
	int [] arrayr= new int[a.length];
	for (int i=0;i<a.length;i++) {
		arrayr[i]= a[a.length-1-i];
	}
	return arrayr;
	
}
public static int[] maxPosizioni(int[] a, int[] b)
//Presi in ingresso due array a e b di dimensione n, restituisce l�array di dimensione n 
//che contiene in ogni posizione il massimo fra i valori presenti nella corrispondenti posizioni di a e b.
{
	int []array = new int [a.length];
	for (int i=0;i<a.length;i++) {
		if (a[i]>=b[i])
			array[i]=a[i];
		else 
			array[i]=b[i];
		//array[i]= MathMax(a[i],b[i]); utilizzare metodo Mathmax
	}
	return array;
	}
public static String toString(int[]a, String operatore) {
	String s="[ ";
	for(int i=0;i<a.length-1;i++) {
		s+= a[i]+ operatore;
	}
	return s + a[a.length-1] + " ]";
}
	public static void main(String[] args) {
		// Metodi statici 19/11
		Scanner scan = new Scanner(System.in);
		System.out.println("Inserisca dimensione array");
		int dimArray= scan.nextInt();
		System.out.println("Inserisca valore massimo");
		int valmax= scan.nextInt();
		int[]array= arrayIntRandom(dimArray, valmax);
		int [] arrayreverse = reverse(array);
		int []max = maxPosizioni(array, arrayreverse);
		System.out.println(toString(array, " , "));
		System.out.println(toString(arrayreverse, " , "));
		System.out.println(toString(max, " , "));
		scan.close();
	}

}
