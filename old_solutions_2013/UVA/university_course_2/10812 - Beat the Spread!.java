/**
 * @author James
 * 11689
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
        int l = Integer.parseInt(br.readLine());
        while(l-->0){
        	String s[] = (br.readLine()).split(" ");
        	int t = Integer.parseInt(s[0]), t1=Integer.parseInt(s[1]);
        	int y = Math.abs((t-t1)/2), x=Math.abs(t-y);
        	if((x+y == t) && (x-y == t1)){
        		System.out.println(Math.max(x, y) + " "+ Math.min(x, y));
        	}else{
        		System.out.println("impossible");
        	}
        }
    }
}