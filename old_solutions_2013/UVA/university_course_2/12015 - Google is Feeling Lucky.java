/**
 * @author James
 * 11689
 * 
 */
import java.io.*;
import java.util.Iterator;
import java.util.LinkedHashSet;

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
        
        int l = Integer.parseInt(br.readLine());
        for(int j =0; j<l; j++){
        	LinkedHashSet<String> hs = new LinkedHashSet<String>();
        	String ent[] =(br.readLine()).split(" ");
        	int max= Integer.parseInt(ent[1]);
        	hs.add(ent[0]);
        	for(int i=1;i<10;i++){
        		ent =(br.readLine()).split(" ");

        		if(Integer.parseInt(ent[1]) > max){
        			hs.clear();
        			hs.add(ent[0]);
        			max=Integer.parseInt(ent[1]);
        		}else if(Integer.parseInt(ent[1]) == max){
        			hs.add(ent[0]);
        		}
        	}
        	int c=j+1;
        	System.out.println("Case #"+ c +":");
        	for(Iterator<String> it=hs.iterator(); it.hasNext();){
        		System.out.println(it.next());
        	}
        	//
        }
    }
}