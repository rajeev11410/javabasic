import java.util.Scanner;

class Calculator {
    public int add(int a, int b) throws MaxInputException {
        if (a > 100000 || b > 100000) {
            throw new MaxInputException("Input exceeds maximum limit (100000)");
        }
        return a + b;
    }

    public int subtract(int a, int b) throws  MaxInputException {
        if (a > 100000 || b > 100000) {
            throw new MaxInputException("Input exceeds maximum limit (100000)");
        }
        return a - b;
    }

    public int multiply(int a, int b) throws MaxInputException {
        if (a > 100000 || b > 100000) {
            throw new MaxInputException("Input exceeds maximum limit (100000)");
        }
        if (a > 7000 || b > 7000) {
            throw new MaxInputException("Input exceeds maximum multiplier limit (7000)");
        }
        return a * b;
    }

    public int divide(int a, int b) throws  MaxInputException {
        if (a > 100000 || b > 100000) {
            throw new MaxInputException("Input exceeds maximum limit (100000)");
        }
  
        return a / b;
    }
}



public class Calculator1 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
      Scanner sc=new Scanner(System.in);
      System.out.println("enter number A and B");
      int a=sc.nextInt();
      int b=sc.nextInt();
        try {
            int result = calculator.add(a, b);
            System.out.println("Addition Result: " + result);
           result=calculator.subtract(a,b);
           System.out.println("subtract resul: "+result);
          result=calculator.multiply(a,b);
           System.out.println("multiplied result: "+result);
             result =calculator.divide(a, b);
           System.out.println("divided result: "+result);
           
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
