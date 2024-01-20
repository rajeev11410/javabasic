import java.util.*;
import java.util.Scanner;
//import java.util.Scanner.nextDouble();

class CH4Practiset {
  public static void main(String[] args) {
    System.out.println("hello world");
//  Question 1 : What will be the output of this program:
    System.out.println("question1");
     int a=10;
    if(a==11)
      System.out.println(" i am 11");
    if(a!=11) System.out.println("i am not 11");

    // Write a program to find out whether a student is pass or fail;
    //if it requires a total of 40% and at least 33% in each subject to 
    //pass. Assume 3 subjects and take marks as input from the user.

    System.out.println("question2");
    System.out.println("Enter the marks of three Subjects");
    Scanner sc=new Scanner(System.in);

    int  subj1=sc.nextInt();
    int  subj2=sc.nextInt();
    int  subj3=sc.nextInt();
   if(subj1<33|| subj2<33|| subj3<33) System.out.println("your are fail");
    int total=subj1+subj2+subj3;
    double per=((double)total)/3.0;

    if(per<40) System.out.println("you are fail");
    if(per>=40) System.out.println("you are pass");

     /*Question 3 :Calculate income tax paid by an employee to the 
     government as per the slabs mentioned below:

    Income Slab	Tax
    2.5L – 5.0L  	5%
    5.0L – 10.0L 	20%
    Above 10.0L	30%
    Note that there is not tax below 2.5L. Take the input amount as input 
    from the user. */
    System.out.println("question3");
    System.out.println("Enter the Income in lakh");
    Double income=sc.nextDouble();

    if(income<2.5) System.out.println("no tax");
    if(income>=2.5 && income<5.0) System.out.println("tax is 5%");
    if(income>=5.0 && income<10.0) System.out.println("tax is 20%") ;
    if(income>=10.0) System.out.println("tax is 30%");

    /*Question 4: Write a Java program to find out the day of the week 
      given the number [1 for Monday, 2 for Tuesday … and so on!] */
    System.out.println("question4");

    System.out.println("Enter the number ");

    int num=sc.nextInt();
    switch(num){

      case 1:System.out.println("monday");
      case 2: System.out.println("teusday");
      case 3: System.out.println("wednesday");
      case 4: System.out.println("Thursday");
      case 5: System.out.println("friday");
      case 6: System.out.println("saturday");
      case 7: System.out.println("sunday");

      default: System.out.println("Invalid Day");
    }
    /*
     Question 5:Write a Java program to find whether a year entered by the 
       user is a leap year or not.
    */
    System.out.println("Question 5");

    System.out.println("Enter the year");
    int year=sc.nextInt();

    if(year%4==0) System.out.println("leap year");
    if(year!=0) System.out.println("not a leap year");
   /*Question 6:Write a program to find out the type of website from the 
       URL:

    .com – commercial website
    .org – organization website
    .in – Indian website
      */
    System.out.println("question6");
    System.out.println("Enter the URL");
    String url=sc.next();

    if(url.endsWith(".com")) System.out.println("commercila website");
    else if(url.endsWith(".org")) System.out.println("organisation websit");
    else if(url.endsWith(".in")) System.out.println("Indian Website");
  }
}


