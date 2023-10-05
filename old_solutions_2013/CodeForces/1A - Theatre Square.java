import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;
public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
		StringTokenizer st = new StringTokenizer(br.readLine());
	    int n = Integer.parseInt(st.nextToken());
	    int m = Integer.parseInt(st.nextToken());
	    int a = Integer.parseInt(st.nextToken());
	    n = (int)Math.ceil(1.0*n/a);
	    m = (int)Math.ceil(1.0*m/a);
	    BigInteger b1 = new BigInteger(String.valueOf(n));
	    b1 = b1.multiply(new BigInteger(String.valueOf(m)));
	        
	    System.out.println(b1);
	        
	}
}
