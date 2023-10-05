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
			PriorityQueue<Long> pq = new PriorityQueue<Long>();
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i=0; i<n; i++){
				long k = Integer.parseInt(st.nextToken());	
				pq.add(k);
			}
			long sum=0;
			while(pq.size()>1){
				long a= pq.remove(), b = pq.remove();
				pq.add(a+b);
				sum+=a+b;
			}//*/
			sb.append(sum).append("\n");
		}
		System.out.print(sb);
	}
}