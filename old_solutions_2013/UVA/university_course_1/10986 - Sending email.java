/**
 * @author James
 * 
 * "\n"
 */

import java.io.*;
import java.util.*;

public class Main {
	static Vertex[] G;
	static int N, M;
	static final int INF = Integer.MAX_VALUE;
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
		int casos = Integer.parseInt(br.readLine());
		for (int k = 0; k < casos; k++) {
			ent = br.readLine();
			st = new StringTokenizer(ent);
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			int s = Integer.parseInt(st.nextToken());
			int t = Integer.parseInt(st.nextToken());
			G = new Vertex[N];
			for (int i = 0; i < M; i++) {
				st = new StringTokenizer(br.readLine());
				int f = Integer.parseInt(st.nextToken());
				int to = Integer.parseInt(st.nextToken());
				int w = Integer.parseInt(st.nextToken());
				if(G[f] == null){
					G[f] = new Vertex(f, INF);
				}
				if(G[to] == null){
					G[to] = new Vertex(to, INF);
				}
				G[f].la.add(new Edge(G[to], w));
				G[to].la.add(new Edge(G[f], w));
			}
			
			int res = -1;
			if(M>0) res = Dijkstra(s, t);
			if (res == -1)
				sb.append("Case #").append(k+1).append(": unreachable\n");
            else
            	sb.append("Case #").append(k+1).append(": ").append(res).append("\n");
			 
		}
		System.out.print(sb);
	}

	static int Dijkstra(int s, int t) {
			boolean[] visited = new boolean[N];
			PriorityQueue<Vertex> Q = new PriorityQueue<Vertex>();
			G[s].dist = 0;
			Q.offer(G[s]);
			while(!Q.isEmpty()){
				Vertex u = Q.poll();
				if(u.id == t){
					return u.dist;
				}
				if(!visited[u.id]){
					visited[u.id]=true;
					for(Edge edge : G[u.id].la){
						Vertex w = edge.to;
						int peso = edge.peso;
						if(w.dist > u.dist+peso){
							w.dist = u.dist + peso; 
							Q.offer(w);
						}
					}
				}
			}
			return -1;
	}
}
class Vertex implements Comparable<Vertex>{
	int id;
	int dist;
	List<Edge> la;
	public Vertex(int id, int d){
		this.id = id;
		this.la = new ArrayList<Edge>();
		this.dist = d;
	}
	@Override
	public int compareTo(Vertex v) {
		return dist - v.dist;
	}
	
}
class Edge{
	Vertex to;
	int peso;
	public Edge(Vertex v, int p){
		this.to = v;
		this.peso = p;
	}
}