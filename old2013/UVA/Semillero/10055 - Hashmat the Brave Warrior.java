/**
 * @author James
 * 10055 - Hashmat the brave warrior
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
        String ent;
        
        while((ent=br.readLine())!= null){
        	String ls[] = ent.split(" ");
        	BigInteger n1 = new BigInteger(ls[0]), n2 = new BigInteger(ls[1]), n3 = n1.subtract(n2);
        	System.out.println(n3.abs());
        }
    }
}