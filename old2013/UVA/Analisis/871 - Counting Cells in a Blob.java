/**
 * @author James
 * 
 * "\n"
 */
import java.io.*;
import java.util.*;

public class Main {

	static char M[][];
	static int dx[] = { 0, 1, 1, 1, 0, -1, -1, -1 }, dy[] = { -1, -1, 0, 1, 1,
			1, 0, -1 }, m, n, sum;

	static void DFS(int index1, int index2) {
		M[index1][index2] = 0;
		int x, y;
		for (int k = 0; k < 8; k++) {
			x = index1 + dx[k];
			y = index2 + dy[k];
			if (isvalid(x, y) && M[x][y] == '1') {
				sum++;
				DFS(x, y);
			}
		}
	}

	static boolean isvalid(int x, int y) {
		return (x < n && y < n && x >= 0 && y >= 0);
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

		int casos = Integer.parseInt(br.readLine());
		for (int i = 0; i < casos; i++) {
			br.readLine();
			String ent = br.readLine();
			n = ent.length();
			M = new char[n][n];
			M[0] = ent.toCharArray();
			for (int j = 1; j < n; j++)
				M[j] = br.readLine().toCharArray();

			int max = Integer.MIN_VALUE;
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < n; k++) {
					if (M[j][k] == '1') {
						sum = 1;
						DFS(j, k);
						max = Math.max(max, sum);
					}
				}
			}
			if(i != 0)
				sb.append("\n");
			if(max >0){
				sb.append(max).append("\n");
			}else{
				sb.append(0).append("\n");
			}
			
			
		}
		System.out.print(sb);
	}
}
