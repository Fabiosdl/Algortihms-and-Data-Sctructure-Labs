import java.util.*;

public class lab11_Recursion_Fri_Task3_v1{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        input.close();
        String current = str;
        System.out.println(function(str,current));
    }
    public static boolean function(String str, String current){
        
        if(current.length()%2!=0){
            if (str.length()==0)  return true;           
           
            else if(str.charAt(0)=='x'){
                return function(str.substring(1),current);
            }
        
            else if(str.charAt(0)=='y'&&str.charAt(1)=='y'){
                return function(str.substring(2),current);                
            }
            else return false;
        }
        else{ 
            return false;
        }
    }
}