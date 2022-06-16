/**
 * @author James
 * 
 * "\n"
 */

import java.io.*;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.*;
import java.util.Map.Entry;

public class Main {
	static int[][] M;
	static int salida, n,m;
	static int[] dx = {0, 0, 1, -1};
	static int[] dy = {1, -1, 0, 0};
	public static void main(String[] args) throws Exception {
		// 1 -------Definición de variables para la lectura
		BufferedReader br;
		File archivo = new File("entrada.txt");
		if (archivo.exists())
			br = new BufferedReader(new FileReader(archivo));
		else
			br = new BufferedReader(new InputStreamReader(System.in));

		// -------------Inicio Algoritmo
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		String ent;
		while((ent=br.readLine()) !=null) {
			st = new StringTokenizer(ent);
			n = Integer.parseInt(st.nextToken());
			m = Integer.parseInt(st.nextToken());
			if(n==0) break;
			M = new int[n][m];
			int r = Integer.parseInt(br.readLine());
			for (int i = 0; i < r; i++) {
				st = new StringTokenizer(br.readLine());
				Integer k = Integer.parseInt(st.nextToken());
				st.nextToken();
				while(st.hasMoreElements()){
					int l = Integer.parseInt(st.nextToken());
					M[k][l] = 1;
				}
			}
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine());
			int c = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
			BFS(a,b,c,d);
			sb.append(salida).append("\n");
			
		}
		System.out.print(sb);
	}

	static void BFS(int a, int b, int c, int d) {
		Queue<Integer> q = new ArrayDeque<Integer>();
		Queue<Integer> cantidad = new ArrayDeque<Integer>();
		salida = 0;
		q.add(a);
		q.add(b);
		cantidad.add(0);
		while (!q.isEmpty()) {
			int u = q.poll(), v = q.poll(), cant = cantidad.poll();
			if(u == c && v == d){
				salida = cant;
				return;
			}else{
				for(int i = 0; i< 4; i++){
					int x = u + dx[i];
					int y = v + dy[i];
					if(isvalid(x, y) && M[x][y] == 0){
						q.add(x);
						q.add(y);
						cantidad.add(cant+1);
						M[x][y] = 1;
					}
				}
			}
		}

	}
	static boolean isvalid(int x, int y) {
		return (x < n && y < m && x >= 0 && y >= 0);
	}
}