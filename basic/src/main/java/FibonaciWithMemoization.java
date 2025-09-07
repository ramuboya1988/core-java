import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FibonaciWithMemoization {
    private static Map<Integer, Integer> memo = new HashMap<>();

    public static void main(String[] args) {
        System.out.println("Please enter length of fibonaci series...");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.print(fibonaci(i) + " ");
        }
    }

    private static int fibonaci(int n) {
        if (n <= 1)
            return n;
        if (memo.containsKey(n))
            return memo.get(n);
        int result = fibonaci(n - 1) + fibonaci(n - 2);
        memo.put(n, result);
        return result;
    }
}
