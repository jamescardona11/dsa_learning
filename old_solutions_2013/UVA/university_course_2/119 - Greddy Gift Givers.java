/**
 * @author James
 * 119 -  Greedy Gift Givers 
 * 
 */
import java.io.*;
import java.util.*;
public class Main {
	
    public static void main(String[] args) throws Exception {
        BufferedReader br;
        File archivo = new File("entrada.txt");

        if (archivo.exists()) {
            br = new BufferedReader(new FileReader(archivo));
        } else {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        //--------------
        String ent;
        int l=0;
        
        while((ent=br.readLine())!= null){
        	if(l>0)System.out.println();
        	l=1;
        	LinkedHashMap<String, Integer> hm = new LinkedHashMap<String, Integer>();
        	int n= Integer.parseInt(ent);
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	
        	while(st.hasMoreElements()){
        		hm.put(st.nextToken(), 0);
        	}
        	
        	for(int i =0; i<n; i++){
        		String sp[] = (br.readLine()).split(" ");
        		int v=Integer.parseInt(sp[1]);
        		int r=Integer.parseInt(sp[2]);
        		if(r!=0){
        			hm.put(sp[0], (hm.get(sp[0]) - v + v%r));
        			for(int j=3; j<sp.length ;j++){
        				hm.put(sp[j], hm.get(sp[j])+ v/r);
        			}
        		}
        	}//*/
        	for(Map.Entry<String, Integer> data:hm.entrySet()){
        		System.out.println(data.getKey()+" "+data.getValue());
        	}
        }
        
    }
}