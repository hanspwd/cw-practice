public class CreatePhoneNumber {
    public static String createPhoneNumber(int[] numbers) {

        StringBuilder
                fpart = new StringBuilder(),
                spart = new StringBuilder(),
                tpart = new StringBuilder();

        for (int i = 0; i < 3; i++) {
            fpart.append((numbers[i]));
        }
        for (int i = 3; i < 6; i++) {
            spart.append((numbers[i]));
        }
        for (int i = 6; i < 10; i++) {
            tpart.append((numbers[i]));
        }

        return String.format("(%s) %s-%s", fpart, spart, tpart);
    }

    public static void main(String[] args) {
        String numero = createPhoneNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0});
        System.out.println(numero);
    }
}
