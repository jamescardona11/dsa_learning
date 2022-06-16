/**
 * @author James
 * 
 * "\n"
 */
import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		// 1 -------Definición de variables para la lectura
		BufferedReader br;
		File archivo = new File("entrada.txt");
		if (archivo.exists()) {
			br = new BufferedReader(new FileReader(archivo));
		} else {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		
		// -------------Inicio Algoritmo
		StringBuilder sb = new StringBuilder();
        String ent;
        while((ent=br.readLine()) != null){
        	if(ent.equals("0")) break;
        	int n=ent.length()/2, i=-1;
        	int[] v = new int[n];
        	StringTokenizer st = new StringTokenizer(ent);
        	st.nextToken();
        	while(st.hasMoreElements()){
        		v[++i] = Integer.parseInt(st.nextToken());
        	}
        	Conteo c = CountInversions(v);
        	if(c.num % 2 != 0)
        		sb.append("Marcelo\n");
        	else
        		sb.append("Carlos\n");
		}
		System.out.print(sb);
	}
	public static Conteo CountInversions(int[] v){
    	return sortAndCountInversions(v, v.length);
    }
    public static Conteo sortAndCountInversions(int[] v, int n){
    	if(n <= 1) return new Conteo(v, 0);
    	else{
    		int mitad=n/2;
            int[] izq = Arrays.copyOfRange(v, 0, mitad);
            int[] der = Arrays.copyOfRange(v, mitad, n);
            Conteo x = sortAndCountInversions(izq, mitad);
            Conteo y = sortAndCountInversions(der, n-mitad);
            Conteo z = mergeAndCountInversions(x.arreglo, y.arreglo, n);
        
            return new Conteo(z.arreglo, (x.num + y.num + z.num));
    	}
    }
    public static Conteo mergeAndCountInversions(int A[], int B[], int n){
    	int i =0, j=0, k=0, m1=0, m2=0, total =0;
    	int Z[] = new int[n];
		m1 = A.length;
		m2 = B.length;
    	
    	while(k < n){
    		if(i >= m1){
    			Z[k]= B[j] ;
    			j++;
    		}else if(j >= m2){
    			Z[k]= A[i] ;
    			i++;
    		}else if(A[i] <= B[j]){
    			Z[k] = A[i];
    			i++;
    		}else{
    			Z[k] = B[j];
    			j++;
    			total += m1-i;
    		}
    		k++;
    	}
		return new Conteo(Z, total);
    }

}//Agregar esta clase	
class Conteo {
	Conteo(int[] A, long l) {
		this.arreglo = A;
		this.num = l;
	}
 
	public int[] arreglo;
	public long num;
}