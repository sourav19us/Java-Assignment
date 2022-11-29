import java.io.Console;

public class Arrays {

    public static void main(String[] args) {
        Console con = System.console();
        con.printf("Enter Length of Array :- ");
        int a = Integer.parseInt(con.readLine());
        int[] ary = new int[a];
        int max = 0;
        for (int i = 0; i < a; i++) {
            ary[i] = (int) (Math.random() * 100);
        }
        System.out.println(">>>>>>>>>>>>>>>>>>>   1   <<<<<<<<<<<<<<<<<<<<<<");
        System.out.println("Array is :-");
        for (int value : ary) {
            System.out.print(+value + " , ");
        }
        System.out.println();
        int no = 0;
        int ino = 0;
        int ano = 0;
        for (int i = 0; i < ary.length; i++) {

            for (int j = no; j < ary.length; j++) {
                if (max <= ary[j]) {
                    max = ary[j];
                    ino = j;
                }
            }
            no += 1;
            // System.out.println(no + " max " + max);
            ano = ary[i];
            ary[i] = max;
            ary[ino] = ano;
            max = 0;
        }
        // System.out.println("index = " + ino);
        System.out.println("Array  in ascending order is :-");
        for (int value : ary) {
            System.out.print(+value + " , ");
        }

        System.out.println("\n>>>>>>>>>>>>>>>>>>>   2    <<<<<<<<<<<<<<<<<<<<<<");
        System.out.print("Enter No to Left Shift :- ");
        int n = Integer.parseInt(con.readLine());
        for (int i = 0; i < ary.length; i++) {
            if ((i + n) < ary.length) {
                ary[i] = ary[(i + n)];
            } else {
                ary[i] = 0;
            }
        }
        System.out.println("Array in " + n + "th left shift order is :-");
        for (int value : ary) {
            System.out.print(+value + " , ");
        }
        System.out.println("\n>>>>>>>>>>>>>>>>>>>   3    <<<<<<<<<<<<<<<<<<<<<<");
        int arno = 0;

        for (int j = 0; j < n; j++) {

            for (int i = 0; i < ary.length; i++) {
                if ((i + 1) < ary.length) {
                    arno = ary[i];
                    ary[i] = ary[(i + 1)];
                    ary[(i + 1)] = arno;
                }

            }
        }

        System.out.println("Array  in " + n + "th left shift in circuler order is :-");
        for (int value : ary) {
            System.out.print(+value + " , ");
        }

        System.out.println("\n>>>>>>>>>>>>>>>>>>>   4   <<<<<<<<<<<<<<<<<<<<<<");
        int ary1[] = new int[10];

        for (int i = 0; i < 10; i++) {
            ary1[i] = (int) (Math.random() * 10);
        }
        System.out.println("\nArray is :-");
        for (int value : ary1) {
            System.out.print(+value + " , ");
        }
        int nomax = 0;
        for (int i = 0; i < ary1.length; i++) {

            for (int j = 0; j < ary1.length; j++) {
                if (nomax <= ary1[j]) {
                    nomax = ary1[j];
                }
            }
        }
        System.out.println("\n max Element is :-" + nomax);
        System.out.println("\n * Patten  for Array is :-");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < ary1.length; j++) {
                if (ary1[j] > nomax) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }

            }
            nomax -= 1;
            System.out.println();
        }
    }
}
