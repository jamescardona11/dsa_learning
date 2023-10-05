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
        	int n = Integer.parseInt(br.readLine()), sum =0;
        	int[] coins = new int[n+1];
        	st= new StringTokenizer(br.readLine());
        	6hfor (int i = 1; i <= n; i++) {
				coins[i] = Integer.parseInt(st.nextToken());
				sum+= coins[i];
			}
        	int[][] A = new int[n+1][sum+1];
        	for (int i = 1; i <= n; i++) {
				for (int k = 1; k <= sum; k++) {
					int op1 = A[i-1][k], op2 = Integer.MIN_VALUE;
					if (coins[i] <= k) op2 = coins[i] + A[i-1][k-coins[i]];
					A[i][k] = Math.max(op1,op2);
				}
			}	
        	
        	int res = Integer.MAX_VALUE;
            for (int i = 0; i <= sum; ++i)
                res = Math.min(res, Math.abs((sum - A[n][i]) - A[n][i]));
            System.out.println(res);
        }
        //System.out.print(sb);
    }

}
x|