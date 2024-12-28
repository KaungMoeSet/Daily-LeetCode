public class TakeGiftsFromRichestPile {

    private static long pickGifts(int[] gifts, int k) {
        long result = 0;
        for (int i = 1; i <= k; i++) {
            int max = gifts[0];
            int maxIndex = 0;
            for (int j = 1; j < gifts.length; j++) {
                if (gifts[j] > max) {
                    max = gifts[j];
                    maxIndex = j;
                }
            }
            double maxfloor = Math.floor(Math.sqrt(max));
            gifts[maxIndex] = (int) maxfloor;
        }
        for (int gift : gifts) {
            result += gift;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] gifts = {25, 64, 9, 4, 100};
        int k = 4;
        System.out.println(pickGifts(gifts, k));
    }
}
