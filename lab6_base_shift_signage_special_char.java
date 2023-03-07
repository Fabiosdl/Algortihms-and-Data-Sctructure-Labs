import java.util.*;
import java.lang.Math;
public class lab6_base_shift_signage_special_char {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        Scanner number = new Scanner(System.in);
        int base1 = input.nextInt();
        int base2 = input.nextInt();
        String str = number.nextLine();input.close();number.close();
        str=str.toLowerCase();
        String value = str.replace('-','0');
        String todec = "0123456789abcdefghijklmnopqrstuv";
        long result=0;
        int num=0;
        String MATCH_REGEX = "^[a-z0-9][a-zA-Z0-9]*";
        if (!value.matches(MATCH_REGEX)) {}
        else{
            //Converting source base to base 10.      
            for(int i=value.length()-1,j=0; i>=0; i--,j++){
                char letter = value.charAt(i);
                num=todec.indexOf(letter);
                if(num>=base1){break;}//in case the digits are greater than its base value;
                double pow = Math.pow(base1,(j));
                result = result + num*pow; //result is always in base 10
                //checking if there is any character different from todec string                     
            }
            if(base2==10 && str.charAt(0)=='-'){System.out.println(Math.round(result)*-1);}
            else if(base2==10 && str.charAt(0)!='-' ){System.out.println(Math.round(result));}
            // end of base 10.
//=========================================================================================================================================
            // Converting decimal base to destination base
            else if(base2!=10){//if base2 != 10, then use the result in base 10 and apply Euclidean's Method.
                double remainder;
                String r = new String();            
                for(double k=result; k>=1; k-=(k-(k/base2))){ 
                    remainder=k%base2; // getting the remainder. variable is double to get the remainder as an integer(but it is still double).
                    int rem = (int) remainder;                
                    char temp2= todec.charAt(rem);
                    r = r + temp2; //putting the remainder together as a string.              
                }
                if(str.charAt(0)!='-'){
                    for(int z=r.length()-1;z>=0;z--){//for loop to reverse string and getting the right answer
                        System.out.print(r.charAt(z));
                    }
                }
                else{
                    if(num<base1){//I did this condition to do not print "-" when the digits >= of its base1, as it should print no answer.
                        System.out.print("-");                
                        for(int z=r.length()-1;z>=0;z--){//for loop to reverse string and getting the right answer
                            System.out.print(r.charAt(z));
                        }
                    }
                }            
            }
        }       
    }
}