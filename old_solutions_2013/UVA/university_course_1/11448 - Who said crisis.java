/**
 * @author James
 * 
 * "\n"
 */
import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

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
        int n = Integer.parseInt(br.readLine());
        //String ent=br.readLine();
        for(int i=0; i< n; i++){
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	BigInteger bi = new BigInteger(st.nextToken());
        	BigInteger b2 = new BigInteger(st.nextToken());
        	bi= bi.subtract(b2);
        	sb.append(bi).append("\n");
		}
		System.out.print(sb);
	}
}
