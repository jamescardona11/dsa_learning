/**
 * @author James
 * 
 * "\n"
 */
import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static String respuesta;
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
        while ((ent=br.readLine()) != null) {
        	StringTokenizer st = new StringTokenizer(ent);
        	String num1 = st.nextToken(), num2=st.nextToken();
        	int n1=Integer.parseInt(num1), n2 =Integer.parseInt(num2);
        	if(n1 == n2 && n1==1) break;
        	
        	respuesta="";
        	busquedabinaria(n1,n2);
        	sb.append(respuesta).append("\n");
        }
		System.out.print(sb);
	}
	public static void busquedabinaria(int n1, int n2) {
		
		int numerador = 1, denominador = 1;
		int izqNumerador = 0,izqDenominador = 1, derNumerador=1,derDenominador=0;
		
		while (!(n1==numerador && n2==denominador)){
			if (n2*numerador > n1*denominador) {
				respuesta += "L";
				derNumerador=numerador;
				derDenominador= denominador;
			} else{
				respuesta += "R";
				
				izqNumerador= numerador;
				izqDenominador= denominador;
			}
			numerador = izqNumerador + derNumerador;
			denominador = izqDenominador + derDenominador;
			
		}

	}
}