

//ALL QUETIONS ARE SOLVED IN THIS FILE
public class Method {
    public static void main(String[] args) {
    // question 1.Create an array of 5 floats and calculate their sum.
        System.out.println("question1");
         float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        float sum = 0;
        for(float element:marks){
            sum = sum + element;
        }
        System.out.println("The value of sum is " + sum);


     // queston 2.Write a program to find out whether a given integer is present in an array or not.
      System.out.println("quation2");
        float [] marks2 = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        float num = 45.57f;
        boolean isInArray = false;
        for(float element:marks2){
            if(num==element){
                isInArray = true;
                break;
            }
        }
        if(isInArray){
            System.out.println("The value is present in the array");
        }
        if(!isInArray){
            System.out.println("The value is not present in the array");
        }


        // question2.Calculate the average marks from an array containing marks of all students in physics using a for-each loop.
         System.out.println("question3");
        float [] marks3 = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
          sum = 0;
        for(float element:marks){
            sum = sum + element;
        }
        System.out.println("The value of average marks is " + sum/marks.length);


    // question 4.Create a Java program to add two matrices of size 2x3.
        System.out.println("queston 4");
      
        int [][] mat1 = {{1, 2, 3},
                         {4, 5, 6}};
        int [][] mat2 = {{2, 6, 13},
                         {3, 7, 1}};
        int [][] result = {{0, 0, 0},
                           {0, 0, 0}};

        for (int i=0;i<mat1.length;i++){ // row number of times
            for (int j=0;j<mat1[i].length;j++) { // column number of time
           System.out.format(" Setting value for i=%d and j=%d\n", i, j);
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
      
       
        // Printing the elements of a 2-D Array
        for (int i=0;i<mat1.length;i++){ // row number of times
            for (int j=0;j<mat1[i].length;j++) { // column number of time
                System.out.print(result[i][j] + " ");
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
            System.out.println(""); // Prints a new line
        }

      
      //question 5.Write a Java program to reverse an array.
      System.out.println("question 5");
        int [] arr = {1, 21, 3, 4, 5, 34, 67};
        int l = arr.length;
        int n = Math.floorDiv(l, 2);
        int temp;

        for(int i=0; i<n; i++){
            // Swap a[i] and a[l-1-i]
            // a   b   temp
            // |4| |3| ||
            temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;
        }

        for(int element: arr){
            System.out.print(element + " ");
        }
          System.out.println("\n");
        // question 6.Write a Java program to find the maximum element in an array.
      System.out.println("question 6");
      int [] arr2 = {1, 2100, 3, 455, 5, 34, 67};
        int max = Integer.MIN_VALUE;
        for(int e: arr2){
            if(e>max){
                max = e;
            }
        }
        System.out.println("the value of the maximum element in this array is: "+ max);

        // Practice Problem 6
        // System.out.println(Integer.MIN_VALUE);
        // System.out.println(Integer.MAX_VALUE);
      
        // Practice Problem 7
      System.out.println("question 7");
        boolean isSorted = true;
        int [] arr3 = {1, 12, 3, 4, 5, 34, 67};
        for(int i=0;i<arr3.length-1;i++){
            if(arr3[i] > arr3[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("The Array is sorted");
        }
        else{
            System.out.println("The Array is not sorted");
        }


    }
}
