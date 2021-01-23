/**
 * 
 */
package eserciziprof;

import java.math.BigInteger;

/**
 * @author giuli
 *
 */
public class MCD {
	public static BigInteger mcd(BigInteger n1, BigInteger n2) {
		if(n1.compareTo(BigInteger.ZERO)==0)
			return n2;
		else 
		return 	mcd(n1,n2.mod(n1));
	}
	public static void main(String[] args) {
		
		
	}

}
