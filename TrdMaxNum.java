public class TrdMaxNum {
    public static void main(String[] args) {
        int a, b, c, d, max, Tmax, Smax;

        a = (int) (Math.random() * 100);
        b = (int) (Math.random() * 100);
        c = (int) (Math.random() * 100);
        d = (int) (Math.random() * 100);
        System.out.println("a = " + a + " ,b = " + b + " ,c = " + c + " ,d = " + d);
        if (a > b) {
            max = a;
            Smax = b;
            Tmax = 0;
        } else {
            max = b;
            Smax = a;
            Tmax = 0;
        }
        if (c > max) {
            Tmax = Smax;
            Smax = max;
            max = c;

        } else {
            if (c > Smax) { // if c < Smax than else part work
                Tmax = Smax;
                Smax = c;
            } else {
                Tmax = c;
            }
        }
        if (d > max) { // if d < max then else part work
            Tmax = Smax;
            Smax = max;
            max = d;
        } else {
            if (d > Smax) { // if d < Smax then else part work // And checke d > Tmax
                Tmax = Smax;
                Smax = d;
            } else {
                if (d > Tmax) {
                    Tmax = d;
                }
            }
        }

        System.out.println("1rd Max No is = " + max);
        System.out.println("2rd Max No is = " + Smax);
        System.out.println("3rd Max No is = " + Tmax);
    }
}
