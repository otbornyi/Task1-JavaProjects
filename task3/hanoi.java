package task3;

public class hanoi {
   public static void motion(int a, int from, int to) {
       if (a== 0){
           return;
       }
       int temporaryPole = 6 - from - to;
       motion(a-1, from, temporaryPole);
       System.out.println("Ходим " +a + " из " + from + " в " +to);
       motion(a-1, temporaryPole, to);
   }

   public static void main(String[] args) {
       motion(5, 1, 3);
   }


}
