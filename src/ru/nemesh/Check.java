package ru.nemesh;

public class Check {
    public static int getHownum(String input) throws Exception {
        boolean resultNumeric = Numeric(input);

        if (resultNumeric == (true)) {
            int b = Integer.parseInt(input);
            boolean c = NegativeNumber(Integer.parseInt(input));
            if (c == true) {
                throw new NegativeException("Число должно быть положительным!!!");
            } else
                return b;
//        } else {
//            if (resultNumeric == (false)) ;
//            return checkRom(a);
        }
        return 0;
    }

    public static boolean Numeric(String a) {
        try {
            Double.parseDouble(a);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }


    private static boolean NegativeNumber(int a) {

        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }
}
