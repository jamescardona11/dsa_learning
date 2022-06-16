/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package P10789;

/**
 *
 * @author James
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws Exception {
        File archivo = new File("entrada.txt");
        BufferedReader br;

        if (archivo.exists()) {
            br = new BufferedReader(new FileReader(archivo));
        } else {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
         
        int T = Integer.parseInt(br.readLine()), p=0;
        while (T-- > 0 ) {
            String L=br.readLine(), s="";
            int v[] =new int[256], n=L.length();
            p++;
            
            for (int j = 0; j < n; j++) {
                v[L.charAt(j)]++;
            }
            //System.out.println(Arrays.toString(v));
            for (int j = 0; j < 256; j++) {
                if(esprimo(v[j])) s=s+(char)j;
            }
            s=(s=="")?"empty":s;
            System.out.println("Case "+p+": "+s);

        }
    }

    static boolean esprimo(int n) {
        if (n < 2) {
            return false;
        }if(n==2){
            return true;
        }else if(n%2==0){
            return false;
        }else {
            for (int j = 3; j < n; j+=2) {
                if (n % j == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}