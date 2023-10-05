/**
 * @author James
 * 902
 * 
 */
import java.io.*;
import java.util.*;

public class Main {
	
    public static void main(String[] args) throws Exception {
        Scanner sc;
        File archivo = new File("entrada.txt");

        if (archivo.exists()) {
            sc = new Scanner(new FileReader(archivo));
        } else {
            sc = new Scanner(System.in);
        }
        //------Inicio Codigo--------
        
        StringBuilder sb = new StringBuilder();
        while(sc.hasNext()){
        
        	HashMap<String, Integer> tm = new HashMap<String, Integer>();
        	
        	int c = sc.nextInt();
        	String str=sc.next(),StMax="";
        	int n = str.length(), freqMx=1;
        	
        	for(int i=0; i<n-c; i++){
        		StringBuilder sbt = new StringBuilder(str.substring(i, i+c));
        		
        		if(tm.containsKey( sbt.toString() )){
        			int km= tm.get(sbt.toString()) + 1 ;
        			tm.put(sbt.toString(),  km);
        			if(km>freqMx){
        				StMax =sbt.toString();
        				freqMx=km;
        			}
        		}else{
        			tm.put(sbt.toString(), 1);
        		}
        	}
        	
        	sb.append(StMax).append("\n");
        }
        System.out.print(sb);
    }
}