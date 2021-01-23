package esercizigallo;

import java.util.Arrays;
import java.util.Random;

import prog.utili.Cerchio;
import prog.utili.Figura;
import prog.utili.Quadrato;
import prog.utili.Rettangolo;
//generi un array contentente un numero prefissato di figure (es MAX_NUMERO_FIGURE = 20) generate in 
	//modo pseudocasuale (ogni Figura dell'array è generata in modo casuale)
	//visualizzi il contenuto dell’array mostrando prima tutti i cerchi, poi tutti i quadrati e infine tutti i rettangoli.
	
public class FigureUtil {
	static int max_figure = 10;
	public FigureUtil () {
		
	}
	
	static Random r = new Random ();
	private static double maxBase=10;
	private static double maxAltezza=15;
	private static double maxLato=5;
	private static double maxRaggio=9;
	public static Rettangolo generaRettangoloRandom(double maxBase, double maxAltezza) {
		//Genera un rettangolo con la base compresa fra 0 e maxBase e altezza compresa fra 0 e maxAltezza
	
		Rettangolo rett= new Rettangolo (r.nextDouble()* maxBase,r.nextDouble()* maxAltezza);
		return rett;
	}
	public static double prArea(Figura[] arr) {
		double aq=0,ar=0,ac=0,a=0,am=0;
		for(int i=0; i<max_figure;i++) {
			if(arr[i] instanceof Quadrato) 
				aq= arr[i].getArea();
			else if (arr[i] instanceof Rettangolo) 
				ar= arr[i].getArea();
			else
				ac= arr[i].getArea();
			
		}
		a=(aq+ar+ac)/max_figure;
		return a;
	}
	
	public static Quadrato generaQuadratoRandom(double maxLato)
	//Genera un quadrato con il lato compreso fra 0 e maxLato
	{
		Quadrato quad= new Quadrato (r.nextDouble()* maxLato);
		return quad;
	}
	public static Cerchio generaCerchioRandom(double maxRaggio)
	//Genera un cerchio con il raggio compreso fra 0 e maxRaggio
	{
		Cerchio cer= new Cerchio (r.nextDouble()* maxRaggio);
		return cer;
	}
	public static void main(String args[]) {
		Figura [] array = new Figura[max_figure];
		int wf=0;
		for ( int i =0 ; i<array.length; i++) {
			wf=r.nextInt(3);
			if(wf==0)
				array[i]= generaRettangoloRandom(maxBase, maxAltezza);
			else if (wf==1)
				array[i]= generaQuadratoRandom(maxLato);
			else 
				array[i]=generaCerchioRandom(maxRaggio);
		}
		System.out.println(stampa(array));
		System.out.println("PROMEDIO AREA: ");
		
		}
	
		
	public static String stampa(Figura[]arr) {
		String s="",r="",q="",c="";
		
		for(int i=0; i<max_figure;i++) {
			if(arr[i] instanceof Quadrato) 
				q+= (arr[i]) + "\n";
			else if (arr[i] instanceof Rettangolo) 
				r+= (arr[i]) +"\n";
			else
				c+= (arr[i])+ "\n";
		}
		s= "ELENCO QUADRATI \n"+ q+ "ELENCO RETTANGOLI \n"+ r+ "ELENCO CERCHI \n"+c;
		return s;
			
	}
}
