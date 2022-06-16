/**
 * @author James
 * 10252
 * 
 */
import java.io.*;
import java.util.*;

public class Main {
	
    public static void main(String[] args) throws Exception {
    	BufferedReader br;
    	File archivo = new File("entrada.txt");
    	if( archivo.exists() ) br = new BufferedReader( new FileReader( archivo ) );
    	else br = new BufferedReader( new InputStreamReader( System.in ) );
        //------aux1o Codigo--------
        
    	StringBuffer sb = new StringBuffer("");
        
        while (br.ready()) {
        	
        	String ent = br.readLine(), ent1 = br.readLine();;
        	TreeSet<Character> ts = new TreeSet<Character>();
        	
        	int v1[] = new int[256], v2[] = new int[256];
        	int n= ent.length(), n1=ent1.length();
        	for(int i=0; i< n; i++){
        		v1[(int)ent.charAt(i)]+=1;
        	}
        	for(int i=0; i<n1; i++){
        		v2[(int)ent1.charAt(i)]+=1;
        	}
        	
        	for(int i=0; i< 256; i++){
        		int k= Math.min(v1[i], v2[i]);
        		for(int j=0; j<k; j++){
        			sb.append((char)i);
        		}
        	}	
        	sb.append("\n");
        	
        }
        System.out.print(sb);
    }
    
}