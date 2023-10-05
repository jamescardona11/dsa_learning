/**
 * @author James
 * 11506
 */
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
	
    public static void main(String[] args) throws Exception {
    	BufferedReader br;
    	File archivo = new File("entrada.txt");
    	if( archivo.exists() ) br = new BufferedReader( new FileReader( archivo ) );
    	else br = new BufferedReader( new InputStreamReader( System.in ) );
        //------aux1o Codigo--------
        
    	StringBuffer sb = new StringBuffer("");
        BigInteger bi = BigInteger.valueOf(131071);
        String ent;
        while ((ent=br.readLine()) != null) {
        	while(!ent.endsWith("#")){
        		ent+=br.readLine();
        	}
        	StringTokenizer ent1 = new StringTokenizer(ent, "#");
        	BigInteger bi1= new BigInteger(ent1.nextToken(), 2);
        	BigInteger bi2= new BigInteger(bi1.toString(10));
        	if(bi1.mod(bi) == (BigInteger.ZERO)){
        		sb.append("YES\n");
        	}else{
        		sb.append("NO\n");
        	}
        	
        }
        System.out.print(sb);
    } 
}
