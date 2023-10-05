/**
 * @author James
 * "\n"
 */
import java.io.*;
import java.util.*;

public class Main {
	
	public static int[] vec;
	public static int[] dp;
    public static void main(String[] args) throws Exception {
    	Scanner in = new Scanner(System.in);
    	/*BufferedReader br;
        File archivo = new File("entrada.txt");
        if (archivo.exists()) br = new BufferedReader(new FileReader(archivo));
        else br = new BufferedReader(new InputStreamReader(System.in));*/
        
        int n;
        StringBuilder sb = new StringBuilder(); 
        
        while((n = in.nextInt()) != 0){
        	vec = new int[10000 + 10];
        	dp = new int[10000 + 10];
        	for (int i = 0; i < n; i++) {
				vec[i] = in.nextInt();
			}
        	
        	long best = -1;
        	for (int k = 1; k < n; k++) {
        		dp[k] =vec[k];
        		if(dp[k-1]+vec[k] > vec[k]) dp[k] =dp[k-1]+vec[k];
    		}
        	for (int k = 1; k < n; k++) {
        		if(dp[k]>best) best = dp[k];
        	}
        	if(best>0) sb.append("The maximum winning streak is ").append(best).append(".\n");
        	else sb.append("Losing streak.\n");
        }
        System.out.print(sb);
    }
    
}