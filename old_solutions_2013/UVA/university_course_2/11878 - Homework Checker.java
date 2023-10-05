/**
 * @author James
 * 11878- Homework Checker 
 * 
 */
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br;
        File archivo = new File("entrada.txt");

        if (archivo.exists()) {
            br = new BufferedReader(new FileReader(archivo));
        } else {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        String ent;
        StringTokenizer st;
        int v[]=new int[3], c=0;
        while((ent = br.readLine())!=null){
        	int i=0;
        	if(ent.contains("?") == false){
        		if(ent.contains("+")){
        			st = new StringTokenizer(ent, "+=");
        			while(st.hasMoreElements()){
        				v[i]= Integer.parseInt(st.nextToken());
        				i++;
        			}
        			if(v[0]+v[1] == v[2]) c++;
        		}else{
        			st = new StringTokenizer(ent, "=");
        			String li=st.nextToken();
        			v[2]=Integer.parseInt(st.nextToken());
        			//System.out.println(li);
        			StringTokenizer st1= new StringTokenizer(li, "-");;
        			while(st1.hasMoreElements()){
        				v[i]= Integer.parseInt(st1.nextToken());
        				i++;
        			}//*/
        			if(v[0]-v[1] == v[2]) c++;
        		}
        	}
        }
        System.out.println(c);
    }
}