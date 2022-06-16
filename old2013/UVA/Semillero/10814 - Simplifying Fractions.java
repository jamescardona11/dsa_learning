/**
 * @author James
 * 11506
 * "\n"
 */
import java.io.*;
import java.math.*;
import java.util.*;

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
        	StringTokenizer st = new StringTokenizer(br.readLine(), " / ");
        	BigInteger a = new BigInteger(st.nextToken());
        	BigInteger b = new BigInteger(st.nextToken());
        	BigInteger div = a.gcd(b);
        	
        	sb.append(a.divide(div)).append(" / ").append(b.divide(div)).append("\n");
        }
        System.out.print(sb);
    }
}