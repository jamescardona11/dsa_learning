/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package P11764;

/**
 *
 * @author James
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        File archivo = new File("entrada.txt");
        BufferedReader br;

        if (archivo.exists()) {
            br = new BufferedReader(new FileReader(archivo));
        } else {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        String T = br.readLine();
        int L = Integer.parseInt(T), L1,s1, s,a=0, b=0;
        StringBuilder K = new StringBuilder();
        for(int i=1; i<=L;i++){
            a=0;
            b=0;
            L1=Integer.parseInt(br.readLine())-1;
            T = br.readLine();
            StringTokenizer st = new StringTokenizer(T, "[ ]");
            s=Integer.parseInt(st.nextToken());
            while(L1-->0){
                s1=Integer.parseInt(st.nextToken());
                if(s!=s1){
                    a=(s1>s) ? a+1 : a;
                    b=(s1<s) ? b+1 : b;
                    s=s1;
                }
            }
            K.append("Case "+i+": "+ a+" "+b+'\n');
        }
        System.out.print(K);
    }
}
