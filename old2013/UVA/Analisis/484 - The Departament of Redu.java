/**
 * @author James
 * 
 * "\n"
 */
import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	
	
    public static void main(String[] args) throws Exception {
        /*// 1 -------Definición de variables para la lectura
    	BufferedReader br;
        File archivo = new File("entrada.txt");
        if (archivo.exists()) {
            br = new BufferedReader(new FileReader(archivo));
        } else {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        //*/
        // 2 -------Definición de variables para la lectura
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
        int ent;
        LinkedHashMap<Integer, Integer> lhm = new LinkedHashMap<Integer, Integer>();
        while(sc.hasNext()){
        	ent = sc.nextInt();
        	
        	if(lhm.containsKey(ent)){
        		int x=lhm.get(ent)+1;
        		lhm.put(ent, x);
        	}else{
        		lhm.put(ent, 1);
        	}
        }
        for(Map.Entry<Integer,Integer> data: lhm.entrySet()){
        	sb.append(data.getKey()).append(" ").append(data.getValue()).append("\n");
        	
        }
        System.out.print(sb);
    }
}