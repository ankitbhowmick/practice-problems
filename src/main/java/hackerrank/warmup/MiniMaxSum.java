package hackerrank.warmup;

import java.util.Scanner;

public class MiniMaxSum {

    // Complete the miniMaxSum function below.
    //https://www.hackerrank.com/challenges/mini-max-sum/problem

    static void miniMaxSum(int[] arr) {
        int max = arr[0], min = arr[0];
        //Sum is overflowing in the Question
        long sum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            sum += arr[i];
            if (arr[i] > max)
                max = arr[i];

            else if (arr[i] < min)
                min = arr[i];
        }
        System.out.println((sum - max) + " " + (sum - min));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
