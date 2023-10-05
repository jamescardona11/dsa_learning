/**
 * @author James
 * 
 * "\n"
 */
import java.io.*;
import java.util.*;
import java.math.*;

public class Main {   		
	public static void main(String[] args) throws Exception {
		Scanner sc;
		File archivo = new File("entrada.txt");
		if( archivo.exists() ) {
			sc = new Scanner( new FileReader( archivo ) );
		}
		else {
			sc = new Scanner(( System.in ) );
		}//------inicio Codigo--------
    	        
		StringBuffer sb = new StringBuffer("");
		while (sc.hasNext()){
			String a = sc.next();
			int b = Integer.parseInt(sc.next()), c= Integer.parseInt(sc.next());
			BigInteger bi1= new BigInteger(a, b);
			String gg= new String(bi1.toString(c)).toUpperCase();
			int n= gg.length();
			if(n > 7){
				gg= "  ERROR";
			}else{
				n=7-n;
				String h=gg;
				gg="";
				while(n-->0){
					gg+=" ";
				}
				gg+=h;			}
			sb.append(gg).append("\n");
		}
		System.out.print(sb);
	}
}