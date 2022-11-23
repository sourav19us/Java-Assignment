public class NumCheck {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 100000);
        int c = a;
        int b = (int) (Math.random() * 10);
        System.out.println("a = " + a + " , b = " + b);
        int num = 0, bnum = 0;
        for (int i = 1; i != 0; i++) {
            num = a % 10;
            if (num == b) {
                bnum += 1;
            }
            a = a / 10;
        }
        if (bnum != 0) {
            System.out.println(b + " appear in " + c + " = " + bnum + " Times");
        } else {
            System.out.println(b + " is not appear in " + c);
        }
    }
}
