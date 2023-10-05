/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package P11417;

/**
 *
 * @author James
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    static int f(int n1, int n2){
        if(n1==n2) return n1;
        return f(Math.max(n1, n2)-Math.min(n1, n2), Math.min(n1, n2));
    }
    public static void main(String[] args)throws IOException{
        File archivo = new File("entrada.txt");
        BufferedReader br;

        if( archivo.exists() ) br = new BufferedReader( new FileReader( archivo ) );
        else br = new BufferedReader( new InputStreamReader( System.in ) );
        String entrada;
        int N, G, i ,j;

        while((entrada = br.readLine())!=null){
            N=Integer.parseInt(entrada);
            if(N!=0){
                G=0;
                for(i=1;i<N;i++)
                for(j=i+1;j<=N;j++){
                    G+=f(i,j);
                }
            System.out.println(G);
            }
        }
    }
}
