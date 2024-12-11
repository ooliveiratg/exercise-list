
import java.util.Scanner;

public class c {
    public static void main(String[] args) {
        int[] vetorA = new int[20];
        int [] vetorB = new int[20];
        int[] vetorC = new int[20];
        int v1,v2;
        Scanner sc = new Scanner(System.in);
        System.out.print("digite o valor que deseja subtrair maior que 20 ou igual: ");
        
        v1= sc.nextInt();
        v2 = sc.nextInt();
        

        for(int i=0;i<20;i++){
            vetorA[i] = v1;
            
            v1--;
            
        }
        
        for(int i=19; i>0 ;i--){
            vetorB[i] =v2;
            v2--;
        }
        
        for(int j=0; j<20; j++){
            vetorC[j] = vetorA[j]-vetorB[j];
            System.out.println(vetorA[j]+ " - "+ vetorB[j]+" = " +vetorC[j]);
        }
    }
}
