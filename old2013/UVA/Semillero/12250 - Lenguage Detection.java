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
        TreeMap<String, String> tm = new TreeMap<String, String>();
        tm.put("HOLA", "SPANISH");
        tm.put("HELLO", "ENGLISH");
        tm.put("HALLO", "GERMAN");
        tm.put("BONJOUR", "FRENCH");
        tm.put("CIAO", "ITALIAN");
        tm.put("ZDRAVSTVUJTE", "RUSSIAN");
        
        String ent;
        StringBuilder sb = new StringBuilder();
        int i=1, l=0;
        while((ent=br.readLine()) != null){
        	
        	if(ent.contains("#") == true){
        		break;
        	}
        		
        	if(tm.get(ent) != null){
        		sb.append("Case "+ i +": "+ tm.get(ent)+ "\n");
        	}else{
        		sb.append("Case "+ i +": " +"UNKNOWN" + "\n");
        	}
        		i++;
        		l=1;
        	
        }
        System.out.print(sb);
    }
}