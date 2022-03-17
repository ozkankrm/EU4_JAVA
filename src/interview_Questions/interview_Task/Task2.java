package interview_Questions.interview_Task;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);



        int i = scan.nextInt();
       // scan.nextLine();
        scan.skip("[\r\n]+");
        String s = scan.nextLine();
        double d = scan.nextDouble();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
