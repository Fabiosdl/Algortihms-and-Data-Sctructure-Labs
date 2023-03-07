import java.util.*;
public class lab3_with_string{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Insert your Card Number");
        String str = input.nextLine();
        int luhns = 0;        
        int sum = 0;
        input.close();

        for (int i = str.length()-1; i>=0; i-=2){ // first sum the last num until the first one, skipping 1 number
            
            int num = Integer.parseInt(str.substring(i,i+1));
            sum = sum+num;//correct
        }
        System.out.println(sum);
        for (int i = str.length()-2; i>=0; i-=2){
            int num = Integer.parseInt(str.substring(i,i+1));
            if(num*2>9){
                num = num*2-9;
            }
            else{
                num = num*2;
            }
            luhns = luhns+num;//correct
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