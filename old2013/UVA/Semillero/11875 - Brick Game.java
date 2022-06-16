/**
 * @author James
 * 
 * "\n"
 */
import java.io.*;
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
		int c=Integer.parseInt(br.readLine());
		for (int l=1; l<=c; l++) {
			String st[] = new String(br.readLine()).split(" ");
			int n = Integer.parseInt(st[0]);
			int dif = n/2 + 1;
			
			for(int i=1; i<n; i++){
				if(i==dif){
					sb.append("Case ").append(l).append(": ").append(st[i]).append("\n");
				}
			}
		}
		System.out.print(sb);
	}
}