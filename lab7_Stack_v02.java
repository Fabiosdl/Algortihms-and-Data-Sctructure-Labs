import java.util.*;
public class lab7_Stack_v02{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        Stack theStack = new Stack(100); // make new stack 
        String str = "";       
        while(!theStack.isFull()){
            str = input.nextLine();
            if(str.equals("Go North")){
                str = "Go South";
            }
            else if(str.equals("Go South")){
                str = "Go North";
            }
            else if(str.equals("Go West")){
                str = "Go East";
            }
            else if(str.equals("Go East")){
                str = "Go West";
            }            
            else if(str.equals("Arrived")){
                break;
            }
            if(str.equals("Go Back")) theStack.pop();

            else theStack.push(str); // push items onto stack
        }
        input.close();
        while (!theStack.isEmpty()){
            System.out.println(theStack.pop());
        }
    }
}
