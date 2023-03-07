import java.util.*;
public class lab4_Prime{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int count = 0;

        int min = Math.min(num1,num2);
        int max = Math.max(num1,num2);
        input.close();

        if (min<2){
            min=2;
        }
        for (int i = min; i<=max; i++){
            boolean isPrime = true;
            for (int j = 2; j<=Math.sqrt(i); j++){
                if(i%j==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                count++;
            }
        }
        System.out.println(count);

    }
}