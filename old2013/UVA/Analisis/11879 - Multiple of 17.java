/**
 * @author James
 * 
 * "\n"
 */
import java.io.*;
import java.math.BigInteger;

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
		// -------------Inicio Algoritmo
		StringBuilder sb = new StringBuilder();
        BigInteger bi = new BigInteger("17");
        String ent=br.readLine();
        while(ent != null){
        	BigInteger b2 = new BigInteger(ent);
        	b2 = b2.mod(bi);
        	
        	if(b2.intValue() == 0){
        		sb.append("1").append("\n");
        	}else{
        		//System.out.println(b2);
        		sb.append("0").append("\n");
        	}
        	
            ent = br.readLine();
            if(ent.equals("0")) break;
		}
		System.out.print(sb);
	}
}
