public class DigitsInWorde {
    public static void main(String[] args) {
        int a, b, c, d, Num;
        Num = (int) (Math.random() * 10000);
        a = Num / 1000;
        b = (Num / 100) - (a * 10);
        c = Num / 10 - ((a * 100) + (b * 10));
        d = Num - ((a * 1000) + (b * 100) + (c * 10));
        System.out.println("Num is = " + Num);
        System.out.println("a = " + a + " ,b = " + b + " ,c = " + c + " ,d = " + d);
        switch (a) {
            case 0:
                System.out.print("Zero ");
                break;
            case 1:
                System.out.print("one ");
                break;
            case 2:
                System.out.print("Two ");
                break;
            case 3:
                System.out.print("Three ");
                break;
            case 4:
                System.out.print("Four ");
                break;
            case 5:
                System.out.print("Five ");
                break;
            case 6:
                System.out.print("Six ");
                break;
            case 7:
                System.out.print("Seven ");
                break;
            case 8:
                System.out.print("Eight ");
                break;
            case 9:
                System.out.print("Nine ");
                break;

            default:
                break;
        }
        switch (b) {
            case 0:
                System.out.print("Zero ");
                break;
            case 1:
                System.out.print("one ");
                break;
            case 2:
                System.out.print("Two ");
                break;
            case 3:
                System.out.print("Three ");
                break;
            case 4:
                System.out.print("Four ");
                break;
            case 5:
                System.out.print("Five ");
                break;
            case 6:
                System.out.print("Six ");
                break;
            case 7:
                System.out.print("Seven ");
                break;
            case 8:
                System.out.print("Eight ");
                break;
            case 9:
                System.out.print("Nine ");
                break;

            default:
                break;
        }
        switch (c) {
            case 0:
                System.out.print("Zero ");
                break;
            case 1:
                System.out.print("one ");
                break;
            case 2:
                System.out.print("Two ");
                break;
            case 3:
                System.out.print("Three ");
                break;
            case 4:
                System.out.print("Four ");
                break;
            case 5:
                System.out.print("Five ");
                break;
            case 6:
                System.out.print("Six ");
                break;
            case 7:
                System.out.print("Seven ");
                break;
            case 8:
                System.out.print("Eight ");
                break;
            case 9:
                System.out.print("Nine ");
                break;

            default:
                break;
        }
        switch (d) {
            case 0:
                System.out.print("Zero ");
                break;
            case 1:
                System.out.print("one ");
                break;
            case 2:
                System.out.print("Two ");
                break;
            case 3:
                System.out.print("Three ");
                break;
            case 4:
                System.out.print("Four ");
                break;
            case 5:
                System.out.print("Five");
                break;
            case 6:
                System.out.print("Six ");
                break;
            case 7:
                System.out.print("Seven ");
                break;
            case 8:
                System.out.print("Eight ");
                break;
            case 9:
                System.out.print("Nine ");
                break;

            default:
                break;
        }
    }

}
