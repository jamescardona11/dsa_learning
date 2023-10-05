/**
 * @author James
 * 
 * "\n"
 */
import java.io.*;
import java.util.*;

public class Main {
	
	
    public static void main(String[] args) throws Exception {
        // 1 -------Definición de variables para la lectura
    	BufferedReader br;
        File archivo = new File("entrada.txt");
        if (archivo.exists()) {
            br = new BufferedReader(new FileReader(archivo));
        } else {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
            //-------------Inicio Algoritmo
        
        StringBuilder sb = new StringBuilder(); 
        String ent;
        int iii=0;
        while((ent = br.readLine()) != null){
        	StringTokenizer st = new StringTokenizer(ent);
        	int n = Integer.parseInt(st.nextToken()), n1 = Integer.parseInt(st.nextToken());
        	int v[] = new int[n], v1[] = new int[n1];
        	if (n==0) break;
        	for(int i = 0; i< n+n1; i++){
        		if(i<n){
        			v[i] = Integer.parseInt(br.readLine());
        		}else{
        			v1[i-n] = Integer.parseInt(br.readLine());
        		}
        	}
        	//v = divideAndmerge(v, n);
        	Arrays.sort(v);
        	
        	
        	sb.append("CASE# ").append(++iii).append(":").append("\n");
        	for( int i=0; i< n1; i++){
        		int b =  search(v, v1[i]);
        		if(b< 0) sb.append(v1[i]).append(" not found").append("\n");
        		else sb.append(v1[i]).append(" found at ").append(b+1).append("\n");	
        	}
        }
        System.out.print(sb);
    }
    
    public static int search(int arr[],int x){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x)
                return i;
        }
        return -1;
    
}
}