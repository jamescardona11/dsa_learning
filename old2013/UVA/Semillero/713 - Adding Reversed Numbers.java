/**
 * @author James
 * 11506
 * "\n"
 */
import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
	
    public static void main(String[] args) throws Exception {
    	BufferedReader br;
    	File archivo = new File("entrada.txt");
    	if( archivo.exists() ) br = new BufferedReader( new FileReader( archivo ) );
    	else br = new BufferedReader(new InputStreamReader( System.in ) );
        //------aux1o Codigo--------
        
    	StringBuffer sb = new StringBuffer("");
        int c=Integer.parseInt(br.readLine());
        while (c-->0) {
        	StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        	StringBuffer n1 = new StringBuffer(st.nextToken());
        	StringBuffer n2 = new StringBuffer(st.nextToken());
        	BigInteger bi1 = new BigInteger((n1.reverse()).toString());
        	BigInteger bi2 = new BigInteger((n2.reverse()).toString());
        	
        	bi2= bi2.add(bi1);
        	StringBuffer s = new StringBuffer(bi2.toString());
        	bi2 = new BigInteger(s.reverse().toString());
        	sb.append(bi2).append("\n");
        }
        System.out.print(sb);
    }
}
