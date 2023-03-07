import java.util.*;

public class lab11_Recursion_Fri_Task1_v1{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        double x = input.nextDouble();
        double y = input.nextDouble();
        input.close();
        System.out.println(Eucl_Alg(x,y));
    }
    public static double Eucl_Alg(double x, double y){
        if(y==0)
            return x;
        else 
            return Eucl_Alg(y, x%y);
    }
}