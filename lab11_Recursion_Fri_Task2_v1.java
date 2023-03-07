import java.util.*;

public class lab11_Recursion_Fri_Task2_v1{
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        double n=input.nextDouble();
        double d=input.nextDouble();
        int num = input.nextInt();
        input.close();
        System.out.println(n/d);
        System.out.println(charFinder(n,d,num));
        

    }
    public static char charFinder(double n, double d, int num){
        double quo = n/d;
        int quo1 = (int)quo;
        double result = quo - quo1;
        String str1 = (result)+"";
        String str = str1.substring(2);
        char fin = str.charAt(num-1);
        return fin;

    }    
}