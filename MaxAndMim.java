
public class MaxAndMim {
    public static void main(String[] args) {

        int max = 0, min = 100, i = 0;
        for (i = 0; i <= 10; i++) {
            int a = (int) (Math.random() * 100);
            System.out.print(a + " , ");
            if (a > max) {
                max = a;
            }
            if (a < min) {
                min = a;
            }
        }
        System.out.println(" \n Max value is " + max + ", Min value is " + min);
    }
}
