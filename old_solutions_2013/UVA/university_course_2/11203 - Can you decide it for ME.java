/**
 * @author James
 * 
 * "\n"
 */
import java.io.*;
import java.util.regex.*;
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br;
        File archivo = new File("entrada.txt");
        if (archivo.exists()) {
            br = new BufferedReader(new FileReader(archivo));
        } else {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        int c= Integer.parseInt(br.readLine());
        String ent;
        Pattern p = Pattern.compile("^\\?+M\\?+E\\?+");
        StringBuilder sb = new StringBuilder();
        while(c-- > 0){
        	ent=br.readLine();
        	Matcher m = p.matcher(ent);
        	if(m.matches()){
        		Pattern p1 = Pattern.compile("\\?+");
        		Matcher m1 = p1.matcher(ent);
        		int[] v = new int[3];
        		int i=-1;
        		while(m1.find()){
        			v[++i] = m1.group().length();
        		}
        		if((v[1]-1) == ((v[2]-1)-v[0])){
        			sb.append("theorem").append("\n");
        		}else{
        			sb.append("no-theorem").append("\n");
        		}
        	}else{
        		sb.append("no-theorem").append("\n");
        	}
        }
        System.out.print(sb);
    }
}