package eserciziprof;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class LetturaFIle {

	public static void main(String[] args) throws IOException {
		// Costruzione stream caratteri 
		BufferedReader in = new BufferedReader (new FileReader(args[0]));
		BufferedWriter out = new BufferedWriter(new FileWriter(args[1]));
		String str;
		while ((str= in.readLine())!= null) {
			for(int i=0;i<str.length();i++) {
				out.write(str);
				out.close();
			}
		}
		
	}

}
