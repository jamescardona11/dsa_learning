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
		}
		//------inicio Codigo--------
    	        
		StringBuffer sb = new StringBuffer("");
		//int c=Integer.parseInt(br.readLine());
		String ent;
		while ((ent=br.readLine())!=null) {
			int n=Integer.parseInt(ent);
			if(n==0) break;
			int v[] = new int[n];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i=0; i<n; i++){
				int k = Integer.parseInt(st.nextToken());	
				v[i] =k;
			}
			
			Arrays.sort(v);
			for(int i=0; i<n; i++){
				sb.append(v[i]);//*/
				if(i!= n-1) sb.append(" ");
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}