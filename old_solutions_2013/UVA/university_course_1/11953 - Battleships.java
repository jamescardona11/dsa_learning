/**
 * @author James
 * 
 * "\n"
 */
import java.io.*;
import java.util.*;

public class Main {

	static char M[][];
	static int dx[] = { 0, 1, 0, -1 }, dy[] = { -1, 0, 1, 0 }, sum, n;
	static boolean b = false;

	static void DFS(int index1, int index2) {
		M[index1][index2] = '.';
		int x, y;
		for (int k = 0; k < 4; k++) {
			x = index1 + dx[k];
			y = index2 + dy[k];
			if ( isvalid(x, y) && (M[x][y] != '.')) {
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
			n = Integer.parseInt(br.readLine());
			M = new char[n][n];

			for (int j = 0; j < n; j++)
				M[j] = br.readLine().toCharArray();

			int max = 0;
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < n; k++) {
					if (M[j][k] == 'x') {
						DFS(j, k);
						max ++;
					}
				}
			}
			sb.append("Case ").append(i + 1).append(": ").append(max).append("\n");
		}
		System.out.print(sb);
	}
}
