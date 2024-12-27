public class BestSightSeeingPair {

    private static int maxScoreSightseeingPair(int[] values) {
        int max = 0;
        int max_i = values[0];
        for (int j = 1; j < values.length; j++) {
            max = Math.max(max, max_i + values[j] - j);
            max_i = Math.max(max_i, values[j] + j);
        }
        return max;
    }

//    // Brute force
//    private static int maxScoreSightseeingPair(int[] values) {
//        int max = 0;
//        for (int i = 0; i < values.length; i++) {
//            for (int j = i + 1; j < values.length; j++) {
//                max = Math.max(max, values[i] + values[j] + i - j);
//            }
//        }
//        return max;
//    }

    public static void main(String[] args) {
        int[] values = {8, 1, 5, 2, 6, 7, 3};
        System.out.println(maxScoreSightseeingPair(values));
    }
}
