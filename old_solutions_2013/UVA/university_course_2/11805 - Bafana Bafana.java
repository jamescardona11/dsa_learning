/**
 * @author James
 * 146
 * 
 */
import java.io.*;

public class Main {
	
    public static void main(String[] args) throws Exception {
    	BufferedReader br;
    	File archivo = new File("entrada.txt");
    	if( archivo.exists() ) br = new BufferedReader( new FileReader( archivo ) );
    	else br = new BufferedReader( new InputStreamReader( System.in ) );
        //------Inicio Codigo--------
        
        StringBuilder sb = new StringBuilder();
        
        int c= Integer.parseInt(br.readLine());
        for(int i=0; i<c; i++){
        	String ent[] = br.readLine().split(" ");
        	
        	int k=Integer.parseInt(ent[1]), p = Integer.parseInt(ent[2]), n= Integer.parseInt(ent[0]);
        	
        	while(p-- >0){
        		k++;
        		if(k>n){
        			k=k-n;
        		}
        	}
        	sb.append("Case ").append(i+1).append(": ").append(k).append("\n");
        }
        		
        
        System.out.print(sb);
    }
}