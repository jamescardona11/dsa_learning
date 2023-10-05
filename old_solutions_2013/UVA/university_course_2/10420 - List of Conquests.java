/**
 *
 * @author James
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

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
        int a=Integer.parseInt(entrada),k;
        TreeMap<String, Integer> tm = new TreeMap<String, Integer>();
        while(a>0){
            a--;
            entrada = br.readLine();
            k= entrada.indexOf(" ");
            
            if(tm.get(entrada.substring(0, k)) != null){
                tm.put(entrada.substring(0,k), tm.get(entrada.substring(0,k))+1);
            }else{
                tm.put(entrada.substring(0,k),1);
            }
        }
		
        for(Map.Entry<String,Integer> data: tm.entrySet()){
            System.out.println(data.getKey()+" "+data.getValue());
        }//*/

    }
}
