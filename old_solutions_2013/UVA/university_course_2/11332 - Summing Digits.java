/**
 * @author James
 * 11332 
 * 
 */
import java.io.*;
public class Main {
	
	static long valor(long n){
		if(n<9){
			return n;
		}else{
			return n%10 + valor(n/10);
		}
	}
	
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
        long l = Integer.parseInt(br.readLine());
        while(l != 0){
        	while(l > 9){
        		l= valor(l);
        	}
        	System.out.println(l);
        	l = Integer.parseInt(br.readLine());
        }
    }
}