public class WhilePractice {
   public static void main(String[] args) {
      System.out.println(sumAllNumbersLessThan(20));  
   }
   public static int sumAllNumbersLessThan(int num) {
      int sum = 0;
      for (int i = 0; i < num; i++) {
         sum = sum + i;
         
      }
      return sum;
   }
}