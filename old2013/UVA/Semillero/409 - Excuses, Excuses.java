/**
 * @author James
 * 11878- Homework Checker 
 * 
 */
import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br;
        File archivo = new File("entrada.txt");

        if (archivo.exists()) {
            br = new BufferedReader(new FileReader(archivo));
        } else {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        //------------
        String ent;
        StringBuilder sb = new StringBuilder();
        String ts[];
        int k=0, e=0, x=1;
        while((ent=br.readLine()) != null){
        	String nums[] = ent.split(" ");
        	k=Integer.parseInt(nums[0]);
        	e=Integer.parseInt(nums[1]);
        	ts = new String[k];
        	
        	for(int i=0; i< k; i++){
        		ts[i]= br.readLine();
        	}
        	String wordte[] = new String[e];
        	int w[]= new int[e];
        	
        	for(int i=0; i< e; i++){
        		ent=br.readLine();
        		wordte[i] = ent;
        		ent=ent.toLowerCase(Locale.ENGLISH);
        		for( int j=0 ; j<k; j++) {
        			//String temp[] = ent.split(ts[j]);
        			Pattern p = Pattern.compile("(\\W|^)"+ts[j]+"(\\W|$)");
        			Matcher m = p.matcher(ent);
        				if (m.find())
        					w[i]++;
        			//w[i]+= temp.length-1;
        		}
        	}
        	int max=w[0];
        	for(int i=1; i<e;i++){
        			max=Math.max(max, w[i]);
        	}
        	
        	sb.append("Excuse Set #"+x+"\n");
        	for(int i=0; i<e;i++){
        		if(w[i]==max){
        			sb.append(wordte[i]+"\n");
        		}
        	}
        	
        	x++;
        	sb.append("\n");
        }
        System.out.print(sb);
    }
}