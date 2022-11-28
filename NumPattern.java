import java.io.*;

public class NumPattern {
    public static void main(String[] args) {
        Console con = System.console();
        con.printf("Enter No :- "); // s.o.print() can also usse // con.printf() is same as "C"
        int a = Integer.parseInt(con.readLine());
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>> 1 <<<<<<<<<<<<<<<<<<<<<<<<<<<");
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>> 2 <<<<<<<<<<<<<<<<<<<<<<<<<<<");
        for (int i = 0; i < a; i++) {
            int n = 2 * i + 1;
            for (int j = 1; j <= n; j++) {
                System.out.print((i + 1) + " ");
            }
            System.out.println();
        }
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>> 3 <<<<<<<<<<<<<<<<<<<<<<<<<<<");
        int n = a;
        for (int i = 1; i <= a; i++) {

            for (int q = 1; q <= (n - 1); q++) {

                System.out.print("  ");

            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
                if (j == i) {
                    for (int r = j; r <= j; r--) {

                        if (i == 1) {
                            break;
                        }
                        if (r == 1) {
                            break;
                        }
                        // for (int u = i; (u == 1 && u < 2); u--) {
                        // for (int p = r; (p == 1 && p < 2); p--) {
                        // break;
                        // }
                        // }
                        System.out.print((r - 1) + " ");
                    }

                }
            }

            n -= 1;
            System.out.println();
        }
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>> 4 <<<<<<<<<<<<<<<<<<<<<<<<<<<");
        int m = 5;
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                if (i == 1) {
                    System.out.print(0 + " ");
                    m = 1;
                    break;
                }

                if (m == 1) {
                    // System.out.print(0 + " ");
                    System.out.print(1 + " ");
                    m = 0;
                    continue;
                }
                if (m == 0) {
                    // System.out.print(1 + " ");
                    System.out.print(0 + " ");
                    m = 1;
                    continue;
                }
            }
            System.out.println();
        }
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>> 5 <<<<<<<<<<<<<<<<<<<<<<<<<<<");
        int o = a;
        for (int i = 1; i <= a; i++) {

            for (int q = 1; q <= (o - 1); q++) {

                System.out.print("  ");

            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");

            }
            o -= 1;
            System.out.println();
        }

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>> 6 <<<<<<<<<<<<<<<<<<<<<<<<<<<");
        int y = 0;
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                if (y >= 10) {
                    y = 0;
                }
                System.out.print(y + " ");
                y++;
            }
            System.out.println();
        }
    }
}