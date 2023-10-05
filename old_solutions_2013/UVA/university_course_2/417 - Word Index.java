import java.io.*;
import java.util.*;

public class Main {
	
    public static void main(String[] args) throws Exception {
    	BufferedReader br;
    	File archivo = new File("entrada.txt");
    	if( archivo.exists() ) br = new BufferedReader( new FileReader( archivo ) );
    	else br = new BufferedReader( new InputStreamReader( System.in ) );
        //------Inicio Codigo--------
        
    	StringBuffer sb = new StringBuffer("");
        String ent,ssc="abcdefghijklmnopqrstuvwxyz";
        HashMap<String,Integer>hm =g(ssc);
        
        while ((ent=br.readLine())!=null) {
            ent=ent.trim();
            if(hm.containsKey(ent)){
                sb.append(hm.get(ent)).append("\n");
            }
            else{
              sb.append("0\n");
            }
        }
        System.out.print(sb);
    }
   
    static HashMap g(String abc){
        TreeSet<String> ts[]=new TreeSet[5];
        for(int i=0;i<5;i++){
            ts[i]=new TreeSet<String>();
        }
        for(int i=0;i<26;i++){
        	String ii= abc.charAt(i)+"";
            ts[0].add(ii);
            for(int j=i+1;j<26;j++){
            	String jj= abc.charAt(j)+"";
                ts[1].add(ii+jj);
                for(int k=j+1;k<26;k++){
                	String kk= abc.charAt(k)+"";
                    ts[2].add(ii+ jj+ kk);
                    for(int m=k+1;m<26;m++){
                    	String mm= abc.charAt(m)+"";
                    	ts[3].add(ii+jj+kk+mm);
                      for(int z=m+1;z<26;z++){
                    	  String zz= abc.charAt(z)+"";
                    	  ts[4].add(ii+jj+kk+mm+zz); 
                     }
                 }
               }
            }
        }
        int p=0;
        HashMap<String,Integer> hs =new HashMap<String, Integer>();
        for(int i=0;i<5;i++){
            for(Iterator<String> it = ts[i].iterator(); it.hasNext();){
                hs.put(it.next(), ++p);
            }
        }
        return hs;
    }
}