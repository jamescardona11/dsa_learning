/**
 * @author James
 * 
 * "\n"
 */

import java.io.*;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.*;

public class Main {
	public static int[] dx = {2,2,-2,-2,1,1,-1,-1};
	public static int[] dy = {1,-1,1,-1,2,-2,2,-2};
	public static int mov;
	public static void main(String[] args) throws Exception {
		// 1 -------Definición de variables para la lectura
		BufferedReader br;
		File archivo = new File("entrada.txt");
		if(archivo.exists()) br = new BufferedReader(new FileReader(archivo));
		else br = new BufferedReader(new InputStreamReader(System.in));

		// -------------Inicio Algoritmo
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		String ent;
		
		while ((ent=br.readLine()) != null) {
			sb.append("To get from ");
			st = new StringTokenizer(ent);
			String temp = st.nextToken();
			sb.append(temp).append(" to ");
			int a = temp.charAt(0) - 'a';
			int b = temp.charAt(1) - '1';
			temp = st.nextToken();
			sb.append(temp).append(" takes ");
			int c = temp.charAt(0) - 'a';
			int d = temp.charAt(1) - '1';
			BFS(a, b, c, d);
			sb.append(mov).append(" knight moves.\n");
		}
		System.out.print(sb);
	}
	static boolean isvalid(int x, int y) {
		return (x < 8 && y < 8 && x >= 0 && y >= 0);
	}
	static void BFS(int x, int y, int c, int d){
		Queue<Integer> q = new ArrayDeque<Integer>();
		int[][] M = new int[8][8];
		M[x][y] = 1; // visitado
		
		q.add(x);
		q.add(y);
		q.add(0);
		mov = 0;
		while(!q.isEmpty()){
			int u = q.poll(), v = q.poll(), moves = q.poll();
			if(u == c && v == d){
				mov = moves;
				return;
			}
			else{
				
				for (int i = 0; i < 8; i++) {
					int nx = u + dx[i];
					int ny = v + dy[i];
					if(isvalid(nx, ny) && M[nx][ny] == 0){
						q.add(nx);
						q.add(ny);
						q.add(moves+1);
						
						//System.out.println("con nx "+x+"  "+mov);
						M[nx][ny] = 1;
					}
				}
			}
		}
		
	}
}