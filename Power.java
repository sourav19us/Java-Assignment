public class Power {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 10);
        int b = (int) (Math.random() * 10);
        System.out.println("a = " + a + " , b = " + b);
        int num = 1;
        for (int i = 1; i <= b; num = num * a, i++) {
        }
        System.out.println(a + "^" + b + " = " + num);
    }
}
