// package OOPs;

public class UseRational {
    public static void main(String[] args) {
        RationalNo obj = new RationalNo();
        RationalNo obj2 = new RationalNo();
        RationalNo obj3 = new RationalNo();
        obj.set(2, 5);
        obj2.set(2, 5);
        obj3 = obj.add(obj2);
        obj.get();
        obj2.get();
        obj3.get();
        obj3 = obj.less(obj2);
        obj3.get();
        obj3 = obj.mult(obj2);
        obj3.get();
        obj3 = obj.divide(obj2);
        obj3.get();
    }
}