/**
 * @author James
 * 
 * "\n"
 */
import java.io.*;
import java.util.StringTokenizer;
public class Main {
	
	static int dx[] = {0,1,1,1,0,-1,-1,-1}, dy[] = {-1,-1,0,1,1,1,0,-1}, m ,n;
	static char M[][];
	static boolean isvaild(int x, int y, int a, int b){
		return x>=0 && y>=0 && x<a && y<b;
	}
	static void DFS(int n1, int n2){
		M[n1][n2] = '*';
		int x,y;
		for (int i=0; i<8; i++){
			x = n1 + dx[i];
			y = n2 + dy[i];
			if(isvaild(x, y, m, n) &&  M[x][y] == '@'){
				DFS(x,y);
			}
		}
		//return 0;
	}
	
    public static void main(String[] args) throws Exception {
        BufferedReader br;
        File archivo = new File("entrada.txt");
        if (archivo.exists()) {
            br = new BufferedReader(new FileReader(archivo));
        } else {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        StringBuilder sb = new StringBuilder();        
        String ent;
        
        
        while((ent = br.readLine()) != null){
        	StringTokenizer st = new StringTokenizer(ent);
        	m = Integer.parseInt(st.nextToken()); 
        	n = Integer.parseInt(st.nextToken());
        	if(m==0) break;
        	M = new char[m][n];
        	for(int i=0; i<m; i++){
        		ent = br.readLine();
        		for(int j=0; j<n;j++){
        			char k = ent.charAt(j);
        			M[i][j] = k;
        		}
        	}
        	int contar=0;
        	for(int i=0; i<m; i++){
        		for(int j=0; j<n;j++){
        			if(M[i][j] == '@'){
        				contar++;
        				DFS(i, j);
        			}
        		}
        	}
        	sb.append(contar).append("\n");
        }
        System.out.print(sb);
    }
}