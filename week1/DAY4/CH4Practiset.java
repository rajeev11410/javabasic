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
    int subj3=sc.nextInt();
   if(subj1<33|| subj2<33|| subj3<33) System.out.println("your are fail");
    int total=subj1+subj2+subj3;
    double per=((double)total)/3.0;

    if(per<40) System.out.println("you are fail");
    if(per>=40) SDystem.out.println("you are pass");
    
    
  }
}

