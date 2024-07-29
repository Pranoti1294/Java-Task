public class ArmstrongCheck {
    public static void main(String[] args) {
        int number = 153;
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
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
