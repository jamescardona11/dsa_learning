/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package P623;

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
            BigInteger a1 = new BigInteger(entrada);
            BigInteger f = new BigInteger("1");
            
            for (int i = 1; i <= a1.intValue(); i++) {
            f = f.multiply(new BigInteger(i + ""));
            }

            System.out.println(a1+"!"+"\n"+f);
        }
    }
}
