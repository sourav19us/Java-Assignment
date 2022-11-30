import java.io.Console;

public class Strings {

    public static void main(String[] args) {
        Console con = System.console();
        System.out.print("enter a string :- ");
        String str = con.readLine();

        System.out.println(">>>>>>>>>>>>>>>>>>>   1  <<<<<<<<<<<<<<<<<<");

        String str1 = str.trim();
        char arr[] = new char[str1.length()];
        char arr1[] = new char[str1.length()];
        str1.getChars(0, str1.length(), arr, 0);
        for (int i = 0, j = (arr.length - 1); i < arr.length; i++, j--) {
            arr1[j] = arr[i];
        }
        for (char c : arr1) {
            System.out.print(c);
        }
        String str3;
        str3 = String.copyValueOf(arr1);
        int no = str1.compareTo(str3);
        if (no == 0) {
            System.out.println("\nString is Polindrome");
        } else {
            System.out.println("\nString is Not Polindrome");
        }

        System.out.println(">>>>>>>>>>>>>>>>>>>   2  <<<<<<<<<<<<<<<<<<");

        int cno = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ' ') {
                continue;
            } else {
                cno += 1;
            }
        }
        System.out.println("No. of Char In String is :- " + cno);

        System.out.println(">>>>>>>>>>>>>>>>>>>   3  <<<<<<<<<<<<<<<<<<");
        int ino = 0;
        int ino2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != ' ') {
                if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u') {
                    ino += 1;
                } else {
                    ino2 += 1;
                }
            }
        }
        System.out.println(" In String No. of Vowels is :- " + ino + " and No. of Consonants is :- " + ino2);

        System.out.println(">>>>>>>>>>>>>>>>>>>   4  <<<<<<<<<<<<<<<<<<");
        int fno = 1;
        char ch;
        int j = 0;
        for (int i = 1; i <= str1.length(); i++) {
            fno = fno * i;
        }
        for (int i = 0; i < fno; i++) {

            if ((j + 1) < str1.length()) {
                ch = arr[j];
                arr[j] = arr[(j + 1)];
                arr[(j + 1)] = ch;
                j += 1;
            } else {
                ch = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = ch;
                j = 0;
            }
            for (char c : arr) {
                System.out.print(c);
            }
            System.out.println();

        }
    }

}
