/**
 * @author James
 * 
 * "\n"
 */
import java.io.*;
import java.util.*;
public class Main {

    public static <T> void main(String[] args) throws Exception {
        BufferedReader br;
        File archivo = new File("entrada.txt");
        if (archivo.exists()) br = new BufferedReader(new FileReader(archivo));
        else br = new BufferedReader(new InputStreamReader(System.in));
        
        
        int casos = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        br.readLine();
        for (int c = 0; c < casos; c++) {
			
        	int n = Integer.parseInt(br.readLine());
        	double[][] vec = new double[n][n];
        	for (int i = 0; i < n; i++) {
        		st = new StringTokenizer(br.readLine());
        		int t = Integer.parseInt(st.nextToken()), s = Integer.parseInt(st.nextToken());
				vec[i] = new double[]{1.*s/t, i+1};
			}
        	Arrays.sort(vec, new Comparator<double[]>() {
				public int compare(double[] o1, double[] o2) {
					if(o1[0] != o2[0]) return (o2[0] < o1[0]) ? -1 : 1;
					return (""+o1[1]).compareTo(""+o2[1]);
				}
			});
        	for (int i = 0; i < n; i++) {
				if(i!=0) sb.append(" ");
        		sb.append((int)vec[i][1]);
			}
        	br.readLine();
        	sb.append("\n");
        	if(c<casos-1) sb.append("\n");
        }
        System.out.print(sb);
    }
}
