package eserciziprof;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class ContaParoleRipetute {

	public static void main(String[] args) throws FileNotFoundException {
// classe HashMap per contare occorenze
		File file = new File("cavolo.txt");
		Scanner scan = new Scanner (file);
		String parola="";
		Integer num=1;
		HashMap<String,Integer> map= new HashMap <String,Integer>();
		while (scan.hasNext())
		{
			parola= scan.next();
			if(map.containsKey(parola))
			map.put(parola,++num);
			else 
				map.put(parola,num);
		}
		scan.close();
		for (Entry<String, Integer>tmp : map.entrySet()){
			System.out.println(tmp.getKey()+" : "+tmp.getValue());
		}
		
	
	}
	}


