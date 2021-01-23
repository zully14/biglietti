package eserciziprof;
import prog.io.*;
public class SommaInColonna {

	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		int n1 = in.readInt("Inserisca 2 numeri: ");
		int n2 = in.readInt();
		int s= n1+n2;
		String spazi = "         ";
		String sep = "----------";
		String sn1 = String.valueOf(n1);
		String sn2 = String.valueOf(n2);
		String ss = String.valueOf(s);
		String riga1 = spazi.substring(0,ss.length()-sn1.length())+ sn1+" +";
		String riga2 = spazi.substring(0,ss.length()-sn2.length())+ sn2+ " =";
		String riga3 = spazi.substring(1,ss.length())+ ss;
		System.out.println(riga1);
		System.out.println(riga2);
		System.out.println(sep);
		System.out.println(riga3);

	}

}
