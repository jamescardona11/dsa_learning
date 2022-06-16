/**
 * @author James
 * 
 * "\n"
 */
import java.io.*;

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
        
        while ((ent=br.readLine()) != null){
        	ent.trim();
        	StringBuilder salida = new StringBuilder(ent).reverse();
        	int nn = ent.length(), mitad = nn/2;
        	boolean espejito=true;
        	//System.out.println("entrad"+ent+"---salida"+salida);
        	if(nn % 2 != 0){
        		espejito = espejo(ent.charAt(mitad), ent.charAt(mitad));
        	}
        	
        	if(espejito){
        		for(int j = 0; j <= mitad-1 ; j++){
            		if(! espejo(ent.charAt(j), ent.charAt(nn-j-1)) ){
            			espejito = false;
            			break;
            		}
            	}
        	}
        	
        	sb.append(ent);
        	if(salida.toString().equals(ent)){
        		if(espejito){
        			sb.append(" -- is a mirrored palindrome.\n");
        		}else{
        			sb.append(" -- is a regular palindrome.\n"); 
        		}
        	}else{
        		if(espejito){
        			sb.append(" -- is a mirrored string.\n");
        		}else{
        			sb.append(" -- is not a palindrome.\n");
        		}
        	}
        	sb.append("\n");
        	
        }
        System.out.print(sb);
    }
    public static boolean espejo(char x, char y){
    	if(x == 'A' && y == 'A'){
    		return true;
    	}else if(x == 'H' && y == 'H'){
    		return true;
    	}else if(x == 'I' && y == 'I'){
    		return true;
    	}else if(x == 'M' && y == 'M'){
    		return true;
    	}else if(x == 'T' && y == 'T'){
    		return true;
    	}else if(x == 'U' && y == 'U'){
    		return true;
    	}else if((x == 'O' && y == 'O') || (x == '0' && y == 'O')){
    		return true;
    	}else if((x == '0' && y == '0') || (x =='O' && y =='0')){
    		return true;
    	}else if(x == 'V' && y == 'V'){
    		return true;
    	}else if(x == 'W' && y == 'W'){
    		return true;
    	}else if(x == 'X' && y == 'X'){
    		return true;
    	}else if(x == 'Y' && y == 'Y'){
    		return true;
    	}else if(x == '1' && y == '1'){
    		return true;
    	}else if(x == '8' && y == '8'){
    		return true;
    	}else if((x == '2' && y == 'S') || (x == 'S' && y == '2')){
    		return true;
    	}else if((x == '3' && y == 'E') || (x == 'E' && y == '3')){
    		return true;
    	}else if((x == '5' && y == 'Z') || (x == 'Z' && y == '5')){
    		return true;
    	}else if((x == 'J' && y == 'L') || (x == 'L' && y == 'J')){
    		return true;
    	}
        
    	return false;
    }
    
}