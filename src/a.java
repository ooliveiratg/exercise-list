import java.util.Scanner;


public class a {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    
    String[] vetorA = new String[10];
    
for(int j=0; j<10;j++){
    System.out.println("digite 10 nomes: ");
    String nomes = sc.next();
    vetorA[j]= nomes;
    
}

for(int i=0;i<10;i++){
System.out.println(vetorA[i]);
}
    }

}
