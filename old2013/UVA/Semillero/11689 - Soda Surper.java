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
        	int t = Integer.parseInt(s[0])+Integer.parseInt(s[1]);
        	int z= Integer.parseInt(s[2]), c=0;
        	
        	while(t>=z){
        		c+= t/z;
        		t= (t/z)+(t%z);
        	}
        	System.out.println(c);
        }
    }
}