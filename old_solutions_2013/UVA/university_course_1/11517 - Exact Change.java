/**
 * @author James
 * 
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
        StringTokenizer st;
        int casos = Integer.parseInt(br.readLine());
        while(casos-- > 0){
        	int R = Integer.parseInt(br.readLine()), n = Integer.parseInt(br.readLine());
        	int[] coins = new int[n];
        	for (int i = 0; i < n; i++) {
				coins[i] = Integer.parseInt(br.readLine());
			}
        	long[]A = new long[10001];
        	Arrays.fill(A, Integer.MAX_VALUE);
        	A[0] = 0;
        	for (int i = 0; i < n; i++) {
        		int taken = coins[i];
				for (int v = 10000; v >=0; v--) {
					if(A[v] != Integer.MAX_VALUE && v+taken<=10000){
						A[v+taken] = Math.min(A[v+taken], A[v]+1);
					}
				}
			}	
        	
        	for (int j = R; j < 10001; j++) {
        		if (A[j] != Integer.MAX_VALUE) {
        			sb.append(j).append(" ").append(A[j]).append("\n");
        		break;
        		}
        	}
        }
        System.out.print(sb);
    }

}
