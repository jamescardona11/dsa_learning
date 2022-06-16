/**
 * @author James
 * 
 * "\n"
 */
import java.io.*;
import java.util.*;

public class Main {

	static char M[][], caracter, nocaracter;
	static int dx[] = {-1,0,1,0}, dy[] = {0,1,0,-1}, m, n, sum;

	static void DFS(int index1, int index2) {
		M[index1][index2] = nocaracter;
		int x, y;	
		for (int k = 0; k < 4; k++) {
			x = index1 + dx[k];
			y = (index2 + dy[k]+m)%m;
			if ( isvalid(x, y) && (M[x][y] == caracter)) {
				sum++;
				DFS(x, y);
			}
		}
	}
	static boolean isvalid(int x, int y) {
		return (x < n && y < m && x >= 0 && y >= 0);
	}

	public static void main(String[] args) throws Exception {
		// 1 -------Definición de variables para la lectura
		BufferedReader br;
		File archivo = new File("entrada.txt");
		if (archivo.exists()) {
			br = new BufferedReader(new FileReader(archivo));
		} else {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		// -------------Inicio Algoritmo
		StringBuilder sb = new StringBuilder();

		String ent;
		while ((ent = br.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(ent);
			n = Integer.parseInt(st.nextToken());
			m = Integer.parseInt(st.nextToken());
			M = new char[n][m];
			
			M[0] = br.readLine().toCharArray();
			for (int j = 1; j < n; j++)
				M[j] = br.readLine().toCharArray();
			
			st = new StringTokenizer(br.readLine());
			int v =Integer.parseInt(st.nextToken()), v1= Integer.parseInt(st.nextToken());
			int f = M[v][v1];
			caracter = (char)f;
			f++;
			nocaracter = (char)f;
			
			DFS(v, v1);
			
			int max = 0;
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < m; k++) {
					if (M[j][k] == caracter) {
						sum=1;
						DFS(j, k);
						max =Math.max(sum, max);
					}
				}
			}
			sb.append(max).append("\n");
			br.readLine();
		}
		System.out.print(sb);
	}
}
