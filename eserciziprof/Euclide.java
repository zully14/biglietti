package eserciziprof;

import prog.io.ConsoleInputManager;

public class Euclide {

	public static void main(String[] args) {
		 ConsoleInputManager in = new ConsoleInputManager();
		 int n1 = in.readInt("Inserisca due numeri: ");
		 int n2= in.readInt();
		 if (n1< 0 || n2<0) {
			 System.out.println("Il valore non deve essere negativo");
		 return;}
		int a= n1;
		int b= n2;
		 if(n1>n2) {
			  a=n2;
		 	  b=n1;}
		 int r;
		 while ((r=a%b)!=0) {
			 a=b;
			 b=r;
		 }
		 System.out.printf("MCD TRA  %d E %d E' %d",n1,n2,b);
	   }
	}


