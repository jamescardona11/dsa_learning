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
        String T = br.readLine();
        int limite = Integer.parseInt(T), i, s,u=0;
        
        
        while (limite-- > 0 ) {
            T = br.readLine();
            T = T.toLowerCase();
            int n[] = new int[26];
            String salida = "";
            u=T.length();

            for (i = 0; i < u; i++) {
                s=T.charAt(i);
                if(s>96 && s<123) n[s-97]+=1;
            }
            u=n[0];
            for (i = 0; i < 26; i++){
            if(n[i]>u){
                salida =""+ (char)(i+97);
                u=n[i];
            }else if(n[i]==u){
                salida =salida+ (char)(i+97);
            }
        }
        System.out.println(salida);
        }   
    }
}