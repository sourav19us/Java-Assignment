public class MaxNumOccur {
    public static void main(String[] args) {
        int max = 0, Onum = 0, i = 0;
        for (i = 0; i <= 10; i++) {
            int a = (int) (Math.random() * 100);
            System.out.print(a + " , ");
            if (a >= max) {
                if (a == max) {
                    Onum += 1;
                }
                max = a;
            }
        }
        if (Onum >= 1) {
            Onum += 1;
        }
        System.out.println(" \n Max value is " + max + ", and it occurrence " + Onum);
    }
}
