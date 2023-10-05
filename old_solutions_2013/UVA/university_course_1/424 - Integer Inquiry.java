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
        String ent=br.readLine();
        BigInteger bi = BigInteger.ZERO;
        while(ent != null){
        	BigInteger b2 = new BigInteger(ent);
        	bi = bi.add(b2);
        	
            ent = br.readLine();
            if(ent.equals("0")) break;
		}
		System.out.println(bi.toString());
	}
}
