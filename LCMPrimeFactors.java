public class LCMPrimeFactors {
    public static void main(String[] args) {
        int a = 12, b = 15;
        System.out.println("LCM using prime factors: " + lcmUsingPrimeFactors(a, b));
    }

    public static int lcmUsingPrimeFactors(int a, int b) {
        int max = Math.max(a, b);
        int lcm = max;
        while (true) {
            if (lcm % a == 0 && lcm % b == 0) {
                return lcm;
            }
            lcm += max;
        }
    }
}
