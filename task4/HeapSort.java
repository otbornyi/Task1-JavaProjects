package task4;
import java.util.Arrays;
import java.util.Scanner;
public class HeapSort {
    public static void heapSort(int[] heapArray, int len) {
        int a;
        int size = len-1;
        for (int i = (len / 2); i >= 0; i--) {
           Heapify.heapify(heapArray, i, size);
        };
        for(int i= size; i>=0; i--) {
           a = heapArray[0];
           heapArray[0] = heapArray[size];
           heapArray[size] = a;
           size--;
           Heapify.heapify(heapArray, 0, size);
        }
        System.out.println(Arrays.toString(heapArray));
     }
}
