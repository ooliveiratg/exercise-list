public class e{
    public static void main (String[] args){
        
        int[]vetora = new int[15];
        int[]vetorb= new int[15];
        int fatorial=1;
        for( int i=0;i<15;i++){
            vetora[i]=i;
            vetorb[i]=1;
            
            for(int j=1;j<=i;j++){
                
                vetorb[i]*=j;

                
            }
            System.out.println(vetora[i]+"! ="+vetorb[i]);
        }
    }
    
}