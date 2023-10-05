/**
 * @author James
 * "\n"
 */
import java.io.*;
import java.util.*;

public class Main {
	
	
    public static void main(String[] args) throws Exception {
    	BufferedReader br;
        File archivo = new File("entrada.txt");
        if (archivo.exists()) br = new BufferedReader(new FileReader(archivo));
        else br = new BufferedReader(new InputStreamReader(System.in));
        
        StringBuilder sb = new StringBuilder(); 
        String ent;
        
        while((ent = br.readLine()) != null){
        	if(ent.equals("0")) break;
        	int n= Integer.parseInt(ent);
        	int[] salidas = new int[n], llegadas = new int[n];
        	for (int i = 0; i < n; i++) {
        		StringTokenizer st = new StringTokenizer(br.readLine());
        		salidas[i] = Integer.parseInt(st.nextToken());
        		llegadas[i] = Integer.parseInt(st.nextToken());
			}
        	Arrays.sort(salidas);
        	Arrays.sort(llegadas);
        	boolean yes=true;
        	for (int i = 0; i < n && yes; i++) {
				if(salidas[i] != llegadas[i]) yes=false;
			}
        	if(yes) sb.append("YES\n");
        	else sb.append("NO\n");
        }
        //System.out.println("suma_>"+suma);
        System.out.print(sb);
    }
}