/**
 * @author James
 * 
 * "\n"
 */
import java.io.*;
import java.util.*;

public class Main {

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

		int n = Integer.parseInt(br.readLine()), v[] = new int[n];
		StringTokenizer st_1 = new StringTokenizer(br.readLine());
		int n1 = Integer.parseInt(br.readLine());
		StringTokenizer st_2 = new StringTokenizer(br.readLine());
		int i = -1;

		while (st_1.hasMoreElements())
			v[++i] = Integer.parseInt(st_1.nextToken());

		while (st_2.hasMoreElements()) {
			int b = Integer.parseInt(st_2.nextToken());
			int enc[] = busquedabinaria(v, b);

			if (enc[0] < 0) {
				if (enc[1] == n - 1) {
					sb.append(v[enc[1]]).append(" X");
				} else {
					int num = v[enc[1]];
					if (num > b && enc[1] - 1 > 0) {
						sb.append(v[enc[1] - 1]).append(" ").append(num);
					} else if (num < b && enc[1] + 1 < n) {
						sb.append(num).append(" ").append(v[enc[1] + 1]);
					} else if (num > b && enc[1] - 1 < 0) {
						sb.append(num).append(" X");
					} else if (num < b && enc[1] + 1 > n) {
						sb.append("X ").append(num);
					}
				}
			} else if (v[enc[0] - 1] == v[enc[0]] || v[enc[0] + 1] == v[enc[0]]) {
				boolean bandera = false;
				String s1 = "", s2 = "";
				
				if (v[enc[0] - 1] == v[enc[0]]) {
					for (int k = enc[0] - 2; k > 0; k--) {
						if (v[k] != v[enc[0]]) {
							s1 =""+ v[k];
							bandera = true;
							break;
						}
					}
				}
				s1= (!bandera)? "X": s1;
				bandera = false;

				if (v[enc[0] + 1] == v[enc[0]]) {
					for (int k = enc[0] + 2; k < n; k++) {
						if (v[k] != v[enc[0]]) {
							s2 = ""+ v[k];
							bandera = true;
							break;
						}
					}
				}
				s2= (!bandera)? "X": s2;
				sb.append(s1).append(" ").append(s2);
				
			} else {
				sb.append(v[enc[0] -1]).append(" ").append(v[enc[0] + 1]);
			}
			sb.append("\n");
		}// */
		System.out.print(sb);
	}

	public static int[] busquedabinaria(int v[], int b) {
		int n = v.length, li = 0, ls = n;
		int uc = (ls + li) / 2;
		while (li <= ls) {
			int centro = (ls + li) / 2, valor = v[centro];

			if (valor == b) {
				return new int[] { centro, uc };
			} else {
				if (valor > b) {
					ls = centro - 1;
				} else {
					li = centro + 1;
				}
			}
			li = (li >= n) ? ls + 1 : li;
			// if (v[uc] != valor)
			uc = centro;
		}
		return new int[] { -1, uc };
	}
}