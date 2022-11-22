public class EvenNub {

    public static void main(String[] args) {
        int a, b, c, d, even = 0;

        a = (int) (Math.random() * 100);
        b = (int) (Math.random() * 100);
        c = (int) (Math.random() * 100);
        d = (int) (Math.random() * 100);
        System.out.println("a = " + a + " ,b = " + b + " ,c = " + c + " ,d = " + d);
        if (a % 2 == 0) {
            even += 1;
        }
        if (b % 2 == 0) {
            even += 1;
        }
        if (c % 2 == 0) {
            even += 1;
        }
        if (d % 2 == 0) {
            even += 1;
        }
        System.out.println("Total Even No is = " + even);

    }
}
