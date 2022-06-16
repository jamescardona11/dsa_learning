/**
 * @author James
 * 
 * "\n"
 */
import java.io.*;
import java.text.*;
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
		String ent;
		br.readLine();
		for(int i=0; i<c;i++){
			if(i>0) sb.append("\n");
			TreeMap<String, Integer> tm = new TreeMap<String, Integer>();
			int t=0;
			while((ent=br.readLine()) != null){
				//System.out.print(i);
				if("".equals(ent)) break;
				if(tm.containsKey(ent)){
					int k=tm.get(ent)+1;
					tm.put(ent, k);
				}else if(!ent.equals("")){
					tm.put(ent, 1);
				}
				t++;
			}
			DecimalFormat df = new DecimalFormat("0.0000");
			for(Map.Entry<String, Integer> dt:tm.entrySet()){
				double kk= (double)dt.getValue();
				sb.append(dt.getKey()).append(" ").append(df.format(kk*100/t)).append("\n");
			}
		}
		System.out.print(sb);
	}
}