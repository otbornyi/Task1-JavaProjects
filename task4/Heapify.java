package task4;

public class Heapify {
    public static void heapify (int [] heapArray, int i, int heapSize) {
        int a = 2*i;
        int b = 2*i+1;
        int largestElement;
        if (a<= heapSize && heapArray[a] > heapArray[i]) {
           largestElement = a;
        } else {
           largestElement = i;
        }
        if (b <= heapSize && heapArray[b] > heapArray[largestElement]) {
           largestElement = b;
        }
        if (largestElement != i) {
           int z = heapArray[i];
           heapArray[i] = heapArray[largestElement];
           heapArray[largestElement] = z;
           heapify(heapArray, largestElement, heapSize);
       }
     }
}
