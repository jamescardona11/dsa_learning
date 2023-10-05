/**
 * @author James
 * 
 * "\n"
 */
import java.io.*;
import java.util.StringTokenizer;

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
		int c= 0;
		String ent;
		while ((ent = br.readLine()) != null){
			StringTokenizer st = new StringTokenizer(ent);
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			if( a == 0) break;

			String kk ="";
			if(a < b){
				kk="0";
			}else if(b*27 < a){
				kk= "impossible";
			}else{
				int i=0, tmp=b;
				while( tmp<a ){
					tmp += b;
					i++;
					//System.out.println("i:  " + i+"   tmp:   "+tmp);
				}
				kk= i+"";
			}
			sb.append("Case ").append(++c).append(": ").append(kk).append("\n");
		}
		System.out.print(sb);
	}
}