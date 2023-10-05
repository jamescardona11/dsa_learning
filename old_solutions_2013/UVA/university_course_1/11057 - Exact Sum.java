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
		String ent = br.readLine();

		while ((ent) != null) {
			int n= Integer.parseInt(ent);
			StringTokenizer st = new StringTokenizer(br.readLine());
			int valor = Integer.parseInt(br.readLine()), i=-1, v[] = new int[n];
			int dif=valor, m1=0, m2=0;
			
			while(st.hasMoreElements()) {
				v[++i] = Integer.parseInt(st.nextToken());
			}
			br.readLine();
			ent = br.readLine();
			Arrays.sort(v);
			
			for(int j =0 ; j<n ; j++){
				int restante= valor- v[j];
				if(dif > (restante-v[j])){
					if(Arrays.binarySearch(v, j+1, n, restante) > 0){
					m1=v[j];
					m2=restante;
					dif = restante-m1;
					}
				}
			}
			sb.append("Peter should buy books whose prices are ").append(m1).append(" and ").append(m2).append(".\n\n");
			//System.out.println(m1 + "  --  "+m2);
			
			
		}
		System.out.print(sb);
	}

}