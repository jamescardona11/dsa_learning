/**
 * @author James
 * 
 * "\n"
 */
import java.io.*;
import java.util.*;
public class Main {
	public static int[] coins = {50, 25, 10, 5, 1};
	public static long[] ways = new long[30000+5]; 
    public static void main(String[] args) throws Exception {
        BufferedReader br;
        File archivo = new File("entrada.txt");
        if (archivo.exists()) br = new BufferedReader(new FileReader(archivo));
        else br = new BufferedReader(new InputStreamReader(System.in));
        
        String ent;
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        solve();
        while((ent=br.readLine()) != null){
        	int m = Integer.parseInt(ent);
        	long n = ways[m];
        	if(n != 1) sb.append("There are ").append(n).append(" ways to produce ").append(m).append(" cents change.\n");
        	else sb.append("There is only 1 way to produce ").append(m).append(" cents change.\n");
        }
        System.out.print(sb);
    }
    public static void solve(){
    	ways[0] = 1;
    	int taken;
    	for (int i = 0; i < 5; i++) {
    		taken = coins[i];
			for (int k = taken; k < 30005; k++) {
				ways[k] += ways[k-taken];
			}
		}
    }
}
