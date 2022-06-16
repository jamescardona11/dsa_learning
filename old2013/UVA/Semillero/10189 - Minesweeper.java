/**
 * @author James
 * 10189 - Minesweeper
 * 
 */
import java.io.*;
public class Main {
	static boolean isvaild(int x, int y, int a, int b){
		return x>=0 && y>=0 && x<a && y<b;
	}

    public static void main(String[] args) throws Exception {
        BufferedReader br;
        File archivo = new File("entrada.txt");

        if (archivo.exists()) {
            br = new BufferedReader(new FileReader(archivo));
        } else {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        //--------------
        int dx[] = {0,1,1,1,0,-1,-1,-1}, dy[] = {-1,-1,0,1,1,1,0,-1};
        String ent;
        int n, m;
        int npx=0, npy=0, c=0;
        while(true){
        	String t[] = br.readLine().split(" ");
        	n = Integer.parseInt(t[0]);
            m = Integer.parseInt(t[1]);
            
            if(n==0 && m==0) break;
            if(c>0) System.out.println();
            
            int M1[][] = new int [n][m];
            char M2[][] = new char [n][m];
            
        	for(int i=0; i<n;i++){
        		ent=br.readLine();
        		for(int j=0; j<m; j++){        			
        				if(ent.charAt(j)=='*'){
        					M2[i][j]='*';
        					for(int k=0; k<8;k++){
        						npx=i+dx[k];
        						npy=j+dy[k];
        						if(isvaild(npx, npy, n, m)){
        							//System.out.println("npx: " + npx + "    npy: " + npy);
        							M1[npx][npy]++;
        						}
        					}
        				}
        					
        		}
        	}
        	System.out.println("Field #" + ++c + ":");
        	for(int i=0; i<n; i++){
        		for(int j=0; j<m; j++){
        			if(M2[i][j]=='*'){
        				System.out.print('*');
        			}else{
        				System.out.print(M1[i][j]);
        			}
        		}
        		 System.out.println();
        	}
        }
        
    }
}