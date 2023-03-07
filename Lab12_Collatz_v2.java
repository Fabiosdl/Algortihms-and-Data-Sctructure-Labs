import java.util.*;
public class Lab12_Collatz_v2{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int x = input.nextInt();
        input.close();
        long starttime= System.currentTimeMillis();
        int size = b-a+1;
        num[]array = new num [size];
        
        for(int i=0, j=a; i<array.length; i++,j++){
            array[i]=new num(j,collatzLength(j));
            //System.out.println(array[i].number+" : "+array[i].collatz);
        } 
        mergeSort(array); 
        long endtime = System.currentTimeMillis(); 
        System.out.println(array[x-1].number+" : "+array[x-1].collatz);
        System.out.print("\n"+(endtime-starttime)+"msec"); 
    }
    
    public static long collatzLength(long number) {
        
        if(number==1) return 0;        
        
        else if( number%2==0){
           return 1+collatzLength(number/2);
        }
        else {
           return 1+collatzLength(3*number+1);
        }
    }
// merge sort 
    private static void mergeSort(num[] inputArray) {
        int inputLength = inputArray.length;
        
        if (inputLength < 2) {
          return;
        }
        
        int midIndex = inputLength / 2;
        num[] leftHalf = new num[midIndex];
        num[] rightHalf = new num[inputLength - midIndex];
        
        for (int i = 0; i < midIndex; i++) {
          leftHalf[i] = inputArray[i];
        }
        for (int i = midIndex; i < inputLength; i++) {
          rightHalf[i - midIndex] = inputArray[i];
        }
        
        mergeSort(leftHalf);
        mergeSort(rightHalf);
        
        merge(inputArray, leftHalf, rightHalf);
    }
    
    private static void merge (num[] inputArray, num[] leftHalf, num[] rightHalf) {
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;
        
        int i = 0, j = 0, k = 0;
        
        while (i < leftSize && j < rightSize) {
          if (leftHalf[i].collatz <= rightHalf[j].collatz) { // just comparing the collatz length of the object num
            inputArray[k] = leftHalf[i];
            i++;
          }
          else {
            inputArray[k] = rightHalf[j];
            j++;
          }
          k++;
        }
        
        while (i < leftSize) {
          inputArray[k] = leftHalf[i];
          i++;
          k++;
        }
        
        while (j < rightSize) {
          inputArray[k] = rightHalf[j];
          j++;
          k++;
        }        
    }
}
class num{
    public long number;
    public long collatz;

    public num (long number, long collatz){

        this.number=number;
        this.collatz=collatz;
    }
}