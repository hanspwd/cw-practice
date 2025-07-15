public class StringRepeat {
    public static String repeatStr(final int repeat, final String string) {
        StringBuilder msg = new StringBuilder();

        for (int i = 0; i < repeat; i++) {
            msg.append(string);
        }
        return msg.toString();
    }

    public static void main(String[] args) {
        System.out.println(repeatStr(10, "540"));
    }
}
