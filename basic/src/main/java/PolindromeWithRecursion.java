public class PolindromeWithRecursion {
    public static void main(String[] args) {
        int num = 12021, rev = 0;
         rev = reverseNum(num,rev);

         if(num == rev)
             System.out.println(num + " is polindrome");
         else
             System.out.println(num + " is not polindrome");
    }

    private static int reverseNum(int num, int rev) {
        if(num<=0)
                return rev;
        int rem = num%10;
        rev = rev*10 + rem;
        return reverseNum(num/10, rev);

    }
}
