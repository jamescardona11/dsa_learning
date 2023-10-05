/**
 * @author James
 * 760
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
        String ent;
        
        while((ent=br.readLine()) != null){
        	
        	int n = Integer.parseInt(ent), mim =100, iM=0, sum=0;
        	if(n==0) break;
        	int v[] = new int[n];
        	for(int j =0; j<n;j++){
        		ent=br.readLine();
        		for(int i=0; i<25; i++){
        			char k= ent.charAt(i);
        			if(k == ' '){
        				v[j]= v[j]+1;
        			}
        		}
        		if(v[j] < mim){
        			mim = v[j];
        			iM=j;
        		}
        	}
        	for(int i=0; i<n; i++){
        		sum+=v[i] - v[iM];
        	}
        	sb.append(sum).append("\n");
        }
        System.out.print(sb);
    }
}