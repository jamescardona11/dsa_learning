/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package P11799;

/**
 *
 * @author James
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) throws Exception {
        File archivo = new File("entrada.txt");
        BufferedReader br;

        if (archivo.exists()) {
            br = new BufferedReader(new FileReader(archivo));
        } else {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        String entrada = br.readLine();
        int a = Integer.parseInt(entrada), l = 0;
        TreeSet<Integer> ts = new TreeSet<Integer>();
        while (a > 0) {
            entrada = br.readLine();
            a--;
            l++;
            StringTokenizer st = new StringTokenizer(entrada, "[ ]");
            while (st.hasMoreElements()) {
                ts.add(Integer.parseInt(st.nextToken()));
            }
            System.out.println("Case "+l+": "+ts.last());
            ts.clear();
        }
    }
}