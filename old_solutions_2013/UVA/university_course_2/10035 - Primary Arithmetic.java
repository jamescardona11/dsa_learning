
import java.io.*;

public class Main {
	
	
    public static void main(String[] args) throws Exception {
        BufferedReader br;
        File archivo = new File("entrada.txt");

        if (archivo.exists()) {
            br = new BufferedReader(new FileReader(archivo));
        } else {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        //--------------
        String ent;
        while((ent=br.readLine()) != null){
        	
        	String s[] = ent.split(" ");
        	int n1 = Integer.parseInt(s[0]),n2 = Integer.parseInt(s[1]);
        	
        	if(n1==0 && n2==0) break;
        	
        	int c=0, add=0,sm=0;
        	while(n1>0 || n2>0){
        		sm =(n1%10)+(n2%10) + add;
        		if(sm > 9) c++;
        		
        		add=sm/10;
        		n1 /=10;
        		n2 /=10;
        	}
        	
        	if(c==0){
        		System.out.println("No carry operation.");
        	}else if(c==1){
        		System.out.println("1 carry operation.");
        	}else{
        		System.out.println(c+" carry operations.");
        	}
        }
    }
}