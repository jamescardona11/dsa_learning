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
        StringTokenizer st;
        int casos = Integer.parseInt(br.readLine());
        while(casos-- > 0){
        	int n = Integer.parseInt(br.readLine());
        	int[] precio = new int[n+1], peso = new int[n+1];
        	for (int i = 1; i <= n; i++) {
        		st= new StringTokenizer(br.readLine());
				precio[i] = Integer.parseInt(st.nextToken());
				peso[i] = Integer.parseInt(st.nextToken());
			}
        	
        	int sum = 0;
        	int m = Integer.parseInt(br.readLine());
        	for(int p=0; p<m; p++){
        		int R = Integer.parseInt(br.readLine());
        		int[][] A = new int[n+1][R+1];
        		for (int i = 1; i <= n; i++) {
        			for (int k = 1; k <= R; k++) {
        				int op1 = A[i-1][k], op2 = Integer.MIN_VALUE;
        				if (peso[i] <= k) op2 = precio[i] + A[i-1][k-peso[i]];
        				A[i][k] = Math.max(op1,op2);
        			}
        		}
        		sum += A[n][R];
        	}
        	sb.append(sum).append("\n");
        }
        System.out.print(sb);
    }

}
