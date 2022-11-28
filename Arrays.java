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
        for (int value : ary1) {
            System.out.print(+value + " , ");
        }

        for (int i = 0; i < 10; i++) {
            ary1[i] = (int) (Math.random() * 10);
        }
        System.out.println("\nArray is :-");
        for (int value : ary1) {
            System.out.print(+value + " , ");
        }
        System.out.println("\n * Patten  for Array is :-");
        int t1 = 0, t2 = 0, t3 = 0, t4 = 0, t5 = 0, t6 = 0, t7 = 0, t8 = 0, t9 = 0, t10 = 0;
        for (int i = 0; i < ary1.length; i++) {
            for (int j = 0; j < ary1.length; j++) {
                if ((i == (ary1.length - ary1[0] + t1)) && j == 0) {
                    System.out.print("*");
                    t1 += 1;
                } else {
                    System.out.print(" ");
                }
                if ((i == (ary1.length - ary1[1] + t2)) && j == 1) {
                    System.out.print("*");
                    t2 += 1;
                } else {
                    System.out.print(" ");
                }
                if ((i == (ary1.length - ary1[2] + t3)) && j == 2) {
                    System.out.print("*");
                    t3 += 1;
                } else {
                    System.out.print(" ");
                }
                if ((i == (ary1.length - ary1[3] + t4)) && j == 3) {
                    System.out.print("*");
                    t4 += 1;
                } else {
                    System.out.print(" ");
                }
                if ((i == (ary1.length - ary1[4] + t5)) && j == 4) {
                    System.out.print("*");
                    t5 += 1;
                } else {
                    System.out.print(" ");
                }
                if ((i == (ary1.length - ary1[5] + t6)) && j == 5) {
                    System.out.print("*");
                    t6 += 1;
                } else {
                    System.out.print(" ");
                }
                if ((i == (ary1.length - ary1[6] + t7)) && j == 6) {
                    System.out.print("*");
                    t7 += 1;
                } else {
                    System.out.print(" ");
                }
                if ((i == (ary1.length - ary1[7] + t8)) && j == 7) {
                    System.out.print("*");
                    t8 += 1;
                } else {
                    System.out.print(" ");
                }
                if ((i == (ary1.length - ary1[8] + t9)) && j == 8) {
                    System.out.print("*");
                    t9 += 1;
                } else {
                    System.out.print(" ");
                }
                if ((i == (ary1.length - ary1[9] + t10)) && j == 9) {
                    System.out.print("*");
                    t10 += 1;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
