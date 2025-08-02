/*
*
* */

public class HappyBirthday {
    public static String womensAge(int n) {
        int base = 0;
        int happyAge;

        if (n >= 21) {
            base = n / 2;
        }

        if (n % 2 == 0) {
            happyAge = 20;
        } else {
            happyAge = 21;
        }

        return n + "? That's just " + happyAge + ", in base " + base + "!";
    }
    public static void main(String[] args) {
        System.out.println(womensAge(32));
    }
}