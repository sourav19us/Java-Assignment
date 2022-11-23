public class FactorialOfNum {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 10);
        int num = 1;
        for (int i = 1; i <= a; num = i * num, i++) {
        }
        System.out.println(a + "! = " + num);
    }
}
