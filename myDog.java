import java.util.Scanner;



public class myDog {
   public static void main(String[] args) {
   
   String dogName = "Max";
   boolean isFat = true;
   int ageYear = 13; 
   double dogWeight = 50.67;
   
   Scanner scan = new Scanner(System.in);
   
   System.out.println("what is your dogs name: ");
   dogName = scan.nextLine();
   
   System.out.println("how old is your dog now: ");
   ageYear = scan.nextInt();
   
   
   System.out.println("the year is 2030, how old is " + dogName + " now: ");
   int ageYearNew = scan.nextInt();
   
   int ageDiff = ageYearNew - ageYear;
   
   System.out.println("Your dog aged " + ageDiff + " years.");
   
   
   }
   
 }