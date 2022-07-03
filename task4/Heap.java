package task4;
import java.util.Scanner;
public class Heap {   
   public static void main(String args[]) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Size of the array : ");
      int size = scanner.nextInt();
      System.out.println("Elements of the array : ");
      int[] heapArray = new int[size];
      for(int i=0; i<size; i++) {
         heapArray[i] = scanner.nextInt();
      }
      HeapSort.heapSort(heapArray, size);
   }
}