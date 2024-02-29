import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] a = new int[4];

        a[0] = 1;
        a[1] = 1;
        a[2] = 133;
        a[3] = 1;




        int count = 0;
        int total = 0;
        int k = 4;


        for(int i=0; i<a.length; i++){

            total = total + a[i];
            if(total <= k){
                count++;
            }
            else{
                a[i] = a[i+1];
            }

        }
        System.out.println(total);


    }
}