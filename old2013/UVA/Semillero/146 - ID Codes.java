/**
 * @author James
 * 11385
 * 
 */
import java.io.*;
import java.util.*;

public class Main {
	
    public static void main(String[] args) throws Exception {
    	BufferedReader br;
    	File archivo = new File("entrada.txt");
    	if( archivo.exists() ) br = new BufferedReader( new FileReader( archivo ) );
    	else br = new BufferedReader( new InputStreamReader( System.in ) );
        //------Inicio Codigo--------
        
    	StringBuffer sb = new StringBuffer("");
        String ent;
        while (!(ent=br.readLine()).equals("#")) {
        	
        	char v[]=ent.toCharArray();
        	int n=v.length, indMin = -1, indmax =-1;
        	for(int i=n-1; i>0; i--){
        		if(v[i-1]<v[i]){
        			indMin=i-1;
        			break;
        		}
        	}

        	if(indMin != -1){
        		for(int i=n-1; i>=0; i--){
        			if(v[i]>v[indMin]){
        				indmax=i;
        				break;
        			}
        		}
        		
        		char tem = v[indmax];
        		v[indmax] = v[indMin];
        		v[indMin] = tem;
        		
        		Arrays.sort(v, indMin+1, n);
        		sb.append(new String(v)).append("\n");
        	}else{
        		sb.append("No Successor\n");
        	}
        }
        System.out.print(sb);
    }
}