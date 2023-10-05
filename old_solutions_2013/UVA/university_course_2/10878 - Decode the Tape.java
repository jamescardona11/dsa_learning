/**
 * @author James
 * 10878 
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
        
        String ent;
        StringBuilder sb = new StringBuilder(), sal=new StringBuilder();
        char k;
        while((ent=br.readLine()) != null){
        	int n = ent.length();
        	for (int i =0; i< n; i++){
        		k=ent.charAt(i);
        		if(k == 'o'){
        			sal.append(1);
        		}else if(k== ' '){
        			sal.append(0);
        		}
        	}
        	int In=0;
        	if(sal!=""){
        		In = Integer.parseInt(sal,2);
        		sb.append((char)In);
        	}
        		
        	sal="";
        }
        System.out.print(sb);
    }
}