public class CountMultiples {
   public static int CountMultiples(int num1, int num2) {
      int count = 0;
      for (int n = 1; n<= num1; n++) {
        if (n % num2 == 0) {
            count++; 
         }
      }
      return count;
   }

   public static void main(String[] args) {
      System.out.println(CountMultiples(20, 5));
   }
}