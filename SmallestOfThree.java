public class SmallestOfThree {
    public static void main(String[] args) {
        int a = 10, b = 15, c = 5;
        int smallest = Math.min(a, Math.min(b, c));
        System.out.println("Smallest number is: " + smallest);
    }
}
