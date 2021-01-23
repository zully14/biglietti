package esercizigallo;

import prog.io.ConsoleInputManager;

public class ContaLettere2 {

	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		String par = in.readLine("Inserisca una parola");
		String parola = par.toLowerCase();
		int []cont = new int ['z'-'a'+1]; //utilizzo i codici asc di z e a 
		for (int i =0; i<parola.length();i++) {
			char c = parola.charAt(i);
			if (c>='a'&&c<='z')
				cont[c-'a']++;
		}
		for (int i=0;i<cont.length;i++)
		{
			if (cont [i]>0)
				System.out.println((char)('a'+i)+"-"+('a'+i)+": "+cont[i]);
		}
	}

}
