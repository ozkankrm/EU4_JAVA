package interview_Questions.interview_Task;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        int[] A = { 10, 1, 3, 1, 2, 2, 1, 0, 4 };
        int[] B = { 5, 3, 1, 3, 2, 3 };
        int[] C = { 9, 9, 9, 9, 9 };
        int[] D = { 1, 5, 2, 4, 3, 3 };

        System.out.println(solution(A));// 3

        System.out.println(solution(B));// 1
        System.out.println(solution(C));// 2
        System.out.println(solution(D));// 3

        //hi

    }

    public static int solution(int[] A) {

        // write your code in Java SE 8
        int count = 1;
        for (int i = 0; i < A.length; i++) {

            int count2 = 1;
            int sum1 = 0;
            int sum2 = 0;

            try {
                sum1 = A[i] + A[i + 1];
                for (int j = i + 2; j < A.length; j++) {
                    sum2 = A[j] + A[j + 1];
                    if (sum1 == sum2) {
                        count2++;
                        j++;
                    }
                }
            } catch (Exception e) {

            }
            if (count2 >= count) {
                count = count2;
            }

        }

        return count;

    }


}

