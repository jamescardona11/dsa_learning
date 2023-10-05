/**
 * @author James
 * 11559-Event Plannig
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
        
        String ent;
        StringTokenizer st;
        int v[]= new int[4], i, c=0;
        
        while((ent = br.readLine())!=null){
        	
        	st = new StringTokenizer(ent);
        	i=0;
        	c=0;
        	while(st.hasMoreElements()){
        		v[i] = Integer.parseInt(st.nextToken());
        		i++;
        	}
        	
        	
        	int hav[] = new int[v[2]];
        	
        	for(int k=0; k<v[2];k++){
        		int pre= Integer.parseInt(br.readLine());
        		ent = br.readLine();
        		StringTokenizer st1 = new StringTokenizer(ent);
            	
                while(st1.hasMoreElements()){
                	if( Integer.parseInt(st1.nextToken()) > v[0]){
                		
                    	if(v[0]*pre < v[1]){
                    		hav[c]=v[0]*pre; 
                    		c++;
                    		break;
                    	}
                    }
                }

        	}
        	
        	if(c>0){
        		int min=hav[0];
        		for(int k=0;k<c;k++){
        			min = Math.min(min,hav[k]);
        		}
        		System.out.println(min);
        	}else{
        		System.out.println("stay home");
        	}
        }

    }
}    