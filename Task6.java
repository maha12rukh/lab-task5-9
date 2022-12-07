import java.util.Scanner;
class Task6 {
   public static void main(String args[])
{

      Scanner in = new Scanner(System.in);
      int choice;
      System.out.println("please enter a choice");
      System.out.println("Menu");
      System.out.println("1.chickenbiryani-350/-");
      System.out.println("2.shawarma-500/-");
      System.out.println("3.largepizza-1600/-");
      System.out.println("4.Exit");
      choice = in.nextInt();
      switch(choice)
       {
         
        case 1:
        System.out.println("chickenbiryani is chosen");
        System.out.println("chickenbiryani,s price is 350/-");
        break;

         case 2:
         System.out.println("shawarma is chosen");
         System.out.println("shawarma,s price is 500/-");
         break;

         case 3:
         System.out.println("largepizza is chosen");
         System.out.println("largepizza,s price is 1600/-");
         break;
         default:
            System.out.println("Invalid item");
}

 }
    
    }
         


      
