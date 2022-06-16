/**
 * @author James
 * 10071 
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
        //--------------
        String ent;
        while((ent=br.readLine()) != null){
        	String s[] = ent.split(" ");
        	int n1 = Integer.parseInt(s[0]),n2 = Integer.parseInt(s[1]); 
        	System.out.println(n1*(2*n2));
        }
    }
}