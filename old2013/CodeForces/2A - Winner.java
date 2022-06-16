import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int max = Integer.MIN_VALUE;
		HashMap<String, Integer> lhm = new HashMap<String, Integer>();
		HashMap<String, Integer> ohm = new HashMap<String, Integer>();
		turno[] list = new turno[n];
		for (int i = 0; i < n; i++) {	
			StringTokenizer st = new StringTokenizer(br.readLine());
			String key = st.nextToken();
			int value = Integer.parseInt(st.nextToken());
			list[i] = new turno(key, value);
			if (lhm.containsKey(key)) {
				value += lhm.get(key);
				lhm.put(key, value);
			}
			else lhm.put(key, value);
		}
		for (Iterator<String> it = lhm.keySet().iterator(); it.hasNext();){
			String key = it.next();
			int value = lhm.get(key); 
			max = Math.max(max, value);
		}
		
		for (int i = 0; i < n; i++) {	
			String key = list[i].nombre;
			int value = list[i].valor;
			if(lhm.get(key) >= max){
				if (ohm.containsKey(key)) {
					value += ohm.get(key);
					ohm.put(key, value);
				}
				else ohm.put(key, value);
				
				if(value >= max){
					System.out.print(key);
					break;
				}
			}
			
		}
	}
}

class turno{
	turno(String n, int v){
		nombre = n;
		valor = v;
	}
	String nombre;
	int valor;
}