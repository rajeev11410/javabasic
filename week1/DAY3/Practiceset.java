import java.util.Scanner;

public class Practiset{
  public static void main(String[] args){
     //  Write a Java program to convert a string to lowercase.
    Scanner sc=new Scanner(System.in);
    System.out.println("problem1:");
      String name="RAJEEV";
    System.out.println("lowecase name:="+name.toLowerCase());

    //Write a Java program to replace spaces with underscores.
    System.out.println("problem2:");
    String name1="rajeev kumar";
    System.out.println("replace space with underscore:"+name1.replace(" ","_"));
   // Write a Java program to fill in a letter template which looks like below:
    // letter = “Dear <|name|>, Thanks a lot”

    // Replace <|name|> with a string (some name)

    System.out.println("problem3:");
    String yourname=sc.nextLine();

    System.out.println("Dear "+yourname+", thanks a lot");
    //Write a Java program to detect double and triple spaces in a string
    System.out.println("problem4:");
    String myString = "This string contains double and  triple spaces";
    System.out.println(myString.contains("  ")|| myString.contains("   "));

    //Write a Java program to format the following letter using escape sequence:
    System.out.println("problem5:");
    String myLetter = "Dear Harry,\n\tThis Java Course is Nice.\nThanks!";
    System.out.println(myLetter);
    
    
    
  }
}
