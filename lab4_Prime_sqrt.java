import java.util.*;
public class lab4_Prime_sqrt{
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int count=0;

        int min = Math.min(num1,num2);
        int max = num1+num2-min;
        input.close();
        
        if(min<2){ // condition to ensure that the 0 and 1 won't be considered as prime numbers.
            min=2;
        }        
        for(int i=min; i<=max; i++){ //loop goes from min to all the numbers until max.
            boolean isPrime = true; // variable that keeps track of the current number as prime or not.
            if(i%2==0){ // even numbers can't be prime. exception is number 2
                isPrime = false;
            }  
            for(int j = 3; j <=Math.sqrt(i); j+=2){ // checking the other numbers beside multiplw of 2.                 
                // If any of these division has a remainder = 0, 
                //break the loop because its not prime and check another number in the outter loop. 
                if(i%j==0){
                    isPrime = false; //i manualy inserted 3 is prime in the last if statement.
                    break;
                }
            }            
            //If the boolean variable (isPrime) is not modified by the inner loop then it is prime.
            if(isPrime||i==2||i==3){  // also have to manualy say that 2 and 3 are prime numbers.                                 
                count++;            
            }
        }
        System.out.println(count);        
    }
}