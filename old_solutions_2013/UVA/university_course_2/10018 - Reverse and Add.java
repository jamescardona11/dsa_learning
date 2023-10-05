/**
 * @author James
 * 11689
 * 
 */
import java.io.*;
import java.math.BigInteger;

public class Main {
	
	
    public static void main(String[] args) throws Exception {
        BufferedReader br;
        File archivo = new File("entrada.txt");

        if (archivo.exists()) {
            br = new BufferedReader(new FileReader(archivo));
        } else {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        //--------------
        StringBuilder ent;
        int l = Integer.parseInt(br.readLine());
        while(l-->0){
        	ent = new StringBuilder(br.readLine());
        	
        	int c=0;
        	while(true){
        		BigInteger nN =new BigInteger(ent.toString());
        		String inv = ent.reverse().toString();
                
                BigInteger nI = new BigInteger(inv);
                
        		if(nN.compareTo(nI) == 0){
        			System.out.println(c+ " "+ nI);
        			break;
        		}else{
        			nN = nN.add(nI);
        			ent = new StringBuilder(""+nN.toString());
        			c++;
        		}
        	}
        	
        }
    }
}