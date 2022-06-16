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
        //*/
        /*// 2 -------Definición de variables para la lectura
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
        int n=Integer.parseInt(br.readLine());
        String ent;
        while(n-- >0){
        	ent=br.readLine();
        	int cc=0;
        	if(ent.length() == 5){
        		sb.append("3\n");
        	}else{
        		if(ent.charAt(0) == 'o' || ent.charAt(1) == 'n') cc++;
        		if(ent.charAt(0) == 'o' || ent.charAt(2) == 'e') cc++;
        		if(ent.charAt(1) == 'n' || ent.charAt(2) == 'e') cc++;
        		
        		if(cc>2)sb.append("1\n");
        		else sb.append("2\n");
        	}
        }
        System.out.print(sb);
    }
}