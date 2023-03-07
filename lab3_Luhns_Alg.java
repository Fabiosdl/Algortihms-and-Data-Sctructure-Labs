import java.util.*;
public class lab3_Luhns_Alg{
    public static void main(String args[]){
        try (Scanner input = new Scanner(System.in)) {
            int[]ar = new int[16];
            int luhns = 0;        
            int sum = 0;
            System.out.println("insert card number");
            for(int i=0; i<ar.length;i++){                
                ar[i]=input.nextInt();
            }            
            for (int i = ar.length-1; i>=0; i-=2){ // firs sum the last num until the first one, skipping 1 number
                sum = sum+ar[i];
            }
            System.out.println(sum); //correct
            for (int i = ar.length-2; i>=0; i-=2){
                if(ar[i]*2>9){
                    ar[i] = ar[i]*2-9;
                }
                else{
                    ar[i] = ar[i]*2;
                }
                luhns = luhns+ar[i];
            }
            System.out.println(luhns);
            if((sum+luhns)%10==0){
                System.out.println("VALID");
            }
            else{
                System.out.println("INVALID");
            }
        }           
        
    }
}