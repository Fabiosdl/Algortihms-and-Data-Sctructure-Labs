import java.util.*;
public class lab5_efficient_MCSim {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int classsize = input.nextInt();
        int matches = input.nextInt();
        input.close();
        long starttime= System.currentTimeMillis();
        double trials=100000;
        double successes=0;
        for(int i=0; i<trials; i++){
            int[]days = new int[365];
            for(int j=0; j<classsize; j++){
                int birthday = (int)(Math.random()*365);
                days[birthday]++;
                if(days[birthday]>=matches){
                    successes++;
                    break;
                }
            }
        }
        long endtime = System.currentTimeMillis();
        System.out.println(Math.round(successes*100/trials)+"%");
        System.out.print("\n"+(endtime-starttime)+"m/s"); 
    }    
}
