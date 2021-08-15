public class Booleans {
    public static void main(String[] args) {
        System.out.println("true is " + true);
        System.out.println("false is " + false);
        System.out.println("10 == 10 is " + (10 == 10));
        System.out.println("4 != 4.4 is " + (4 != 4.4));
        System.out.println("5 < 6 is " + (5 < 6));
        System.out.println("2 > 7 is " + (2 > 7));
        System.out.println("3 >= 3 is " + (3 >= 3));
        System.out.println("20 <= 40 is " + (20 <= 40));
        System.out.println("\"89\".length() > 9 is " + ("89".length() > 9));
        /*  Below Boolean.parseBoolean("TrUE")
            tries to make sense of 'TrUE' and
            interprets it as the boolean value
            of 'true' as long as 'true' can be
            found. If 'true' cannot be found
            then 'false' will be returned.
        */
        System.out.println("Boolean.parseBoolean(\"TrUE\") is " + Boolean.parseBoolean("TrUE"));
        System.out.println("Boolean.parseBoolean(\"false\") is " + Boolean.parseBoolean("false"));
        System.out.println("Boolean.parseBoolean(\"This will show up as false\") is " + Boolean.parseBoolean("This will show up as false"));

    }
}
