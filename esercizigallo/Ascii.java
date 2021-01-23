package esercizigallo;

public class Ascii {

	public static void main(String[] args) {
	String input = "8412";
	byte []ArrayByte = input.getBytes();
	for (int i=0;i<ArrayByte.length;i++) 
		System.out.print((char)ArrayByte[i]);
		byte []result = new byte [ArrayByte.length];
		for (int i=0;i<ArrayByte.length;i++ )
			result[i]= ArrayByte[ArrayByte.length-i-1];
		System.out.println();
		System.out.print("CODICE ASCII:");
		System.out.print(new String(result));
	
	}

}
