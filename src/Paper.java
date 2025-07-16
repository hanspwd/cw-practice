public class Paper
{
    public static int paperWork(int n, int m)
    {
        //Happy Coding! ^_^

        if (n < 0) {
            return m = 0;
    }
        if (m < 0) {
            return n = 0;
        }
        return n * m;
    }

    public static void main(String[] args) {

        System.out.println(paperWork(-5,2));

    }

}