/**
 * @author James
 * 10252
 * 
 */
import java.io.*;
import java.util.*;

public class Main {
	
    public static void main(String[] args) throws Exception {
    	BufferedReader br;
    	File archivo = new File("entrada.txt");
    	if( archivo.exists() ) br = new BufferedReader( new FileReader( archivo ) );
    	else br = new BufferedReader( new InputStreamReader( System.in ) );
        //------aux1o Codigo--------
        
    	StringBuffer sb = new StringBuffer("");
        StringTokenizer ent;
        Formula fm[];
        while (br.ready()) {
        	
        	int n=Integer.parseInt(br.readLine());
        	fm = new Formula[n];
        	for(int i=0; i<n; i++){
        		ent = new StringTokenizer(br.readLine());
        		String nn = ent.nextToken();
        		ent.nextElement();
        		int hh = Integer.parseInt(ent.nextToken());
        		ent.nextToken();
        		int mm = Integer.parseInt(ent.nextToken());
        		ent.nextToken();
        		int ss = Integer.parseInt(ent.nextToken());
        		fm[i] = new Formula(nn,hh,mm,ss);
        	}
        	Arrays.sort(fm);
        	int c=1;
        	sb.append("Row ").append(c).append("\n");
        	for(int i=0; i<n; i++){
        		if(i%2==0 && i!=0){
        			c++;
        		sb.append("Row ").append(c).append("\n");
        		}
        		sb.append(fm[i].name).append("\n");
        	}
        	sb.append("\n");
        	br.readLine();
        }
        System.out.print(sb);
    } 
}
class Formula implements Comparable<Formula> {
	String name;
	int hr, min, seg;
	public Formula(String n, int h, int m, int s){
		name = n;
		hr = h;
		min = m;
		seg = s;
	}
	@Override
	public int compareTo(Formula o) {
		if(hr > o.hr){
			return 1;
		}else if(hr < o.hr){
			return -1;
		}else {//if(hr == o.hr)
			if(min > o.min){
				return 1;
			}else if(min < o.min){
				return -1;
			}else {//if(min == o.min)
				if(seg > o.seg){
					return 1;
				}else if(seg < o.seg){
					return -1;
				}else {//if(seg == o.seg)
					if((name.toLowerCase()).compareTo(o.name.toLowerCase()) > 0){
						return 1;
					}else if((name.toLowerCase()).compareTo(o.name.toLowerCase()) < 0){
						return -1;
					}else{
						return 0;
					}
				}
			}
		}
	}
}