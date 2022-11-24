public class NumSeries {
    public static void main(String[] args) {
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>> 1 <<<<<<<<<<<<<<<<<<<<<<<<<<<");
        int n = 0, m, b;
        for (int i = 1; i <= 100; i++) {
            b = i;

            for (int j = 0; j <= 100; j++) {
                if (b != 0) {

                    m = b % 10;
                    n = m + (n * 10);
                    b = b / 10;
                } else {
                    break;
                }
            }
            if (n == i) {
                System.out.print(n + " , ");
            }
            n = 0;
        }
        System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>>>>> 2 <<<<<<<<<<<<<<<<<<<<<<<<<<<");
        int num = 0, max = 0, Smax = 0;
        for (int i = 0; i < 10; i++) {
            int a = (int) (Math.random() * 100);
            System.out.print(a + " ");
            if (i == 0) { // first give 1st digit to max
                max = a;
            }
            if (i >= 1) {
                if (max < a) {
                    max = a;
                    num += 1;
                } else {
                    if (num > Smax) {
                        Smax = num;
                    }
                    num = 0;
                    max = a;
                }
            }
        }
        if (Smax == 0) {
            System.out.println("\nLenght of longest series is =  Zero");
        } else {

            System.out.println("\nLenght of longest series is  = " + (Smax + 1));
        }
    }
}
