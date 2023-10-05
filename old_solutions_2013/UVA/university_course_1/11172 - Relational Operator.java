/**
 * @author James
 * 
 * "\n"
 */
import java.io.*;
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
        String ent;
        int n = sc.nextInt(), a=0,b=0;
        String salida;
        for (int i = 0; i< n; i++){
        	salida= "=";
        	a = sc.nextInt();
        	b = sc.nextInt();
        	if(a > b){
        		salida = ">";
        	}else if(a < b){
        		salida = "<";
        	}
        sb.append(salida).append("\n");
        }
        System.out.print(sb);
    }
}