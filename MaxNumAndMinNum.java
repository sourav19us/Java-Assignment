public class MaxNumAndMinNum {
    public static void main(String[] args) {

        int a, b, c, d, max, min;

        a = (int) (Math.random() * 100);
        b = (int) (Math.random() * 100);
        c = (int) (Math.random() * 100);
        d = (int) (Math.random() * 100);
        System.out.println("a = " + a + " ,b = " + b + " ,c = " + c + " ,d = " + d);

        if (a > b) {
            max = a;
            min = b;
        } else {
            max = b;
            min = a;
        }
        // For Max No
        if (c > max) {
            max = c;

        }
        if (d > max) {
            max = d;
        }
        // For Min No
        if (c < min) {
            min = c;

        }
        if (d < min) {
            min = d;
        }
        System.out.println("Max No is  = " + max + " and min No is = " + min);
    }
}
