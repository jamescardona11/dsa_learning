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
            //-------------Inicio Algoritmo
        
        StringBuilder sb = new StringBuilder(); 
        String ent;
        
        while((ent = br.readLine()) != null){
        	String ss[] = ent.split(" ");
        	int n = Integer.parseInt(ss[0]), n1 = Integer.parseInt(ss[1]),suma=n;
        	
        	while(n >= n1){
        		if(n%n1 == 0){
        			suma += n/n1;
        			n= n/n1;
        		}else{
        			suma += n/n1;
        			n =(n%n1) +  (n/n1);
        		}
        	}
        	sb.append(suma).append("\n");
        	
        }
        
        System.out.print(sb);
    }

}