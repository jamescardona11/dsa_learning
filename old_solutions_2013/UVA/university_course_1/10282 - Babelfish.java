/**
 * @author James
 * 
 * "\n"
 */
import java.io.*;
import java.util.*;

public class Main {
	
	
    public static void main(String[] args) throws Exception {
        // 1 -------Definición de variables para la lectura
    	BufferedReader br;
        File archivo = new File("entrada.txt");
        if (archivo.exists()) {
            br = new BufferedReader(new FileReader(archivo));
        } else {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        //*/
        /*// 2 -------Definición de variables para la lectura
        Scanner sc;
        File archivo1 = new File("entrada.txt");

        if (archivo1.exists()) {
            sc = new Scanner(new FileReader(archivo1));
        } else {
            sc = new Scanner((System.in));
        }
        //*/
        //-------------Inicio Algoritmo
        
        StringBuilder sb = new StringBuilder();        
        String ent=br.readLine(), aux;
        HashMap<String, String> hm = new HashMap<String, String>();
        boolean bandera = true;
        while((ent)!= null){
        	//System.out.println(ent);
        	if(bandera){
        		StringTokenizer st = new StringTokenizer(ent);
        		aux=st.nextToken();
        		hm.put(st.nextToken(), aux);
        	}else{
        		if(hm.containsKey(ent)){
        			sb.append(hm.get(ent)).append("\n");
        		}else{
        			sb.append("eh\n");
        		}
        	}
        	ent=br.readLine();
        	if(bandera == true && ent.equals("") == true){
        		bandera= false;
        		ent=br.readLine();
        	}
        }
        
        System.out.print(sb);
    }
}