package esercizigallo;



import java.util.HashSet;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import prog.io.ConsoleInputManager;

public class HashSetS {

	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		String par = in.readLine("Inserisca una parola");
		String parola = par.toLowerCase();
		String[]arr =parola.split("");
		List<String>list = Arrays.asList(arr);
		Set<String> set = new HashSet<String>(list);
		
		for(String tmp: set) {
		int count = Collections.frequency(list, tmp);
		System.out.println(tmp + " "+count);
		}

	}

}
