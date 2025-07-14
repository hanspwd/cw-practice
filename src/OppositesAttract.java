public class OppositesAttract {

    public static boolean isLove(final int flower1, final int flower2) {

        boolean res = false;

        if (flower1 % 2 == 0 && flower2 % 2 == 1) {
            res = true;
        } else if (flower2 % 2 == 0 && flower1 % 2 == 1) {
            res = true;
        }
        
        return res;
    }

}