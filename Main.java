import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
// sum of three Number
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
       int a=10;
       int b=19;
       int c=89;
       int sum=a+b+c;
       System.out.println("PS1"+"sum="+sum);

       //Write a program to calculate CGPA using marks of three subjects (out of 100)
        int subj1=90;
        int subj2=89;
        int subj3=78;

        int avg=(subj1+subj2+subj3)/3;
        System.out.println("PS2"+"CGPA Out of 100="+avg);
//    ps3
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name:");
        String name=sc.nextLine();
        System.out.println("PS3");
        System.out.println("Hello "+name+", Have a good day");
        //ps4
        // Write a Java program to convert Kilometers to
        System.out.println("PS4");
        System.out.println("Enter KM");

        double InputKM=sc.nextDouble();
        double mile=InputKM*(0.62);

        System.out.println("mile="+mile);
        //ps5
        //Write a Java program to detect whether a number entered by the user is an integer or not
        System.out.println("PS5");
        System.out.println("Enter Integer");
        int numb=sc.nextInt();
        System.out.println("Enter number:"+numb);
    }
}