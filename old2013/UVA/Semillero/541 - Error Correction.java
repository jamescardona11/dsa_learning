/**
 * @author James
 * 541
 * 
 */
import java.io.*;
import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) throws Exception {
        Scanner sc;
        File archivo = new File("entrada.txt");

        if (archivo.exists()) {
            sc = new Scanner(new FileReader(archivo));
        } else {
            sc = new Scanner((System.in));
        }
        //------Inicio Codigo--------
        
        StringBuilder sb = new StringBuilder();
        String ent;
        
        while(sc.hasNext()){
        	int t= sc.nextInt();
        	if(t == 0) break;
        	
        	int col[] = new int[t], fil[] = new int[t];
        	for(int i=0; i<t; i++){
        		for(int j=0; j<t; j++){
        			int tmp =  sc.nextInt();
        			fil[i] += tmp;
        			col[j] += tmp;
        			
        		}
        	}
        	int c=0, f=0, l=0, p=0;
        	
        	for(int i=0; i<t; i++){
        		if((fil[i] % 2) != 0 ){
        			f=i;
        			for(int j=0; j<t; j++){
        				if((col[j] % 2) != 0){
        					c=j;
        					l++;
        					fil[i]+=1;
        					col[j]+=1;
        				}
        			}
        			p++;
        		}else if((col[i] % 2) != 0 ){
        			c=i;
        			for(int j=0; j<t; j++){
        				if((fil[j] % 2) != 0){
        					f=j;
        					p++;
        					fil[j]+=1;
        					col[i]+=1;
        				}
        			}
        			l++;
        		}
        		
        	}
        	if(l==0 && p==0){
        		sb.append("OK").append("\n");
        	}else if(l==1 && p==1){
        		sb.append("Change bit (").append(f+1).append(",").append(c+1).append(")").append("\n");
        	}else{
        		sb.append("Corrupt").append("\n");
        	}
        }
        System.out.print(sb);
    }
}