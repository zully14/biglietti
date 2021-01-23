package eserciziprof;

public class Contatore {

	public static void main(String[] args) {
		String s="sorry7";
		int [] cont = new int ['z'-'a'+1];
		for	(int i=0; i<s.length();i++) {
			char c = s.charAt(i);
			if(c>='a' && c<= 'z')
				cont[c-'a']++;
		}
		for(int i =0;i<cont.length;i++) {
			if(cont[i]>0)
				System.out.println((char)('a'+i)+"-"+('a'+i)+ ":"+ cont[i]);
		}

	}

}
