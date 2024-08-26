import java.util.Scanner;
public class IT24101125Lab5Q1
 { 
   public static void main(String[]arge)
    {
      Scanner input = new Scanner(System.in);

      int n1,n2,n3,enteredNumbers;

      System.out.print("Enter first Integer:");
      n1 = input.nextInt();

      System.out.print("Enter second Integer:");
      n2 = input.nextInt();

      System.out.print("Enter third Integer:");
      n3 = input.nextInt();

      enteredNumbers = (n1+n2+n3);
      System.out.println("User entered numbers are:"+ enteredNumbers);

      if (n1<n2 && n1<n3)
        {System.out.println("The Smallest number is:"+ n1);}
      else if (n2<n1 && n2<n3)
        {System.out.println("The Smallest number is:"+ n2);}
      else 
        {System.out.println("The Smallest number is:"+ n3);}
          
      if  (n1>n2 && n1>n3)
        {System.out.println("The Lagest number is:"+ n1);}
      else if (n2>n1 && n2>n3)
        {System.out.println("The Lagest number is:"+ n2);}
      else 
        {System.out.println("The Lagest number is:"+ n3);}
    }
 }
      