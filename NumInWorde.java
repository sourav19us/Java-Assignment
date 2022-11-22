public class NumInWorde {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int a, b, c, d, Num;
        Num = (int) (Math.random() * 10000);
        a = Num / 1000;
        b = (Num / 100) - (a * 10);
        c = Num / 10 - ((a * 100) + (b * 10));
        d = Num - ((a * 1000) + (b * 100) + (c * 10));
        System.out.println("Digits are from Right to Left");
        System.out.println("1st digit = " + a + " ,2nd digit = " + b + " ,3rd digit = " + c + " ,4th digit = " + d);
        System.out.println("Num is = " + Num);
        switch (a) {
            case 0:
                break;
            case 1:
                System.out.print("one thousand ");
                break;
            case 2:
                System.out.print("Two thousand ");
                break;
            case 3:
                System.out.print("Three thousand ");
                break;
            case 4:
                System.out.print("Four thousand ");
                break;
            case 5:
                System.out.print("Five thousand ");
                break;
            case 6:
                System.out.print("Six thousand ");
                break;
            case 7:
                System.out.print("Seven thousand ");
                break;
            case 8:
                System.out.print("Eight thousand ");
                break;
            case 9:
                System.out.print("Nine thousand ");
                break;

            default:
                break;
        }
        switch (b) {
            case 0:
                break;
            case 1:
                System.out.print("one hundred ");
                break;
            case 2:
                System.out.print("Two hundred ");
                break;
            case 3:
                System.out.print("Three hundred ");
                break;
            case 4:
                System.out.print("Four hundred ");
                break;
            case 5:
                System.out.print("Five hundred ");
                break;
            case 6:
                System.out.print("Six hundred ");
                break;
            case 7:
                System.out.print("Seven hundred ");
                break;
            case 8:
                System.out.print("Eight hundred ");
                break;
            case 9:
                System.out.print("Nine hundred ");
                break;

            default:
                break;
        }
        // if 4th digit d is Zero and 3rd digit is not Zero
        if (d == 0) {

            if (c != 0) {

                switch (c) {
                    case 0:
                        break;
                    case 1:
                        System.out.print("Ten ");
                        break;
                    case 2:
                        System.out.print("Twenty ");
                        break;
                    case 3:
                        System.out.print("Thirty ");
                        break;
                    case 4:
                        System.out.print("Forty ");
                        break;
                    case 5:
                        System.out.print("Fifty ");
                        break;
                    case 6:

                        System.out.print("Sixty ");
                        break;
                    case 7:
                        System.out.print("Seventy ");
                        break;
                    case 8:
                        System.out.print("Eighty ");
                        break;
                    case 9:
                        System.out.print("Ninety ");
                        break;

                    default:
                        break;
                }
            }
        }
        // if 3rd digit is 1 and 4th digit is not Zero
        if (c == 1) {
            if (d != 0) {

                switch (d) {
                    case 0:
                        break;
                    case 1:
                        System.out.print("Eleven ");
                        break;
                    case 2:
                        System.out.print("Twelve ");
                        break;
                    case 3:
                        System.out.print("Thirteen ");
                        break;
                    case 4:
                        System.out.print("Fourtenn ");
                        break;
                    case 5:
                        System.out.print("Fifteen ");
                        break;
                    case 6:
                        System.out.print("Sixtenn ");
                        break;
                    case 7:
                        System.out.print("Seventeen ");
                        break;
                    case 8:
                        System.out.print("Eighteen ");
                        break;
                    case 9:
                        System.out.print("Ninteen ");
                        break;

                    default:
                        break;
                }
            }

        }
        // if 3rd digit is zero but 4th digit is not Zero
        if (c == 0) {
            if (d != 0) {

                switch (d) {
                    case 0:
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
        // if 4th and 3rd digit are not Zero
        if (d != 0) {

            if (c != 0) {
                // if 3rd digit is 2 and 4th digit is not zero
                if (c == 2) {
                    System.out.print("Twenty ");
                }
                // if 3rd digit is 3 and 4th digit is not zero
                if (c == 3) {
                    System.out.print("Thirty ");
                }
                // if 3rd digit is 4 and 4th digit is not zero
                if (c == 4) {
                    System.out.print("Fourty ");
                }
                // if 3rd digit is 5 and 4th digit is not zero
                if (c == 5) {
                    System.out.print("Fifty ");
                }
                // if 3rd digit is 6 and 4th digit is not zero
                if (c == 6) {
                    System.out.print("Sixty ");
                }
                // if 3rd digit is 7 and 4th digit is not zero
                if (c == 7) {
                    System.out.print("Seventy ");
                }
                // if 3rd digit is 8 and 4th digit is not zero
                if (c == 8) {
                    System.out.print("Eighty ");
                }
                // if 3rd digit is 9 and 4th digit is not zero
                if (c == 9) {
                    System.out.print("Ninty ");
                }
                switch (d) {
                    case 0:
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

    }
}
/*
 * Second Method for last tow Digit
 * // if 3rd digit is 2 and 4th digit is not zero
 * if (c == 2) {
 * System.out.print("Twenty ");
 * switch (d) {
 * case 0:
 * break;
 * case 1:
 * System.out.print("one ");
 * break;
 * case 2:
 * System.out.print("Two ");
 * break;
 * case 3:
 * System.out.print("Three ");
 * break;
 * case 4:
 * System.out.print("Four ");
 * break;
 * case 5:
 * System.out.print("Five");
 * break;
 * case 6:
 * System.out.print("Six ");
 * break;
 * case 7:
 * System.out.print("Seven ");
 * break;
 * case 8:
 * System.out.print("Eight ");
 * break;
 * case 9:
 * System.out.print("Nine ");
 * break;
 * 
 * default:
 * break;
 * }
 * }
 * // if 3rd digit is 3 and 4th digit is not zero
 * if (c == 3) {
 * System.out.print("Thirty ");
 * switch (d) {
 * case 0:
 * break;
 * case 1:
 * System.out.print("one ");
 * break;
 * case 2:
 * System.out.print("Two ");
 * break;
 * case 3:
 * System.out.print("Three ");
 * break;
 * case 4:
 * System.out.print("Four ");
 * break;
 * case 5:
 * System.out.print("Five");
 * break;
 * case 6:
 * System.out.print("Six ");
 * break;
 * case 7:
 * System.out.print("Seven ");
 * break;
 * case 8:
 * System.out.print("Eight ");
 * break;
 * case 9:
 * System.out.print("Nine ");
 * break;
 * 
 * default:
 * break;
 * }
 * }
 * // if 3rd digit is 4 and 4th digit is not zero
 * if (c == 4) {
 * System.out.print("Tourty ");
 * switch (d) {
 * case 0:
 * break;
 * case 1:
 * System.out.print("one ");
 * break;
 * case 2:
 * System.out.print("Two ");
 * break;
 * case 3:
 * System.out.print("Three ");
 * break;
 * case 4:
 * System.out.print("Four ");
 * break;
 * case 5:
 * System.out.print("Five");
 * break;
 * case 6:
 * System.out.print("Six ");
 * break;
 * case 7:
 * System.out.print("Seven ");
 * break;
 * case 8:
 * System.out.print("Eight ");
 * break;
 * case 9:
 * System.out.print("Nine ");
 * break;
 * 
 * default:
 * break;
 * }
 * }
 * // if 3rd digit is 5 and 4th digit is not zero
 * if (c == 5) {
 * System.out.print("Fifty ");
 * switch (d) {
 * case 0:
 * break;
 * case 1:
 * System.out.print("one ");
 * break;
 * case 2:
 * System.out.print("Two ");
 * break;
 * case 3:
 * System.out.print("Three ");
 * break;
 * case 4:
 * System.out.print("Four ");
 * break;
 * case 5:
 * System.out.print("Five");
 * break;
 * case 6:
 * System.out.print("Six ");
 * break;
 * case 7:
 * System.out.print("Seven ");
 * break;
 * case 8:
 * System.out.print("Eight ");
 * break;
 * case 9:
 * System.out.print("Nine ");
 * break;
 * 
 * default:
 * break;
 * }
 * }
 * // if 3rd digit is 6 and 4th digit is not zero
 * if (c == 6) {
 * System.out.print("Sixty ");
 * switch (d) {
 * case 0:
 * break;
 * case 1:
 * System.out.print("one ");
 * break;
 * case 2:
 * System.out.print("Two ");
 * break;
 * case 3:
 * System.out.print("Three ");
 * break;
 * case 4:
 * System.out.print("Four ");
 * break;
 * case 5:
 * System.out.print("Five");
 * break;
 * case 6:
 * System.out.print("Six ");
 * break;
 * case 7:
 * System.out.print("Seven ");
 * break;
 * case 8:
 * System.out.print("Eight ");
 * break;
 * case 9:
 * System.out.print("Nine ");
 * break;
 * 
 * default:
 * break;
 * }
 * }
 * // if 3rd digit is 7 and 4th digit is not zero
 * if (c == 7) {
 * System.out.print("Seventy ");
 * switch (d) {
 * case 0:
 * break;
 * case 1:
 * System.out.print("one ");
 * break;
 * case 2:
 * System.out.print("Two ");
 * break;
 * case 3:
 * System.out.print("Three ");
 * break;
 * case 4:
 * System.out.print("Four ");
 * break;
 * case 5:
 * System.out.print("Five");
 * break;
 * case 6:
 * System.out.print("Six ");
 * break;
 * case 7:
 * System.out.print("Seven ");
 * break;
 * case 8:
 * System.out.print("Eight ");
 * break;
 * case 9:
 * System.out.print("Nine ");
 * break;
 * 
 * default:
 * break;
 * }
 * }
 * // if 3rd digit is 8 and 4th digit is not zero
 * if (c == 8) {
 * System.out.print("Eighty ");
 * switch (d) {
 * case 0:
 * break;
 * case 1:
 * System.out.print("one ");
 * break;
 * case 2:
 * System.out.print("Two ");
 * break;
 * case 3:
 * System.out.print("Three ");
 * break;
 * case 4:
 * System.out.print("Four ");
 * break;
 * case 5:
 * System.out.print("Five");
 * break;
 * case 6:
 * System.out.print("Six ");
 * break;
 * case 7:
 * System.out.print("Seven ");
 * break;
 * case 8:
 * System.out.print("Eight ");
 * break;
 * case 9:
 * System.out.print("Nine ");
 * break;
 * 
 * default:
 * break;
 * }
 * }
 * // // if 3rd digit is 9 and 4th digit is not zero
 * if (c == 9) {
 * System.out.print("Ninty ");
 * switch (d) {
 * case 0:
 * break;
 * case 1:
 * System.out.print("one ");
 * break;
 * case 2:
 * System.out.print("Two ");
 * break;
 * case 3:
 * System.out.print("Three ");
 * break;
 * case 4:
 * System.out.print("Four ");
 * break;
 * case 5:
 * System.out.print("Five");
 * break;
 * case 6:
 * System.out.print("Six ");
 * break;
 * case 7:
 * System.out.print("Seven ");
 * break;
 * case 8:
 * System.out.print("Eight ");
 * break;
 * case 9:
 * System.out.print("Nine ");
 * break;
 * 
 * default:
 * break;
 * }
 * }
 */