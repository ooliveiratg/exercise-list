

public class d {
  
     public static void main(String[] args) {
 
    double[] vetorA = new double[15];
    int[] vetorB = new int[15];
    int mult=3,cont=0;
   
 
        for(int i=1;i<=15;i++){
 
            vetorB[i]=i;
            vetorA[i]=i;
            vetorB[i]=(int) Math.pow(vetorA[i], 2);
           
 
            System.out.println(vetorA[i]+" = "+vetorB[i]);
 
        }
    }
}

