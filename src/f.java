import java.util.Scanner;

public class f {
 public static void main(String[] args) {
    int[] a = new int[15];
    int[] b = new int[15];
    int[] c = new int[30];
int i =0,j=0,coluna=0,linha=0;
    Scanner sc = new Scanner(System.in);
    
for(int t = 0 ; t<a.length; t++){
    a[t]=t;
    b[t]=t;
}

for(i = 0 ; i<a.length;i++){
    
    c[i]=a[i];
    System.out.println(c[i]);
}

for( j = 0 ; j<b.length;j++){

        c[j]=b[j];
        System.out.println(c[j]);
}


 
      
 }   
}
 
