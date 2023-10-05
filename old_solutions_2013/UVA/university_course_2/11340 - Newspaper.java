/**
 * @author James
 * 
 * "\n"
 */
import java.io.*;
import java.text.DecimalFormat;
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
		int c=Integer.parseInt(br.readLine());
		//String ent;
		while (c-->0) {
			HashMap<Character, Integer> tm = new HashMap<Character, Integer>();
			int n=Integer.parseInt(br.readLine());
			
			for(int i=0; i<n; i++){
				StringTokenizer st = new StringTokenizer(br.readLine());
				tm.put(st.nextToken().charAt(0), Integer.parseInt(st.nextToken()));
			}
			int n1=Integer.parseInt(br.readLine());
			double precio=0;
			for(int i=0; i<n1; i++){
				StringBuilder sb2 = new StringBuilder(br.readLine());
				int t=sb2.length();
				for(int j=0; j<t;j++){
					char k=sb2.charAt(j);
					if(tm.containsKey(k)){
						precio+=tm.get(k);
					}
				}
			}
			DecimalFormat df = new DecimalFormat("0.00$");
			sb.append(df.format(precio/100)).append("\n");//*/
			//System.out.printf("%.2f$\n", precio / 100);
		}
		System.out.print(sb);
	}
}