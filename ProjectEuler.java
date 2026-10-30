public class ProjectEuler { 

   public static int problem1() {
      int sum = 0;
      
      for (int i = 0; i < 1000; i++) {
         
         if (i % 5 == 0 || i % 3 == 0) {
            sum += i;
         
         }
      }     
      return sum;
   }
   
   public static int problem2() {
      for(int i = 0; i < 4000000; i++) {
         
         
         if (
      
      return 0;
   }
   
   public static void main(String[] args) {
      System.out.println("The answer to problem 1 is: " + problem1());
      System.out.println("The answer to problem 2 is: " + problem2());      
   }  
   }
