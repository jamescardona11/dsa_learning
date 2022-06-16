/**
 * @author James
 * 1225
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
        String ent = br.readLine();
        StringBuilder sb = new StringBuilder();
        int n= Integer.parseInt(ent), n1;
        
        while(n-->0){
        	int v[] =new int[10];
        	ent = br.readLine();
        	n1= Integer.parseInt(ent);

        	for(int i=1;i<=n1;i++){
        		int tpm = i;
        		while(tpm>0){
        			v[tpm%10]++;
        			tpm/=10;
        		}
        	}
        	sb.append(v[0]+" "+v[1]+" "+v[2]+" "+v[3]+" "+v[4]+" "+v[5]+" "+v[6]+" "+v[7]+" "+v[8]+" "+v[9]+"\n");
			
        	
        }
        System.out.print(sb);
    }
}