/*
we can handle specific exception by using multiple catch block
*/
package ExceptionHandling;

import java.util.Scanner;

public class HandlingSpecificException81 {
    public static void main(String[] args) {
        int [] marks = new int[3];
        marks[0]= 75;
        marks[1]=36;
        marks[2]=22;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array index ");
       int a = sc.nextInt();
       System.out.println("Enter the no from which you want to divide ");
       int b = sc.nextInt();
       try {
           System.out.println("the value at index "+a+" is: "+marks[a]);
           System.out.println("the value after dividing "+marks[a]+" by "+b+" is: "+(marks[a]/b));
       }
       catch(ArithmeticException e){
           System.out.println("Arithmetic Exception occurred ");
           System.out.println(e);
       }
       catch(ArrayIndexOutOfBoundsException e){
           System.out.println("there is no value at this array index");
       }

       catch (Exception e ){
           System.out.println("some unexpected exception occurred ");
           System.out.println(e);
       }
    }
}
