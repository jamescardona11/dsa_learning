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
        	BigInteger A = new BigInteger(st.nextToken());
        	String operador = st.nextToken();
        	BigInteger B = new BigInteger(st.nextToken());
        	BigInteger bi = BigInteger.ZERO;
        	if(operador.equals("%")){
        		bi=A.mod(B);
        	}else{
        		bi=A.divide(B);
        	}
        	
        	sb.append(bi).append("\n");
		}
		System.out.print(sb);
	}
}
