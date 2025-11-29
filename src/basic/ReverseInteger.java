package basic;

public class ReverseInteger {
    public static void main(String[] args) {
        // this num overflow upon reversal
        int num = 1534236469;
        long rev = 0;
        while (num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }
        if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) System.out.println(0);
        else System.out.println((int) rev);
    }
}
