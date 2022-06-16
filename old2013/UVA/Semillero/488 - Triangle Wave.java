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

        String ent=br.readLine();
        int n = Integer.parseInt(ent);
        br.readLine();
        int a, f;
        StringBuilder sb = new StringBuilder();
        while (n-->0){
            ent=br.readLine();
            a=Integer.parseInt(ent);
            
            ent=br.readLine();
            f=Integer.parseInt(ent);
            while(f-->0){
                for(int i=1; i <=a; i++ ){
                    for(int j=1; j <=i; j++ ){
                    sb.append(i);
                    }
                    sb.append("\n");
                }
                for(int i=a-1; i>=1; i-- ){
                    for(int j=1; j <=i; j++ ){
                    sb.append(i);
                    }
                    sb.append("\n");
                }
                if(n>=1 || f>=1)sb.append("\n");
            }
        br.readLine();   
        }
        System.out.print(sb);
        
    }
}