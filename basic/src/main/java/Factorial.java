import java.util.HashMap;
import java.util.Map;

public class Factorial {
    private static Map<Integer, Integer> memo = new HashMap<>();
    public static void main(String[] args) {
        int number=5, fact=1;

        fact = factorialWithLoop(number);
        System.out.println("Factorial of "+ number + " with loop is " + fact);
        fact = factoaialWithRecursion(number);
        System.out.println("Factorial of "+ number + " with recursion is " + fact);
        fact = factorialWithDynamic(number);
        System.out.println("Factorial of "+ number + " with dynamic is " + fact);
        fact = factorialWithMemoization(number);
        System.out.println("Factorial of "+ number + " with memoization is " + fact);
    }

    private static int factorialWithMemoization(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        int result = n * factorialWithMemoization(n - 1);
        memo.put(n, result);
        return result;
    }

    private static int factorialWithDynamic(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            dp[i] = dp[i - 1] * i;
        }
        return dp[n];
    }

    private static int factoaialWithRecursion(int n) {
        if (n == 0)
            return 1;
        else
            return(n * factoaialWithRecursion(n-1));
    }

    private static int factorialWithLoop(int num) {
        int fact = 1;
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
        return fact;
    }
}
