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
        
        
        int casos = Integer.parseInt(br.readLine()), v, d;
        String m;
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        HashMap<String, Integer> hm;
        for (int i = 0; i < casos; i++) {
        	int p = Integer.parseInt(br.readLine());
        	hm = new HashMap<String, Integer>();
        	for (int k = 0; k < p; k++) {
				st = new StringTokenizer(br.readLine());
				String key = st.nextToken();
				int value = Integer.parseInt(st.nextToken());
				hm.put(key, value);
			}
        	v = Integer.parseInt(br.readLine());
        	m = br.readLine();
        	if(hm.containsKey(m)){
        		d = hm.get(m);
            	if(d<=v) sb.append("Case ").append(i+1).append(": Yesss\n");
            	else if(d<=v+5) sb.append("Case ").append(i+1).append(": Late\n");
            	else sb.append("Case ").append(i+1).append(": Do your own homework!\n");
        	}else{
        		sb.append("Case ").append(i+1).append(": Do your own homework!\n");
        	}
        	
        }
        System.out.print(sb);
    }
}