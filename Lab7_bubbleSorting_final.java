import java.util.*;
public class Lab7_bubbleSorting_final{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in); // size of the arrray (or the amount of strings in the array).
        int n = input.nextInt();
        String [] array =  new String[n]; //{"sponger","windward","leitmotivs","desertion","kleptomania","collaborate","polyethylene","dimensioned","workhorse","hemispheres","cornered","payed","rattier","javelin","motorcycles","sensationalist","coverups","overlords","abbots","lusher","athena","donated","expels","grammatical","rightwinger","sportsman","hikes","studiousness","wreak","macaroon","obelisk","batsmen","urgent","endoplasmic","centres","roadsides","mismatches","olympian","restrictively","sojourning","zeppelin","redistributions","loathsomely","catamaran","legality","pentatonic","procedurally","monochrome","quashing","supersede","bum","setter","unilateralism","protectiveness","overexposed","tread","dynasty","unbreakable","legitimating","obsidian","tact","nautilus","decoder","offertory","impersonates","regards","elected","precocious","blitz","servants","hybrid","metaphysically","brabbles","nutmegs","uninterruptedly","javelins","motorcyclists","slanders","unfetchable","stoa","gangplank","marvellously","daftest","gal","niece","birdwatcher","camelhair","yaws","ousts","nearside","audacious","glazer","seepage","overworking","ruddiness","aquarium","subversion","sedate","costar","burp"};
        int [] temp_array = new int[n];

        for(int i=0; i<array.length; i++){ // for loop to fill the array.
            array[i] = input.next();            
            array[i] = array[i].toLowerCase(); 
        }input.close();        

        for(int j=0; j<array.length; j++){ // transforming the string array into integer array, each string having different scores.            
            int temp = 0;
            for(int k=0; k<array[j].length();k++){ 
                int value = 0;          
                switch (array[j].charAt(k)) {
                case 'a','e','i','o','u','l','n','s','t','r':
                    value = 1;
                    break;               
                case 'd','g':
                    value = 2;
                    break;
                case 'b','c','m','p':
                    value = 3;
                    break;
                case 'f','h','v','w','y':
                    value = 4;
                    break;
                case 'k':
                    value = 5;
                    break;
                case 'j','x':
                    value = 8;
                    break;
                case 'q','z':
                    value = 10;
                    break;
               }                
                temp = temp+value;                                               
            }
            temp_array[j] = temp;
        }        
        for(int i = array.length-1; i>0; i--){ // now I have to sort the temp_array in ascending order together with the String array
            for(int j = 0; j<i; j++){
                if(temp_array[j]>temp_array[j+1]){
                    int t = temp_array[j];
                    temp_array[j] = temp_array[j+1];
                    temp_array[j+1] = t;
                    String t_str = array[j];
                    array[j] = array[j+1];
                    array[j+1] = t_str;
                }
                
            }
        }
        for(int i = array.length-1; i>0; i--){ // now I have to sort the String array in alphabetical order.
            for(int j = 0; j<i; j++){
                if(temp_array[j]==temp_array[j+1] && (array[j].compareTo(array[j+1])>0)){
                    int t2 = temp_array[j];
                    temp_array[j] = temp_array[j+1];
                    temp_array[j+1] = t2;
                    String t_str2 = array[j];
                    array[j] = array[j+1];
                    array[j+1] = t_str2;                                   
                }
            }
        }
        System.out.println();
        for(int z = 0; z<array.length; z++){
            System.out.println(array[z]+"-"+temp_array[z]);
        }
    }
}