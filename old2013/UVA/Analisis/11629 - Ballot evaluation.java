/**
 * @author James
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
        
        while((ent = br.readLine()) != null){
        	StringTokenizer st = new StringTokenizer(ent);
        	int n= Integer.parseInt(st.nextToken()), m= Integer.parseInt(st.nextToken());
        	HashMap<String, Integer> hm = new HashMap<String, Integer>();
        	
        	for(int i =0; i< n; i++){
        		st = new StringTokenizer(br.readLine());
        		String key = st.nextToken();
        		StringTokenizer st2 = new StringTokenizer(st.nextToken(),".");
        		int a = Integer.parseInt(st2.nextToken())*10 + Integer.parseInt(st2.nextToken());
            	hm.put(key, a);
        	}
        	
        	for(int i = 0; i< m; i++){
        		st = new StringTokenizer(br.readLine());
        		double suma = hm.get(st.nextElement());
        		while(st.hasMoreElements()){
        			String s = st.nextToken();
        			if(s.equals("+")) suma += hm.get(st.nextElement());
        			
        			if(s.equals(">")){
        				if(suma > 10*Integer.parseInt(st.nextToken())) sb.append("Guess #").append(i+1).append(" was correct.\n");
        				else sb.append("Guess #").append(i+1).append(" was incorrect.\n");
        			}else if(s.equals("<")){
        				if(suma < 10*Integer.parseInt(st.nextToken())) sb.append("Guess #").append(i+1).append(" was correct.\n");
        				else sb.append("Guess #").append(i+1).append(" was incorrect.\n"); 
        			}else if(s.equals(">=")){
        				if(suma >=10*Integer.parseInt(st.nextToken())) sb.append("Guess #").append(i+1).append(" was correct.\n");
        				else sb.append("Guess #").append(i+1).append(" was incorrect.\n");
        			}else if(s.equals("<=")){
        				if(suma <= 10*Integer.parseInt(st.nextToken())) sb.append("Guess #").append(i+1).append(" was correct.\n");
        				else sb.append("Guess #").append(i+1).append(" was incorrect.\n");
        			}else if(s.equals("=")){
        				if(suma == 10*Integer.parseInt(st.nextToken())) sb.append("Guess #").append(i+1).append(" was correct.\n");
        				else sb.append("Guess #").append(i+1).append(" was incorrect.\n");
        			}
        		}   			
        	}
        }
        //System.out.println("suma_>"+suma);
        System.out.print(sb);
    }
}