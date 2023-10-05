/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package P10220;

/**
 *
 * @author James
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
public static void main(String[] args) throws Exception {
        File archivo = new File("entrada.txt");
        BufferedReader br;

        if (archivo.exists()) {
            br = new BufferedReader(new FileReader(archivo));
        } else {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        String entrada;

        while ((entrada = br.readLine()) != null) {
            int a = Integer.parseInt(entrada);
            System.out.println(f(a));

        }
    }
    static int f(int n){
        int i, s=0;
        String t;
        BigInteger v = new BigInteger("1");
        for(i=1;i<=n;i++){
            v = v.multiply(new BigInteger(i+""));
        }
        t=v.toString();
        for(i=0;i<t.length();i++){
            s=s+(t.charAt(i)-48);
        }
        return s;
    }

}
