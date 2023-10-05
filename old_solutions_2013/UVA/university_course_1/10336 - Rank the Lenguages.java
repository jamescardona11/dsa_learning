/**
 * @author James
 * 
 * "\n"
 */
import java.io.*;
import java.util.*;

public class Main {

	static char M[][];
	static int dx[] = { 0, 1, 0, -1, }, 
			   dy[] = { -1,  0, 1, 0, }, m, n;

	static void DFS(int index1, int index2, char z) {
		M[index1][index2] = '-';
		int x, y;
		for (int k = 0; k < 4; k++) {
			x = index1 + dx[k];
			y = index2 + dy[k];
			if (isvalid(x, y) && M[x][y] == z) {
				DFS(x, y, z);
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
		int casos = Integer.parseInt(br.readLine());
		for (int c = 0; c < casos; c++) {
			combinacion[] vector = new combinacion[26];
			for(int i=0; i< 26; i++){
				vector[i] = new combinacion('.', 0);
			}

			StringTokenizer st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
			m = Integer.parseInt(st.nextToken());
			M = new char[n][m];

			for (int i = 0; i < n; i++) {
				ent = br.readLine();
				for (int j = 0; j < m; j++) {
					M[i][j] = ent.charAt(j);
				}
			}//o tambien
			/*
			M[0] = br.readLine().toCharArray();
			for (int i = 1; i < n; i++) {
					M[i] = br.readLine().toCharArray();
			}
			*/
			
			int toindex=0;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					char car = M[i][j];
					if (car != '-') {
						if (vector[car-'a'].valor == 0){
							vector[car-'a'] = new combinacion(car, 1);
							toindex++;
						}
						else{
							vector[car-'a'].valor +=1;
						}
						DFS(i, j, car);
					}
				}
			}
			Arrays.sort(vector);
			sb.append("World #").append(c+1).append("\n");
			for (int i=0; i< toindex; i++){
				sb.append(vector[i].letra).append(": ").append(vector[i].valor).append("\n");
			}
		}
		System.out.print(sb);
	}
}
class combinacion implements Comparable<combinacion>{
	char letra;
	int valor;
	
	public combinacion(char letra, int valor) {
		this.letra = letra;
		this.valor = valor;
	}
	@Override
	public int compareTo(combinacion o) {
		// TODO Auto-generated method stub
		if(this.valor > o.valor){
			return -1;
		}else if(valor < o.valor){
			return 1;
		}else{
			if(this.letra < o.letra){
				return -1;
			}else if(this.letra > o.letra){
				return 1;
			}else{
				return 0;
			}
		}
	}
	
}