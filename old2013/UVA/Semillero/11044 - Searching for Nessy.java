/**
 * @author James
 * 11044 - Searching for Nessy
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
        int ent=Integer.parseInt(br.readLine());
        
        while(ent-->0){
        	String s[] = (br.readLine()).split(" ");
        	int n = (int)Math.ceil((Integer.parseInt(s[0])-2)/3.0);
        	int m =(int) Math.ceil((Integer.parseInt(s[1])-2)/3.0);
        	System.out.println (n *m );
        }
        
    }
}