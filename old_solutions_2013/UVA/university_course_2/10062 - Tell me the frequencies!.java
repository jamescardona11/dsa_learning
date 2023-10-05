/**
 * @author James
 * 10062 tell me frequency!
 * 
 */
import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br;
        File archivo = new File("entrada.txt");
        //long inicio = System.currentTimeMillis();

        if (archivo.exists()) {
            br = new BufferedReader(new FileReader(archivo));
        } else {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        int n, l=0;
        StringBuilder sb = new StringBuilder();
        Frequencia f[];
		
        String ent;
        while((ent= br.readLine())!=null){
        	if(l==1)sb.append("\n"); 
        	f=new Frequencia[97];
        	
        	for(int i=0; i<97; i++){
        		f[i]=new Frequencia(0, (char)(i+31));
        	}
        	
        	n= ent.length();
        	for(int i=0; i<n; i++){
        		f[ent.charAt(i)-31].inc();
        	}
        	Arrays.sort(f);
        	for(int i=0; i<97;i++){
        		if(f[i].getValor() > 0){
        			sb.append((int)f[i].getK()).append(" ").append(f[i].getValor()).append("\n");
        		}
        	}
        	l=1;
        }
        System.out.print(sb);
        //if( archivo.exists() ) System.out.println("Tiempo transcurrido : "+(System.currentTimeMillis()-inicio)+" milisegundos.");
    }
}

class Frequencia implements Comparable<Frequencia>{
	int valor=0;
	char k=0;
	
	public Frequencia(int num, char t){
		valor=num;
		k=t;
	}
	
	
	public int getValor() {
		return valor;
	}


	public char getK() {
		return k;
	}
	public void inc(){
		valor++;
	}


	@Override
	public int compareTo(Frequencia o) {
		if(valor>o.getValor()){
			return 1;
		}else if(valor == o.getValor()){
			if(k>o.getK()){
				return -1;
			}else{
				return 1;
			}
		}
		return -1;
	}
	
}