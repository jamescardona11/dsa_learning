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
	static HashMap<String, ArrayList<String>> hm;
	static HashMap<String, Boolean> hv;
	static String salida;

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
		
		int casos = Integer.parseInt(br.readLine());
		while(casos-- > 0) {
			br.readLine();
			st = new StringTokenizer(br.readLine());
			int m = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());
			hm = new HashMap<String, ArrayList<String>>();
			hv = new HashMap<String, Boolean>();
			for (int i = 0; i < m; i++) {
				st = new StringTokenizer(br.readLine());
				String t1 = st.nextToken();
				String t2 = st.nextToken();
				if(hm.containsKey(t1)){
					ArrayList<String> tt= hm.get(t1);
					tt.add(t2);
					hm.put(t1, tt);
				}else{
					ArrayList<String> tt = new ArrayList<String>();
					tt.add(t2);
					hm.put(t1, tt);
					hv.put(t1, false);
				}
				if(hm.containsKey(t2)){
					ArrayList<String> tt= hm.get(t2);
					tt.add(t1);
					hm.put(t2, tt);
				}else{
					ArrayList<String> tt = new ArrayList<String>();
					tt.add(t1);
					hm.put(t2, tt);
					hv.put(t2, false);
				}
				
			}
			/*for(Entry<String, ArrayList<String>> dt:hm.entrySet()){
				System.out.println("soy padre->"+dt.getKey());
				for(int i=0; i< dt.getValue().size(); i++){
					System.out.println("soy io->"+dt.getValue().get(i));
				}
			}*/
			/*for(Entry<String, Boolean> dt:hv.entrySet()){
				System.out.print("soy la clave->"+dt.getKey());
				System.out.println("   soy la value->"+dt.getValue());
				
			}*/
			for (int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());
				String t1 = st.nextToken();
				String t2 = st.nextToken();
				BFS(t1, t2);
				sb.append(salida).append("\n");
				exploredfalse();
			}
			//if(casos != 0) sb.append("\n");
		}
		System.out.print(sb);
	}

	static void BFS(String nd, String d) {
		Queue<String> q = new ArrayDeque<String>();
		Queue<String> camino = new ArrayDeque<String>();
		salida = "";
		hv.put(nd, true);
		q.add(nd);
		camino.add(""+nd.charAt(0));
		while (!q.isEmpty()) {
			String u = q.poll(), recorrido = camino.poll();
			if(u.equals(d)){
				salida = recorrido;
				return;
			}else{
				ArrayList<String> alc = hm.get(u);
				for(int i = 0; i< alc.size(); i++){
					String key = alc.get(i);
					if(!hv.get(key)){
						q.add(key);
						hv.put(key, true);
						camino.add(recorrido+key.charAt(0));
					}
				}
			}
		}

	}
	static void exploredfalse(){
		for(Entry<String, Boolean> dt:hv.entrySet()){
			hv.put(dt.getKey(), false);
		}
	}
}

