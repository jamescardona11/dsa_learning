/**
 * @author James
 * 
 * "\n"
 */
import java.io.*;
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br;
        File archivo = new File("entrada.txt");
        if (archivo.exists()) br = new BufferedReader(new FileReader(archivo));
        else br = new BufferedReader(new InputStreamReader(System.in));

        String ent;
        StringBuilder sb = new StringBuilder();
        
        while(!(ent=br.readLine()).equals("0")){
        	int casos = Integer.parseInt(ent);
        	boolean si=true;
        	for (int i = 0; i < casos; i++) {
        		ent = br.readLine();
        		if(!ent.equals("0")){
        			if(!si && i != 0) sb.append(" ");
        			sb.append(ent);
        			si = false;
        		}
        		
			}
        	if(si) sb.append("0");
        	sb.append("\n");
        	
        }
        System.out.print(sb);
    }
}