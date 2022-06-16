/**
 *
 * @author James
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br;
        File archivo = new File("entrada.txt");

        if (archivo.exists()) {
            br = new BufferedReader(new FileReader(archivo));
        } else {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        ArrayList<Integer> s = new ArrayList<Integer>();
        String ent;
        String sal;
        int n;
        int v;
        char c;

        while ((ent = br.readLine()) != null) {
            v = 0;
            ent = ent.toLowerCase();
            n = ent.length();

            for (int i = 0; i < n; i++) {
                c = ent.charAt(i);
                v = (c > 96 && c < 123) ? v + (c - 96) : v;
            }
            
            while (v > 9) {
                sal = "" + v;
                v = 0;
                n = sal.length();
                for (int i = 0; i < n; i++) {
                    v = v + (sal.charAt(i) - 48);
                }
            }
            s.add(v);
        }
        n = s.size();
        for (int i = 0; i < n; i += 2) {
            DecimalFormat df = new DecimalFormat("0.00");
            float a1=s.get(i),a2=s.get(i+1);
            System.out.println(df.format((Math.min(a1,a2)/Math.max(a1, a2))*100) + " %");   
        }

    }
}