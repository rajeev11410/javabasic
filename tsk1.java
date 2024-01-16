import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);

      int sub1=sc.nextInt();
      int sub2=sc.nextInt();
      int sub3=sc.nextInt();
      int sub4=sc.nextInt();
      int sub5=sc.nextInt();

      int totalmarks=(sub1+sub2+sub3+sub3+sub4+sub5);
         Double percentage= ((double)totalmarks/500)*100;
         System.out.println("percentage:"+percentage);
    }
}
