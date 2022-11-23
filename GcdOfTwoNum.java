public class GcdOfTwoNum {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 100);
        int b = (int) (Math.random() * 100);
        // a = 3;
        // b = 27;
        int max = 1;
        System.out.println("a = " + a + " , b = " + b);
        int Gnum = 1;// G.C.M
        if (a != 0 && b != 0) {

            for (int i = 1; i <= 100; i++) {
                if (((a % i == 0) && (b % i == 0))) {
                    if (i > max) {
                        Gnum = i;
                    }
                }

            }
        }
        if (a == 0 | b == 0) {
            if (a == 0) {
                Gnum = b;
            } else {
                Gnum = a;
            }
        }
        if (a == 0 && b == 0) {
            Gnum = 0;
        }
        System.out.println(a + " and " + b + " GCD is = " + Gnum);
    }
}
