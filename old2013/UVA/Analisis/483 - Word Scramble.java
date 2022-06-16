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
        String ent;
        
        while((ent=br.readLine())!= null){
        	StringTokenizer st = new StringTokenizer(ent);
        	while(st.hasMoreElements()){
        		StringBuilder salida = new StringBuilder(st.nextToken()).reverse();
        		sb.append(salida.toString());
        		if(st.hasMoreElements()){
        			sb.append(" ");
        		}
        	}
        	sb.append("\n");
        }
        
        System.out.print(sb);
    }
}