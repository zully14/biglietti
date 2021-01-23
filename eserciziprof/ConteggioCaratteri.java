package eserciziprof;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ConteggioCaratteri {

	public static void main(String[] args) throws IOException {
		//leggere un file di testo e visualizza il conteggio 
		//di caratteri spazi inclusi e sucessivamente dei caratteri differenti degli spazi 
//Utilizzare classe file  per rappresentare il cammino di un file che viene aperto 
		// che viene apeerto il lettura
		//FileReader per leggere il flusso di caratteri 
		
		FileReader fr = new FileReader("text.txt");
		int s,contac=0,contas=0;
		char c;
		while ((s=fr.read())==-1) {
			c= (char)s;
			contac++;
			if (Character.isWhitespace(c))
				contas++;
		}
		fr.close();
		System.out.println();
	}

}
