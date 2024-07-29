public class ArmstrongNumbers1To1000 {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isArmstrong(int number) {
        int original = number;
        int sum = 0;
        int n = Integer.toString(number).length();
        while (number != 0) {
            int digit = number % 10;
            sum += Math.pow(digit, n);
            number /= 10;
        }
        return sum == original;
    }
}
