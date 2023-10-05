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
        
        int casos = Integer.parseInt(br.readLine());
        while(casos-- > 0){
        	String ent = br.readLine();
        	sb.append("The maximum and minimum are ").append(max(ent)).append(" and ").append(min(ent)).append(".\n");
        }
        System.out.print(sb);
    }
    public static long max(String s){
    	long res = 1;
    	StringTokenizer st, st1;
    	st= new StringTokenizer(s, "*");
    	while(st.hasMoreElements()){
    		long sum = 0;
    		st1 = new StringTokenizer(st.nextToken(), "+");
    		while(st1.hasMoreElements()){
    			sum += Integer.parseInt(st1.nextToken());
    		}
    		res*=sum;
    	}
    	return res;
    }
    public static long min(String s){
    	long res = 0;
    	StringTokenizer st, st1;
    	st= new StringTokenizer(s, "+");
    	while(st.hasMoreElements()){
    		long sum = 1;
    		st1 = new StringTokenizer(st.nextToken(), "*");
    		while(st1.hasMoreElements()){
    			sum *= Integer.parseInt(st1.nextToken());
    		}
    		res+=sum;
    	}
    	return res;
    }
}
