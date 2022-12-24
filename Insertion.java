import java.sql.Array;
import java.util.*;

public class Insertion{
    public static void main(String[] args) {
        int[] arr ={10,40,30,20,50};

        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]<arr[minIndex]){
                    int temp = arr[minIndex];
                    arr[minIndex] = arr[j];
                    arr[j] = temp;

                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}