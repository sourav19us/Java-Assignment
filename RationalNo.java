// package OOPs;

public class RationalNo {
    private int a;
    private int b;

    public void set(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void get() {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println(a + "/" + b);
    }

    public RationalNo add(RationalNo ref) {
        RationalNo temp = new RationalNo();
        temp.a = a * ref.b + b * ref.a;
        temp.b = b * ref.b;
        return temp;
    }

    public RationalNo less(RationalNo ref) {
        RationalNo temp = new RationalNo();
        temp.a = a * ref.b - b * ref.a;
        temp.b = b * ref.b;
        return temp;
    }

    public RationalNo mult(RationalNo ref) {
        RationalNo temp = new RationalNo();
        temp.a = a * ref.a;
        temp.b = b * ref.b;
        return temp;
    }

    public RationalNo divide(RationalNo ref) {
        RationalNo temp = new RationalNo();
        temp.a = a * ref.b;
        temp.b = b * ref.a;
        return temp;
    }

}
