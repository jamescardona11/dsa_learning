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
        String ent;
        while((ent=br.readLine()) != null){
        	StringTokenizer st = new StringTokenizer(ent);
        	
        	int N = Integer.parseInt(st.nextToken());
        	BigInteger A = new BigInteger(st.nextToken());
        	BigInteger bi = BigInteger.ZERO;
        	for(int i= 1; i<= N; i++){
        		BigInteger b1 = new BigInteger(""+i);
        		bi = bi.add(b1.multiply((A.pow(i))));
        	}
        	sb.append(bi).append("\n");
		}
		System.out.print(sb);
	}
}
