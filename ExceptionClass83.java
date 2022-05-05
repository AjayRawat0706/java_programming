/*
we can write our custom exception using exception class
*/
package ExceptionHandling;

import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString() {
        return "i am to string";
    }

    @Override
    public String getMessage() {
        return "i am get message";
    }
}

public class ExceptionClass83 {
    public static void main(String[] args) {
     int a;
        Scanner sc = new Scanner(System.in);
        a= sc.nextInt();
        if (a<10){
            try {
               // throw new MyException();
                throw new ArithmeticException("this is an exception");
            }
            catch (Exception e ){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);
                e.printStackTrace();  //printStackTrace method is a method of Java's throwable class which prints the throwable along with  other
                // details like the line number and class name where the exception occurred. printStackTrace() is very useful in diagnosing exceptions.
            }
        }
    }
}
