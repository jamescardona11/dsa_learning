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
        int n=0;
        while((ent=br.readLine())!= null){
        	sb.append(ent).append("\n");
        }
        System.out.print(sb);
    }
}