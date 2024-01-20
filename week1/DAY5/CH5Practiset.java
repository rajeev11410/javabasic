class Main{
  public static void main(String[] args){
   /* Question 1: Write a program to print the following pattern :
    ****

    ***

    **

    * */
    System.out.println("question1");

    for(int i=0;i<4;i++){
      for(int j=0;j<4-i;j++){
        System.out.print("*");
      }
      System.out.println("\n");
    }
    
    //Question 2: Write a program to sum first n even numbers using a while loop.

    System.out.println("question2");
     int n=6;
     int sum=2;
    while(n>0){
        sum+=2;
       n--;
    }
    System.out.println("sum of n first even number"+sum);
    //Question 3: Write a program to print the multiplication table of a given number n.
    System.out.println("question3");
    System.out.println("Multiplication of number n:");
    int num=9;
    for(int i=1;i<10;i++){
        System.out.print(num*i+" ");
    }
    System.out.println("\n");
    
    //Question 4: Write a program to print a multiplication table of 10 in reverse order.
    
    System.out.println("question 3");
    for(int i=10;i>0;i--){
        System.out.print(10*i+" ");
    }
    System.out.println("\n");
    //Question 5: Write a program to find the factorial of a given number using for loops.
    System.out.println("question 5");
    int  numb=1;
    for(int i=1;i<=6;i++){
        numb=numb*i;
    }
    System.out.println(numb);
    
    //Question 6: Repeat problem 5 using a while loop.
    System.out.println("question 6");
    int fnumb=1;
    int i=6;
      while(i>0){
          fnumb=fnumb*i;
          i--;
      }
      System.out.println(fnumb);
    //Question 7: Repeat problem 1 using for/while loop.
    
    System.out.println("question 7");
    int k=0;
    while(k<4){
        int j=0;
        while(j<4-k){
            System.out.print ("*");
            j++;
        }
        System.out.println("\n");
        k++;
    }
    //Question 8: What can be done using one type of loop can also be done using the other two types of loops - True or False.
    System.out.println("question 8");
    //Question 9: Write a program to calculate the sum of the numbers occurring in the multiplication table of 8.
    
    System.out.println("question 9");
    int sum8=0;
       numb=8;
       for(int m=1;m<=10;m++){
           numb=numb*i;
       }
       System.out.println("sum8:"+sum8);
       /*
       Question 10 :A do-while loop is executed:

       At least once
       At least twice
      At most once
       */
       
       //Question 11: Repeat problem 2 using for loop.
       System.out.println("question 10");
       int times=6;
       int sumb=2;
       
       for(int l=1;l<=times;l++){
           sumb+=2;
       }
    
       System.out.println(sumb);
    
    
  }
}
