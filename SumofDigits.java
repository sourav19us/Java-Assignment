public class SumofDigits {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 100000);
        System.out.println("a = " + a);
        int num = 0;
        int Snum = 0;
        for (int i = 1; i != 0; i++) {
            num = a % 10;
            Snum = num + Snum;
            a = a / 10;
        }
        System.out.println("Sum of digits is " + Snum);
    }
}
