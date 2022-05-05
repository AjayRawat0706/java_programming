package ExceptionHandling;

import java.util.Scanner;

public class NestedTryCatch82 {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 32;
        marks[1] = 46;
        marks[2] = 60;
        boolean flag = true;
        while (flag) {
            try {
                System.out.println("good morning ");
//           int x = 36;
//           int c = x/0;             --> this will give exception at level one
//           System.out.println(c);
                System.out.println("enter the index value to see the marks");
                Scanner sc = new Scanner(System.in);
                int a = sc.nextInt();
                try {
                    System.out.println("the marks at index value " + a + " is: " + marks[a]);
                    flag = false;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("there is no marks at this index value");
                    System.out.println("there is exception in level 2 ");
                }

            } catch (Exception e) {
                System.out.println("there is exception in level 1 ");
            }

            System.out.println("program ended successfully");
        }
    }
}
