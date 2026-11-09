public class FindMinimum {
   
   public static int findMin() {
    
      int num2 = 100;
      int num = 100;
      for(int i = 1; i <= 10; i++) {
         if (i == 1) {
            num = (int) (Math.random() * 100);
         } else {
            num2 = (int) (Math.random() * 100);
         }
         if(num2 <= num) {
            num = num2;
         }
      }
      return num;
    }

   public static void main(String[] args) {
      System.out.println(findMin());
   }
}