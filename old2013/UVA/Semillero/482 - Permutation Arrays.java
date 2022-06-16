/**
 * @author James
 * 482
 * 
 */
import java.io.*;

public class Main {
	
    public static void main(String[] args) throws Exception {
        BufferedReader br;
        File archivo = new File("entrada.txt");

        if (archivo.exists()) {
            br = new BufferedReader(new FileReader(archivo));
        } else {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        //------Inicio Codigo--------
        
        StringBuilder sb = new StringBuilder();
        int c= Integer.parseInt(br.readLine());
        int l=0;
        while(c-->0){
        	if(l>0) sb.append("\n");
        	l=3;
        	br.readLine();
        	
        	String ent[] = (br.readLine()).split(" ");
        	String ent1[] = (br.readLine()).split(" ");
        	int n = ent.length;
        	String sal[] = new String[n];
        	for (int i = 0; i<n ; i++){
        		int k = Integer.parseInt(ent[i]);
        		sal[k-1] = ent1[i];
        	}
        	for(int i=0; i<n; i++){
        		sb.append(sal[i]).append("\n");
        	}
        	
        	
        }
        System.out.print(sb);
    }
}