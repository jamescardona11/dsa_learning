import java.io.*;
public class Main {
	public static void main(String[] args) throws Exception {
			// -------Definición de variables para la lectura
			BufferedReader br;
			File archivo = new File("entrada.txt");
			if (archivo.exists()) {
				br = new BufferedReader(new FileReader(archivo));
			} else {
				br = new BufferedReader(new InputStreamReader(System.in));
			}
			
			//--Algoritmo
			StringBuilder sb = new StringBuilder();
	        int  casos = Integer.parseInt(br.readLine());
	        String ent = br.readLine();
	        int sumder =0, sumizq=0;
	        boolean bandera = true;
	        for(int i =0; i< casos; i++){
	        	if(ent.charAt(i) == '4' || ent.charAt(i) == '7'){
	        		if(i<casos/2){
		        		sumder+=Integer.parseInt(""+ent.charAt(i));
		        	}else{
		        		sumizq+=Integer.parseInt(""+ent.charAt(i));
		        	}
	        	}else{
	        		bandera = false;
	        		break;
	        	}
	        }
	        if(sumder == sumizq && bandera){
	        	System.out.println("YES");
	        }else{
        		System.out.println("NO");
        	}
	}
}
