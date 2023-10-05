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
        
        HashMap<Character, Integer> hm = llenar();
        StringBuilder sb = new StringBuilder(); 
        String ent;
        int n=0;
        while((ent=br.readLine())!= null){
        	n= ent.length();
        	for(int i=0; i < n; i++){
        		char c=ent.charAt(i);
        		if(hm.containsKey(c)) sb.append(hm.get(c));
        		else sb.append(c);
        	}
        	sb.append("\n");
        }
        
        System.out.print(sb);
    }
    public static HashMap<Character, Integer> llenar(){
    	HashMap<Character, Integer> hmm = new HashMap<Character, Integer>();
    	hmm.put('1', 1);
    	hmm.put('0', 0);
    	hmm.put('A', 2);
    	hmm.put('B', 2);
    	hmm.put('C', 2);
    	hmm.put('D', 3);
    	hmm.put('E', 3);
    	hmm.put('F', 3);
    	hmm.put('G', 4);
    	hmm.put('H', 4);
    	hmm.put('I', 4);
    	hmm.put('J', 5);
    	hmm.put('K', 5);
    	hmm.put('L', 5);
    	hmm.put('M', 6);
    	hmm.put('N', 6);
    	hmm.put('O', 6);
    	hmm.put('P', 7);
    	hmm.put('Q', 7);
    	hmm.put('R', 7);
    	hmm.put('S', 7);
    	hmm.put('T', 8);
    	hmm.put('U', 8);
    	hmm.put('V', 8);
    	hmm.put('W', 9);
    	hmm.put('X', 9);
    	hmm.put('Y', 9);
    	hmm.put('Z', 9);
    		
    	return hmm;
    	
    }
}