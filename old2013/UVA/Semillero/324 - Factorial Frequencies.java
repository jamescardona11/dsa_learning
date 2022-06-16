/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package P324;

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
        int a, v[];

        while ((entrada = br.readLine()) != null) {
            a = Integer.parseInt(entrada);
            BigInteger a1 = new BigInteger(a+"");
            v = new int[10];
             if (a != 0) {
                a1 = f(a);
                f1(v, a1.toString());
                System.out.println(a + "! -- " + '\n' +"   "+ "(0) " + v[0] + "(1) " + v[1] + "(2) " + v[2] + "(3) " + v[3] + "(4) " + v[4] + '\n'+"   " + "(5) " + v[5] + "(6) " + v[6] + "(7) " + v[7] + "(8) " + v[8] + "(9) " + v[9]);
            }
        }


    }

    public static BigInteger f(int n) {
        BigInteger f = new BigInteger("1");
        for (int i = 1; i <= n; i++) {
            f = f.multiply(new BigInteger(i + ""));
        }
        return f;
    }

    static void f1(int v[], String n) {
        StringBuilder n1 =new StringBuilder(n);
        int k, t=n1.length();
        for(int i =0; i<t;i++){
            k = n1.charAt(i)-48;
            v[k]+=1;
        }
    }
}
