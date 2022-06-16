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
	public static Pair[] puntos;
	public static void main(String[] args) throws Exception {
		// 1 -------Definición de variables para la lectura
		BufferedReader br;
		File archivo = new File("entrada.txt");
		if(archivo.exists()) br = new BufferedReader(new FileReader(archivo));
		else br = new BufferedReader(new InputStreamReader(System.in));

		// -------------Inicio Algoritmo
		StringBuilder sb = new StringBuilder();
		String ent;
		StringTokenizer st;
		double distancia;
		DecimalFormat df = new DecimalFormat("0.0000");
		while (true) {
			if((ent=br.readLine()).equals("0")) break;
			int n = Integer.parseInt(ent);
			puntos = new Pair[n];
			for(int i= 0; i<n; i++){
				st=new StringTokenizer(br.readLine());
				puntos[i] = new Pair(Double.parseDouble(st.nextToken()), Double.parseDouble(st.nextToken()));
				
			}
			Arrays.sort(puntos);
			distancia = closestpair(0, n-1);
			if(distancia >= 100000000)
				sb.append("INFINITY\n");
			else
				sb.append(df.format(Math.sqrt(distancia))).append("\n");
				
		}
		System.out.print(sb);
	}
	
	public static double closestpair(int inicio, int fin){
		int mitad =(inicio+fin)/2;
		if(inicio >= fin) return 100000000;
		if((fin-inicio) == 1) return puntos[inicio].distancia(puntos[fin]);
		double izq = closestpair(inicio, mitad);
		double der = closestpair(mitad+1, fin);
		double alfa = Math.min(izq, der);
		return clossestSplitpair(mitad, alfa, inicio, fin);
	}
	public static double clossestSplitpair(int mitad, double alfa, int inicio, int fin){
		double best = alfa;
		for (int i = inicio; i <= mitad; i++)
			for (int j = mitad+1; j <= fin && j<= mitad+7 ; j++)
				best = Math.min(best, puntos[i].distancia(puntos[j]));
		
		return best;
	}
}
class Pair implements Comparable<Pair>{
	public double x, y;
	Pair(double x, double y){
		this.x=x;
		this.y=y;
	}
	@Override
	public int compareTo(Pair p) {
		if(p.x == x) return Double.compare(p.y, y);
		return Double.compare(x, p.x);
	}
	public double distancia(Pair a){
		return (x-a.x)*(x-a.x) + (y-a.y)*(y-a.y);
	}
}