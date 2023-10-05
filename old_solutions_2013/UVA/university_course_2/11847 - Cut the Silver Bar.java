/**
 * @author James
 * 
 * "\n"
 */
import java.io.*;
import java.util.*;

public class Main {   		
	public static void main(String[] args) throws Exception {
		BufferedReader br;
		File archivo = new File("entrada.txt");
		if( archivo.exists() ) {
			br = new BufferedReader( new FileReader( archivo ) );
		}
		else {
			br = new BufferedReader(new InputStreamReader( System.in ) );
		}//------inicio Codigo--------
    	        
		StringBuffer sb = new StringBuffer("");
		//int c=Integer.parseInt(br.readLine());
		String ent;

		while ((ent=br.readLine())!= null) {
			if("0".endsWith(ent)) break;
			int n= Integer.parseInt(ent);
			StringTokenizer st = new StringTokenizer((""+ Math.log10(n)/Math.log10(2)),".");
			
			sb.append(st.nextToken()).append("\n");
		}
		System.out.print(sb);
		
	}
}