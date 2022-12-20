import java.io.Console;

import pkg.Book;
import pkg.Dvd;
import pkg.item.Item;

public class Library {
    public static void main(String[] args) {

        Console con = System.console();

        Item ref[] = new Item[10];

        for (int i = 0; i < ref.length; i++) {
            System.out.print("Book or DVD < b / d > :- ");
            String str = con.readLine();
            if (str.equalsIgnoreCase("b")) {

                ref[i] = new Book();
                ref[i].read();

            } else {

                ref[i] = new Dvd();
                ref[i].read();

            }
        }

        for (int i = 0; i < ref.length; i++) {
            ref[i].show();
        }

    }
}
