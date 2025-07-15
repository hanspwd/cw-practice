public class ScoreChallenge {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        boolean result = false;
        int average = 0;

        int lengthClass = classPoints.length;
        for (int i = 0; i < lengthClass; i++) {
                int aux = classPoints[i];
            average += aux;
        }
        average = average / lengthClass;
        return yourPoints > average;
    }

    public static void main(String[] args) {
        int[] arrayPoints = {50, 50, 50};
        System.out.println(betterThanAverage(arrayPoints, 50));

    }
}