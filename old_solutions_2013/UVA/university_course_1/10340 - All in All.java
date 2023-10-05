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
        if (archivo.exists()) br = new BufferedReader(new FileReader(archivo));
        else br = new BufferedReader(new InputStreamReader(System.in));
        
        StringBuilder sb = new StringBuilder();
        String ent;
        StringTokenizer st;
        while((ent=br.readLine())!=null){
        	st = new StringTokenizer(ent);
        	char[] s = st.nextToken().toCharArray();
        	char[] t = st.nextToken().toCharArray();
        	int i=0, n = s.length, m = t.length;
        	if(m>=n){
        		for (int k = 0; k < m&& i< n; k++) {
        			if(s[i] == t[k]){
        				//System.out.println("->"+s[i]+" i: "+i+"  _>"+t[k]+ " k: "+k);
        				i++;
        			}
        		}
        		//System.out.println("i: "+i+"  n:"+n);
				if(i==n) sb.append("Yes").append("\n");
				else sb.append("No").append("\n");
			}else{
				sb.append("No").append("\n");
			}
        }
        System.out.print(sb);
    }
}